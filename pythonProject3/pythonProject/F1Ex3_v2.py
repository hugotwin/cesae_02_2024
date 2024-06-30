import ligacao  #importar a referência para a conexao
con = ligacao.liga() #retorna None se nao conseguir ligar
                     # caso contrário retorna o apontador para a conexao

if con == None:
    print("Verifique as ligações ao servidor ou as credenciais...")
else:
    nomebd = input("Qual o nome da Base de Dados? ")
    #Será que o nome em "nomebd" existe no servidor?

    #obter listagem de todas as BDs existentes
    sql = "show databases;"
    cursor = con.cursor()  #criar canal de comunicação com o server
    cursor.execute(sql)  #executa a query
    resp = cursor.fetchall() #[(nome1,) , (nome2,) , (nome3,) ,  ....,  (nomeN,)]
    print(f"RESPOSTA FETCHALL É: {resp}")

    listanomes = []  #construir uma so com nomes das BDs
    for elem in resp: #  ('1106olamundo',) .... ('cinel2',) ..... ('exe1',),
        nome = elem[0] #'1106olamundo'
        listanomes.append(nome)  #adiciona à lista o nome que acabou de descobrir


    #verificar se o nome dado pelo user já está na listagem
    if nomebd in listanomes:
        #Se sim, dá msg a dizer que já existe
        print("Base de dados existente")
    else:
        #senão --- create database....
        sql = f"create database {nomebd}; "
        cursor = con.cursor()
        cursor.execute(sql)
        print(f"{nomebd} foi criado com sucesso")


con.close()
