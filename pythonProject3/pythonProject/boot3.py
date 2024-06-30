import yfinance as yf
import pandas as pd
import numpy as np


# Função para obter dados de mercado
def get_market_data(ticker, start, end, interval='1d'):
    df = yf.download(ticker, start=start, end=end, interval=interval)
    return df


# Função para calcular a média móvel simples
def calculate_sma(data, window):
    return data['Close'].rolling(window=window).mean()


# Função para calcular o RSI
def calculate_rsi(data, window=14):
    delta = data['Close'].diff()
    gain = delta.where(delta > 0, 0)
    loss = -delta.where(delta < 0, 0)

    avg_gain = gain.rolling(window=window, min_periods=1).mean()
    avg_loss = loss.rolling(window=window, min_periods=1).mean()

    rs = avg_gain / avg_loss
    rsi = 100 - (100 / (1 + rs))

    return rsi


# Função para executar o backtest
def backtest(data, sma_window, threshold):
    data['SMA'] = calculate_sma(data, sma_window)
    data['RSI'] = calculate_rsi(data)

    data['Signal'] = 0
    data.loc[(data['Close'] < data['SMA'] * (1 - threshold)) & (data['RSI'] < 30), 'Signal'] = 1  # Buy signal
    data.loc[(data['Close'] > data['SMA'] * (1 + threshold)) & (data['RSI'] > 70), 'Signal'] = -1  # Sell signal

    data['Position'] = data['Signal'].shift()
    data['Return'] = data['Close'].pct_change()
    data['Strategy_Return'] = data['Position'] * data['Return']

    data['Cumulative_Return'] = (1 + data['Strategy_Return']).cumprod() - 1
    return data


# Parâmetros de configuração
tickers = ['NVD.DE', 'NVDA']
start_date = '2024-03-02'
end_date = '2024-06-14'
sma_windows = [10, 20, 30, 50, 21, 9,8, 7]
thresholds = [0.005, 0.01, 0.02, 0.0040]

# Executar o backtest para diferentes combinações de parâmetros
results = []

for ticker in tickers:
    market_data = get_market_data(ticker, start=start_date, end=end_date)

    for sma_window in sma_windows:
        for threshold in thresholds:
            backtest_result = backtest(market_data.copy(), sma_window, threshold)
            final_return = backtest_result['Cumulative_Return'].iloc[-1]
            results.append((ticker, sma_window, threshold, final_return))

# Criar um DataFrame com os resultados
results_df = pd.DataFrame(results, columns=['Ticker', 'SMA_Window', 'Threshold', 'Final_Return'])

# Encontrar a melhor configuração para cada ticker
print(results_df)
best_results = results_df.loc[results_df.groupby('Ticker')['Final_Return'].idxmax()]

print(best_results)