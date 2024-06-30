import ligacao

con = ligacao.liga()
if con == None: #erro ao tentar fazer a conexão
    print("Erro ao conectar o servidor.\n"
          "Verifique as ligações ao servidor ou as credenciais... ")
else:
    user = input("Escreva o seu nome: ")
    passwd = input("Escreva a sua password: ")

    con.connect(database="loja")
    sql = f"""
             insert into utilizador(username,password) 
             values ('{user}','{passwd}');"""

    cursor = con.cursor()
    cursor.execute(sql)

    con.commit() #pede para gravar os dados na BD através da conexão CON


    cursor.close()
    con.close()