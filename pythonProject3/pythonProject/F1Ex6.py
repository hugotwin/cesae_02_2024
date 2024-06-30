from tkinter import *
from tkinter import ttk #para ter acesso à combobox
from ligacao import liga
from tkinter.messagebox import *

con = liga()
if con == None: #erro ao tentar fazer a conexão
    showerror("Erro na ligação", "Erro ao conectar o servidor.\n"
                                "Verifique as ligações ao servidor ou as credenciais... ")

else: #Conexão establecida com sucesso
    fonte = ("Arial",14,"bold")

    jan1 = Tk() #janela que pede o nome da BD
    jan1.geometry("300x300")
    jan1.title("Criar base de dados...")
    #Rótulo
    texto = Label(jan1, text="Nome da base de dados:", font=fonte)
    #Entry
    enomebd = Entry(jan1, font=fonte)
    enomebd.focus() #coloca cursor do teclado dentro da entry
    #Botão
    def criar_bd():
        nome = enomebd.get() #ler o nome escrito na entry
        sql = f"create database if not exists {nome};"  #tentar criar a bd no servidor
        cursor = con.cursor()
        cursor.execute(sql)

        ##Interface 2
        # obter listagem de todas as BDs existentes
        sql = "show databases;"
        cursor.execute(sql)  # executa a query
        resp = cursor.fetchall()  # [(nome1,) , (nome2,) , (nome3,) ,  ....,  (nomeN,)]
        print(resp)
        listanomes = []  # construir uma so com nomes das BDs
        for elem in resp:  # ('1106olamundo',) .... ('cinel2',) ..... ('exe1',),
            nome = elem[0]  # '1106olamundo'
            listanomes.append(nome)  # adiciona à lista o nome que acabou de descobrir

        jan2 = Toplevel() #existe dependência da jan1 = Tk()
        jan2.title("Criar tabela")
        jan2.geometry("400x400")
        label1 = Label(jan2, text = "Selecione uma base de dados", font = fonte)
        combo = ttk.Combobox(jan2, font = fonte, values = listanomes)
        label2 = Label(jan2, text="Tabela com a sguinte estrutura", font = fonte)
        label3 = Label(jan2, text="ID, numeração automática\n"
                                  "Nome, do tipo texto\n"
                                  "Senha, do tipo texto")
        def criar_tab():
            #ler o nome da bd da combobox
            nomebd = combo.get()

            sql = f"""use {nomebd};
                      create table if not exists utilizador(
                      id int primary key auto_increment,
                      nome varchar(50),
                      senha varchar(300)
                      );"""
            print(sql)
            cursor.execute(sql)
            showinfo("Informação", "Tabela criada com sucesso")
            jan1.destroy()

        bcriar = Button(jan2, text="Criar tabela", command=criar_tab)
        label1.pack()
        combo.pack()
        label2.pack()
        label3.pack()
        bcriar.pack()

        jan2.mainloop()

    botao = Button(jan1, text="Criar BD", font=fonte, command=criar_bd)

    #mostrar objetos graficos no contentor JAN1
    texto.pack()
    enomebd.pack()
    botao.pack()

    jan1.mainloop()