import yfinance as yf
import pandas as pd
import time
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import os

# Configuração do servidor de e-mail
smtp_server = 'smtp.gmail.com'  # Exemplo: Gmail
smtp_port = 587
email_user = 'hugotwin4@gmail.com'  # Seu endereço de e-mail
email_password = '' # Sua senha de e-mail

recipient_email = 'hugotwin@live.com.pt'  # E-mail do destinatário

# Função para enviar e-mail
def send_email(subject, body):
    try:
        msg = MIMEMultipart()
        msg['From'] = email_user
        msg['To'] = recipient_email
        msg['Subject'] = subject

        msg.attach(MIMEText(body, 'plain'))

        server = smtplib.SMTP(smtp_server, smtp_port)
        server.starttls()
        server.login(email_user, email_password)
        text = msg.as_string()
        server.sendmail(email_user, recipient_email, text)
        server.quit()

        print(f'E-mail enviado: {subject}')
    except Exception as e:
        print(f'Erro ao enviar e-mail: {e}')

# Função para obter dados de mercado
def get_market_data(ticker, period='1d', interval='1m'):
    df = yf.download(ticker, period=period, interval=interval)
    return df

# Função para calcular a média móvel simples
def calculate_sma(data, window):
    return data['Close'].rolling(window=window).mean()

# Parâmetros de configuração
ticker = 'NVD.DE'
sma_window = 21 # Janela da média móvel
threshold = 0.002# Percentual de desvio do preço em relação à média

# Função principal de trading
def trading_bot():
    last_buy_notification = None
    last_sell_notification = None
    notification_interval = 180  # 1 hora

    while True:
        try:
            # Obter dados de mercado
            data = get_market_data(ticker)

            # Calcular a média móvel
            data['SMA'] = calculate_sma(data, sma_window)

            # Obter o preço atual e a média móvel
            current_price = data['Close'].iloc[-1]
            current_sma = data['SMA'].iloc[-1]
            print((current_price / current_sma) * 100)

            current_time = time.time()

            # Implementar lógica de reversão à média e enviar notificações
            if current_price < current_sma * (1 - 0.004):
                if not last_buy_notification or current_time - last_buy_notification > notification_interval:
                    # Enviar notificação de compra
                    subject = f"Recomendação de Compra para {ticker}"
                    body = f"O preço atual de {ticker} ({current_price}) está significativamente abaixo da média móvel BOOT 2 ({current_sma}). Considere comprar."
                    send_email(subject, body)
                    last_buy_notification = current_time
                    print(f'Aviso de compra enviado: {current_price}')

            elif current_price > current_sma * (1 + 0.004):
                if not last_sell_notification or current_time - last_sell_notification > notification_interval:
                    # Enviar notificação de venda
                    subject = f"Recomendação de Venda para {ticker}"
                    body = f"O preço atual de {ticker} ({current_price}) está significativamente acima da média móvel BOOT2 ({current_sma}). Considere vender."
                    send_email(subject, body)
                    last_sell_notification = current_time
                    print(f'Aviso de venda enviado: {current_price}')

            # Aguardar um minuto antes da próxima iteração
            time.sleep(60)

        except Exception as e:
            print(f'Erro: {e}')
            time.sleep(60)

# Executar o bot de trading
if __name__ == '__main__':
    trading_bot()