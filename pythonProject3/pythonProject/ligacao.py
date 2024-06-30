import mysql.connector as my

def liga():
    try:  #tentar criar a conexao
        conexao = my.connect(host="127.0.0.1", username="root", password="")
        return conexao
    except:
        return None

