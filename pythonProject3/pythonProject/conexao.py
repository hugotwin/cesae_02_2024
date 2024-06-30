import mysql.connector as con

def liga():

        try:

            conexao = con.connect(host="127.0.0.1", username = "root", password="")

            return conexao
        except:

            return None

