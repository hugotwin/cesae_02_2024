import tkinter as tk
from tkinter import messagebox, ttk
import mysql.connector as my
import hashlib

# Criação do banco de dados e tabelas
def create_database_and_tables():
    try:
        conn = my.connect(
            host='localhost',
            user='root',
            password=''
        )
        cursor = conn.cursor()

        # Crie a base de dados 'stock'
        cursor.execute("CREATE DATABASE IF NOT EXISTS stock")
        cursor.execute("USE stock")

        # Crie a tabela 'artigos'
        cursor.execute("""
            CREATE TABLE IF NOT EXISTS artigos (
                id INT AUTO_INCREMENT PRIMARY KEY,
                nome VARCHAR(255) NOT NULL,
                preco DECIMAL(10, 2) NOT NULL,
                quantidade INT NOT NULL
            )
        """)

        # Crie a tabela 'utilizadores'
        cursor.execute("""
            CREATE TABLE IF NOT EXISTS utilizadores (
                id INT AUTO_INCREMENT PRIMARY KEY,
                nome VARCHAR(255) NOT NULL,
                password VARCHAR(255) NOT NULL,
                tipo_utilizador VARCHAR(50) DEFAULT 'utilizador'
            )
        """)

        # Confirme as mudanças
        conn.commit()
        cursor.close()
        conn.close()

    except Exception as e:
        print(e)
        messagebox.showinfo("Erro", "Erro na ligação a base de dados")

# Função para hashear a senha
def hash_password(password):
    return hashlib.sha256(password.encode()).hexdigest()

# Função para validar o login
def validate_login():
    username = entry_username.get()
    password = entry_password.get()

    # Hashear a senha fornecida
    hashed_password = hash_password(password)

    # Conectar ao banco de dados
    conn = my.connect(host="localhost", user="root", password="", database="stock")
    cursor = conn.cursor()

    # Verificar se o usuário está registrado
    query = "SELECT * FROM utilizadores WHERE nome = %s AND password = %s"
    cursor.execute(query, (username, hashed_password))
    user = cursor.fetchone()

    if user:
        messagebox.showinfo("Login Sucesso", "Login bem-sucedido!")
        if user[3] == 'administrador':  # Verifica se o tipo de utilizador é administrador
            load_admin_interface()
        else:
            load_user_interface()
        login_window.withdraw()  # Esconder a janela de login
    else:
        messagebox.showerror("Erro de Login", "Nome de usuário ou senha incorretos!")

    cursor.close()
    conn.close()





# Função para carregar a interface de administrador
def load_admin_interface():
    admin_window.deiconify()  # Mostrar a janela do administrador
    load_artigos_data()

# Função para carregar a interface de usuário comum
def load_user_interface():
    user_window.deiconify()  # Mostrar a janela do usuário comum

# Função para carregar dados da tabela artigos
def load_artigos_data():
    for row in tree.get_children():
        tree.delete(row)

    # Conectar ao banco de dados
    conn = my.connect(host="localhost", user="root", password="", database="stock")
    cursor = conn.cursor()

    cursor.execute("SELECT * FROM artigos")
    rows = cursor.fetchall()

    for row in rows:
       # print(row)
        tree.insert("", tk.END, values=row)

    cursor.close()
    conn.close()

# Função para inserir um produto
def insert_product():
    nome = entry_nome.get()
    preco = entry_preco.get()
    quantidade = entry_quantidade.get()

    # Conectar ao banco de dados
    conn = my.connect(host="localhost", user="root", password="", database="stock")
    cursor = conn.cursor()

    # Inserir produto na tabela artigos
    query = f"INSERT INTO artigos (nome, preco, quantidade) VALUES ('{nome}', '{preco}', '{quantidade}')"
    print(query)
    cursor.execute(query)

    conn.commit()
    cursor.close()
    conn.close()

    messagebox.showinfo("Sucesso", "Produto inserido com sucesso!")
    load_artigos_data()

# Função para atualizar um produto
def update_product():
    selected_item = tree.selection()[0]
    item = tree.item(selected_item)
    artigo_id = item['values'][0]

    nome = entry_nome.get()
    preco = entry_preco.get()
    quantidade = entry_quantidade.get()

    # Conectar ao banco de dados
    conn = my.connect(host="localhost", user="root", password="", database="stock")
    cursor = conn.cursor()

    # Atualizar produto na tabela artigos
    query = "UPDATE artigos SET nome = %s, preco = %s, quantidade = %s WHERE id = %s"
    cursor.execute(query, (nome, preco, quantidade, artigo_id))

    conn.commit()
    cursor.close()
    conn.close()

    messagebox.showinfo("Sucesso", "Produto atualizado com sucesso!")
    load_artigos_data()

