import mysql.connector as my   #instalar mysql-connector-python

try:
    conexao = my.connect(host='localhost', database='reciclagem',
                         user='jmagalhaes', password='12345678')

    canal = conexao.cursor() #.cursor() permite criar o canal para passagem de dados
    sql = "show databases;"
    canal.execute(sql)
    resp = canal.fetchall() #obtém lista de respostas da query sql

    print(f"Nome das BDs:")

    for elem in resp[0:len(resp)-1]:
        print(elem[0], end=',') #escreve na horizontal separado por virgula (exceto o último nome)
    print(resp[-1][0]) #escreve último nome. está fora do ciclo para não ter a virgula no final

except:
    print("Verifique conexões ao servidor de SQL ou as credenciais")