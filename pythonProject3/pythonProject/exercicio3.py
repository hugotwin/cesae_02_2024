import conexao


con = conexao.liga()

if con == None:
    print("verifica as ligaçoes")

else:
    nomebd = input("qual o nome da base de dados")

    sql = f"create database if not exists {nomebd}"
    cursor = con.cursor()
    cursor.execute(sql)
    print(cursor.fetchone())




