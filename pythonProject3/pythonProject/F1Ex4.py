from tkinter import *
from tkinter.ttk import * #para ter acesso à combobox
from ligacao import liga
from tkinter.messagebox import *

con = liga()
if con == None: #erro ao tentar fazer a conexão
    showinfo("Erro na ligação", "erro ao conectar o servidor.\n"
                                "Verifique as ligações ao servidor ou as credenciais... ")

else: #Conexão establecida com sucesso

    #obter listagem das BDs
    listabds = []
    #ligar ao servidor e obter fetchall [(nome1,), (nome2,), ...]
    cursor = con.cursor()
    sql = "show databases;"
    cursor.execute(sql)
    resp = cursor.fetchall() #obter todas as respostas do servidor
    for elem in resp: #para cada tuplo da lista, filtrar apenas os nomes nome1[0]
        listabds.append(elem[0])

    ###Interface gráfica
    jan = Tk()
    jan.geometry("200x200")
    jan.title("Ligação a bases de dados")
    combo = Combobox(jan, values = listabds)
    combo.pack()

    jan.mainloop()
