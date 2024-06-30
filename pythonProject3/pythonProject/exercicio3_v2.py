import conexao


con = conexao.liga()

if con == None:
    print("verifica as ligaçoes")

else:
    nomebd = input("qual o nome da base de dados")


    sql = f"show databases;"

    cursor = con.cursor()
    cursor.execute(sql)
    #print(cursor.fetchall())

    lista = []
    for i in  cursor.fetchall():
        nome = i[0]
        lista.append(nome)

    if (nomebd in lista):
        print(" já inserido")








