import tkinter.messagebox
from tkinter import *
from tkinter.ttk import *

import conexao
from conexao import liga
from tkinter.messagebox import *

lista_bd = []


con = liga()
if con == None:
    showinfo("erro na ligacao ", "erro ao ligar ao servidor |n verifique as credenciais")

else:

    cursor = con.cursor()
    cursor.execute("show databases;")

    for i in cursor.fetchall():
        lista_bd.append(i[0])


    jan = Tk()
    jan.geometry("200x200")
    jan.title("ligação as bases de dados")
    combo = Combobox(jan, values=lista_bd)
    combo.pack(pady=20)


jan.mainloop()