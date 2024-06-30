import ligacao

con = ligacao.liga()
if con == None: #erro ao tentar fazer a conexão
    print("Erro ao conectar o servidor.\n"
          "Verifique as ligações ao servidor ou as credenciais... ")
else:
    #con.connect(database="loja")
    sql = """use loja;
             create table if not exists utilizador(
	           id int primary key auto_increment,
	           nome varchar(50),
	           senha varchar(300)
	         );"""
    cursor = con.cursor()
    cursor.execute(sql)

    cursor.close()
    con.close()