import yfinance as yf
import pandas as pd
import numpy as np
import os
import logging

# Configuração de logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger()

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
    gain = (delta.where(delta > 0, 0)).rolling(window=window).mean()
    loss = (-delta.where(delta < 0, 0)).rolling(window=window).mean()
    rs = gain / loss
    rsi = 100 - (100 / (1 + rs))
    return rsi

# Função para calcular o MACD
def calculate_macd(data, short_window=12, long_window=26, signal_window=9):
    short_ema = data['Close'].ewm(span=short_window, adjust=False).mean()
    long_ema = data['Close'].ewm(span=long_window, adjust=False).mean()
    macd = short_ema - long_ema
    signal_line = macd.ewm(span=signal_window, adjust=False).mean()
    return macd, signal_line

# Função para calcular as Bandas de Bollinger
def calculate_bollinger_bands(data, window=20, num_std_dev=2):
    sma = calculate_sma(data, window)
    rolling_std = data['Close'].rolling(window=window).std()
    upper_band = sma + (rolling_std * num_std_dev)
    lower_band = sma - (rolling_std * num_std_dev)
    return upper_band, lower_band

# Parâmetros de configuração
ticker = 'NVD.DE'
sma_window = 21  # Janela da média móvel
rsi_window = 14  # Janela do RSI
macd_short_window = 12
macd_long_window = 26
macd_signal_window = 9
bollinger_window = 20
bollinger_num_std_dev = 2
threshold = 0.01  # Percentual de desvio do preço em relação à média
initial_balance = 1000  # Saldo inicial em euros

# Função de simulação de trading
def simulate_trading():
    balance = initial_balance
    positions = 0
    trade_log = []

    # Obter dados históricos de mercado
    start_date = '2020-01-01'
    end_date = '2024-12-31'
    data = get_market_data(ticker, start=start_date, end=end_date)

    # Calcular indicadores
    data['SMA'] = calculate_sma(data, sma_window)
    data['RSI'] = calculate_rsi(data, rsi_window)
    data['MACD'], data['Signal_Line'] = calculate_macd(data, macd_short_window, macd_long_window, macd_signal_window)
    data['Upper_Band'], data['Lower_Band'] = calculate_bollinger_bands(data, bollinger_window, bollinger_num_std_dev)

    for i in range(len(data)):
        current_price = data['Close'].iloc[i]
        current_sma = data['SMA'].iloc[i]
        current_rsi = data['RSI'].iloc[i]
        current_macd = data['MACD'].iloc[i]
        current_signal_line = data['Signal_Line'].iloc[i]

        if np.isnan(current_sma) or np.isnan(current_rsi) or np.isnan(current_macd) or np.isnan(current_signal_line):
            continue

        # Lógica de compra
        if current_price < current_sma * (1 - threshold) and current_rsi < 30 and current_macd < current_signal_line:
            if balance >= current_price:
                # Comprar 1 ação
                balance -= current_price
                positions += 1
                trade_log.append((data.index[i], 'buy', current_price))
                logger.info(f'Compra: {current_price} EUR, Saldo: {balance} EUR, Posições: {positions}')

        # Lógica de venda
        elif current_price > current_sma * (1 + threshold) and current_rsi > 70 and current_macd > current_signal_line:
            if positions > 0:
                # Vender 1 ação
                balance += current_price
                positions -= 1
                trade_log.append((data.index[i], 'sell', current_price))
                logger.info(f'Venda: {current_price} EUR, Saldo: {balance} EUR, Posições: {positions}')

    logger.info(f'Saldo final: {balance} EUR, Posições: {positions}')
    return trade_log

# Executar a simulação de trading
if __name__ == '__main__':
    trade_log = simulate_trading()
    print(f'Histórico de trades: {trade_log}')