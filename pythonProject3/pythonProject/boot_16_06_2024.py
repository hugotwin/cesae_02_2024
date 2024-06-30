import yfinance as yf
import pandas as pd
import time
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

# Configuração do servidor de e-mail
smtp_server = 'smtp.gmail.com'
smtp_port = 587
email_user = 'hugotwin4@gmail.com'
email_password = 'yjjf egkg crqw pbey'
recipient_email = 'hugotwin@live.com.pt'


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
    #print(df)
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


# Parâmetros de configuração
tickers = ['NVD.DE', 'NVDA', 'MSF.DE']  # Adicione mais tickers conforme necessário
sma_window = 10
threshold = 0.004 # Ajustado para 1%
rsi_window = 14
rsi_overbought = 70
rsi_oversold = 30


# Função principal de trading
def trading_bot():
    last_buy_notification = {ticker: None for ticker in tickers}
    last_sell_notification = {ticker: None for ticker in tickers}
    notification_interval = 200  # 1 hora

    while True:
        try:
            for ticker in tickers:
                # Obter dados de mercado
                data = get_market_data(ticker)

                # Calcular a média móvel e o RSI
                data['SMA'] = calculate_sma(data, sma_window)
                data['RSI'] = calculate_rsi(data, rsi_window)

                # Obter o preço atual, a média móvel e o RSI
                current_price = data['Close'].iloc[-1]
                current_sma = data['SMA'].iloc[-1]
                current_rsi = data['RSI'].iloc[-1]

                current_time = time.time()

                # Implementar lógica de reversão à média e enviar notificações
                if current_price < current_sma * (1 - threshold) and current_rsi < rsi_oversold:
                    if not last_buy_notification[ticker] or current_time - last_buy_notification[
                        ticker] > notification_interval:
                        subject = f"Recomendação de Compra para {ticker}"
                        body = (
                            f"O preço atual de {ticker} ({current_price}) está significativamente abaixo da média móvel boot3 ({current_sma}) "
                            f"e o RSI é {current_rsi} (sobrevendido). Considere comprar.")
                        send_email(subject, body)
                        last_buy_notification[ticker] = current_time
                        print(f'Aviso de compra enviado para {ticker}: {current_price}')

                elif current_price > current_sma * (1 + threshold-0.002) and current_rsi > rsi_overbought:
                    if not last_sell_notification[ticker] or current_time - last_sell_notification[
                        ticker] > notification_interval:
                        subject = f"Recomendação de Venda para {ticker}"
                        body = (
                            f"O preço atual de {ticker} ({current_price}) está significativamente acima da média móvel boot3 ({current_sma}) "
                            f"e o RSI é {current_rsi} (sobrecomprado). Considere vender.")
                        send_email(subject, body)
                        last_sell_notification[ticker] = current_time
                        print(f'Aviso de venda enviado para {ticker}: {current_price}')

                elif current_price < current_sma * (1 - threshold + 0.002) and current_rsi < rsi_oversold:
                    if not last_buy_notification[ticker] or current_time - last_buy_notification[
                        ticker] > notification_interval:
                        subject = f"Recomendação de Compra para {ticker}"
                        body = (
                            f"O preço atual de {ticker} ({current_price}) o valor esta a baixar pense em vender boot3 ({current_sma}) "
                            f"e o RSI é {current_rsi} (sobrevendido). Considere vender.")
                        send_email(subject, body)
                        last_buy_notification[ticker] = current_time
                        print(f'Aviso de compra enviado para {ticker}: {current_price}')



            time.sleep(60)

        except Exception as e:
            print(f'Erro: {e}')
            time.sleep(60)


if __name__ == '__main__':
    trading_bot()