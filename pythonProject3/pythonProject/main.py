import mysql.connector as con


try :

    conexao = con.connect(host="127.0.0.1", database ="sitebandas", username = "root", password="")

    if conexao.is_connected():
        sql ="select database();"
        cursor = conexao.cursor() #area  de partilha das bases de dados
        cursor.execute(sql) #executa o pedido de informacao
        resp = cursor.fetchone() #so para obter um tuplo de informacao
        print(resp[0])
        print(f"está ligado a base de dados com o nome {resp[0]}")

except:

    print("verfique as ligações ")










