import mysql.connector as my

try:
    #tentar criar a conexao
    conexao = my.connect(host="127.0.0.1", database="loja",
                         username="root", password="")

    if conexao.is_connected(): #se conexão está ativa
        #Qual o nome da Bd em uso?
        sql = "select database();"
        cursor = conexao.cursor() #área de partilha de dados
        cursor.execute(sql) #pede para executar a instrução SQL
        resp = cursor.fetchone() #obtém 1 tuplo só com o nome da BD em uso  ("loja",)
        nomebd = resp[0] #só para obtér a string copm o noe da BD
        print(f"Está ligado à base de dados com o nome «{nomebd}»")

        ##resposta ao exercício
        cursor.close()
        conexao.close()

except my.errors.ProgrammingError:
    print("Verifique as ligações ao servidor ou as credenciais...")