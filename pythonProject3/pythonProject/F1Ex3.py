import ligacao  #importar a referência para a conexao

con = ligacao.liga() #retorna None se nao conseguir ligar
                     # caso contrário retorna o apontador para a conexao

if con == None:
    print("Verifique as ligações ao servidor ou as credenciais...")
else:
    nomebd = input("Qual o nome da Base de Dados? ")
    #Será que o nome em "nomebd" existe no servidor?
    sql = f"create database if not exists {nomebd}; "
    cursor = con.cursor()
    cursor.execute(sql)
    print(f"{nomebd} foi criado com sucesso")
    con.close()


