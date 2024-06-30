import yfinance as yf
import pandas as pd
import numpy as np
import time
from twilio.rest import Client

# Configuração do Twilio

account_sid = ''
auth_token = ''
twilio_whatsapp_number = 'whatsapp:+18455168839'
recipient_whatsapp_number = 'whatsapp:+351915146642'  # Seu número de WhatsApp

client = Client(account_sid, auth_token)


# Função para enviar mensagem no WhatsApp
def send_whatsapp_message(body):
    message = client.messages.create(
        body=body,
        from_="+18455168839",
        to='+351915146642'
    )
    return message.sid


# Função para obter dados de mercado
def get_market_data(ticker, period='1d', interval='1m'):
    df = yf.download(ticker, period=period, interval=interval)
    return df


# Função para calcular a média móvel simples
def calculate_sma(data, window):
    return data['Close'].rolling(window=window).mean()


# Parâmetros de configuração
ticker = 'NVD.DE'
sma_window = 21  # Janela da média móvel
threshold = 0.0006 #Percentual de desvio do preço em relação à média



# Função principal de trading
def trading_bot():
    while True:
        try:
            # Obter dados de mercado
            data = get_market_data(ticker)


            # Calcular a média móvel
            data['SMA'] = calculate_sma(data, sma_window)

            # Obter o preço atual e a média móvel
            current_price = data['Close'].iloc[-1]
            current_sma = data['SMA'].iloc[-1]
            print((current_price/current_sma)*100)



            # Implementar lógica de reversão à média e enviar notificações
            if current_price < current_sma * (1 - threshold):
                # Enviar notificação de compra
                body = f"O preço atual de {ticker} ({current_price}) está significativamente abaixo da média móvel ({current_sma}). Considere comprar."
                send_whatsapp_message(body)
                print(f'Aviso de compra enviado: {current_price}')

            elif current_price > current_sma * (1 + threshold):
                # Enviar notificação de venda
                body = f"O preço atual de {ticker} ({current_price}) está significativamente acima da média móvel ({current_sma}). Considere vender."
                send_whatsapp_message(body)
                print(f'Aviso de venda enviado: {current_price}')

            # Aguardar um minuto antes da próxima iteração
            time.sleep(60)

        except Exception as e:
            print(f'Erro: {e}')
            time.sleep(60)


# Executar o bot de trading
if __name__ == '__main__':
    trading_bot()