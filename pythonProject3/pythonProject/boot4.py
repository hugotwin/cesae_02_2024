import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

# Configurações do servidor SMTP do Yahoo Mail
smtp_server = 'smtp.mail.yahoo.com'
smtp_port = 587
smtp_username = 'hugotwin@yahoo.com'
smtp_password = '@Maia1004'

# Criando o objeto de servidor SMTP
server = smtplib.SMTP(smtp_server, smtp_port)
server.starttls()  # Habilitando TLS

# Login no servidor SMTP
server.login(smtp_username, smtp_password)

# Preparando o e-mail
msg = MIMEMultipart()
msg['From'] = smtp_username
msg['To'] = 'hugotwin@live.com.pt'
msg['Subject'] = 'Assunto do E-mail'

# Corpo da mensagem
body = 'Este é o corpo da mensagem'
msg.attach(MIMEText(body, 'plain'))

# Enviando o e-mail
server.sendmail(smtp_username, 'destinatario@example.com', msg.as_string())

# Encerrando a conexão com o servidor SMTP
server.quit()