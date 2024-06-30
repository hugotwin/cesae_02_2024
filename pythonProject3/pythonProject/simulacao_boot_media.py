import yfinance as yf
import numpy as np
import time
import os
import logging

# Configuração de logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger()

# Função para obter o preço atual da ação
def get_current_price(ticker):
    data = yf.download(ticker, period='1d', interval='1m')
    return data['Close'].iloc[-1]

# Parâmetros de configuração
ticker = 'PSI'
threshold = 0.05  # Percentual de desvio do preço em relação à média
initial_balance = 1000  # Saldo inicial em euros
buy_amount = 100  # Valor a ser investido em cada compra
sell_amount = 100  # Quantidade de ações a serem vendidas em cada venda
sma_window = 21  # Janela da média móvel

# Função para calcular a média móvel simples
def calculate_sma(prices, window):
    return np.mean(prices[-window:])

# Função principal de simulação de trading
def simulate_trading():
    balance = initial_balance
    sma_values = []

    while True:
        try:
            print(balance)
            # Obter o preço atual da ação
            current_price = get_current_price(ticker)

            # Atualizar a lista de preços para calcular a média móvel
            sma_values.append(current_price)
            if len(sma_values) > sma_window:
                sma_values.pop(0)

            # Calcular a média móvel simples
            sma = calculate_sma(sma_values, sma_window)

            # Tomar decisões de trading com base na média móvel
            if current_price < sma * (1 - threshold):
                if balance >= buy_amount:
                    # Comprar
                    balance -= buy_amount
                    logger.info(f'Compra de {buy_amount} EUR, Preço atual: {current_price}, Média Móvel: {sma}, Saldo: {balance} EUR')
            elif current_price > sma * (1 + threshold):
                if balance >= sell_amount * current_price:
                    # Vender
                    balance += sell_amount * current_price
                    logger.info(f'Venda de {sell_amount} ações, Preço atual: {current_price}, Média Móvel: {sma}, Saldo: {balance} EUR')

            # Aguardar um tempo antes da próxima iteração
            time.sleep(60)


        except Exception as e:
            logger.error(f'Erro: {e}')
            time.sleep(60)

# Executar a simulação de trading
if __name__ == '__main__':
    simulate_trading()