# Função para apagar um produto
def delete_product():
    selected_item = tree.selection()[0]
    item = tree.item(selected_item)
    artigo_id = item['values'][0]

    # Conectar ao banco de dados
    conn = my.connect(host="localhost", user="root", password="", database="stock")
    cursor = conn.cursor()

    # Apagar produto da tabela artigos
    query = "DELETE FROM artigos WHERE id = %s"
    cursor.execute(query, (artigo_id,))

    conn.commit()
    cursor.close()
    conn.close()

    messagebox.showinfo("Sucesso", "Produto apagado com sucesso!")
    load_artigos_data()

# Função para criar um usuário administrador
def create_admin_user():
    # Conectar ao banco de dados
    conn = my.connect(host="localhost", user="root", password="", database="stock")
    cursor = conn.cursor()

    # Hash da senha do administrador
    admin_password_hashed = hash_password("password")

    # Verificar se o usuário administrador já existe
    cursor.execute("SELECT * FROM utilizadores WHERE nome = 'admin'")
    admin_exists = cursor.fetchone()

    if not admin_exists:
        # Inserir usuário administrador na tabela utilizadores
        query = "INSERT INTO utilizadores (nome, password, tipo_utilizador) VALUES (%s, %s, %s)"
        cursor.execute(query, ('admin', admin_password_hashed, 'administrador'))
        conn.commit()
        print("Usuário administrador criado com sucesso!")
    else:
        print("Usuário administrador já existe.")

    cursor.close()
    conn.close()

# Interface de Login
login_window = tk.Tk()
login_window.title("Login")

tk.Label(login_window, text="Nome de usuário:").grid(row=0, column=0)
entry_username = tk.Entry(login_window)
entry_username.grid(row=0, column=1)

tk.Label(login_window, text="Senha:").grid(row=1, column=0)
entry_password = tk.Entry(login_window, show="*")
entry_password.grid(row=1, column=1)

tk.Button(login_window, text="Login", command=validate_login).grid(row=2, column=0, columnspan=2)

# Interface do Administrador
admin_window = tk.Tk()
admin_window.title("Administrador - Gerenciar Produtos")
admin_window.withdraw()  # Esconder a janela do administrador inicialmente

columns = ("id", "nome", "preco", "quantidade")
tree = ttk.Treeview(admin_window, columns=columns, show="headings")
tree.heading("id", text="ID")
tree.heading("nome", text="Nome")
tree.heading("preco", text="Preço")
tree.heading("quantidade", text="Quantidade")
tree.pack()

frame = tk.Frame(admin_window)
frame.pack()

tk.Label(frame, text="Nome do Produto:").grid(row=0, column=0)
entry_nome = tk.Entry(frame)
entry_nome.grid(row=0, column=1)

tk.Label(frame, text="Preço:").grid(row=1, column=0)
entry_preco = tk.Entry(frame)
entry_preco.grid(row=1, column=1)

tk.Label(frame, text="Quantidade:").grid(row=2, column=0)
entry_quantidade = tk.Entry(frame)
entry_quantidade.grid(row=2, column=1)

tk.Button(frame, text="Inserir", command=insert_product).grid(row=3, column=0)
tk.Button(frame, text="Atualizar", command=update_product).grid(row=3, column=1)
tk.Button(frame, text="Apagar", command=delete_product).grid(row=3, column=2)

# Interface do Usuário Comum
user_window = tk.Tk()
user_window.title("Usuário - Inserir Produto")
user_window.withdraw()  # Esconder a janela do usuário inicialmente

tk.Label(user_window, text="Nome do Produto:").grid(row=0, column=0)
entry_nome = tk.Entry(user_window)
entry_nome.grid(row=0, column=1)

tk.Label(user_window, text="Preço:").grid(row=1, column=0)
entry_preco = tk.Entry(user_window)
entry_preco.grid(row=1, column=1)

tk.Label(user_window, text="Quantidade:").grid(row=2, column=0)
entry_quantidade = tk.Entry(user_window)
entry_quantidade.grid(row=2, column=1)

tk.Button(user_window, text="Inserir", command=insert_product).grid(row=3, column=0, columnspan=2)

# Criar usuário administrador ao iniciar o programa
create_database_and_tables()
create_admin_user()

# Executar o loop principal do Tkinter
login_window.mainloop()
admin_window.mainloop()
user_window.mainloop()