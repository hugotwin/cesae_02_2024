create database gest_comercial;
use gest_comercial;

create table cliente (
id int identity(1,1) primary key,
nome varchar(50) not null,
morada varchar(250),
estado bit default 1,
);

create table produto(
id int identity(1,1) primary key,
descricao varchar(50) not null,
preco decimal(10,2)

)

create table venda(
prod int,
cli int, 
data datetime default current_timestamp,
qtd int,
Foreign key (prod) references produto(id),
foreign key (cli) references cliente(id),
primary key (prod, cli, data)
)


insert into cliente (nome, morada, estado) values ('Helena Monteiro',' Perafita – Freixieiro',1),('Raul Simas', 'Palmela',1)
insert into produto (descricao,preco) values ('Rato Logitec XPTO 1', 10),  ('Monitor Sony Vaio XPTO', 120)
insert into venda (prod, cli, qtd) values (1,1,1 ), (1,2,5)


update venda set qtd =10 where cli =2
select * from venda
update cliente set morada = 'porto' where nome = 'Raul Simas'

select * from produto
select * from cliente where estado =1

select cliente.nome, produto.descricao  
from produto join venda on venda.prod = produto.id
join cliente on cliente.id = venda.cli where cliente.nome = 'Raul Simas'


select cliente.nome, produto.descricao
from produto join venda on venda.prod = produto.id
join cliente on cliente.id=venda.cli where cliente.nome  like 'h%'

select cliente.nome, venda.data
from cliente 
join venda on venda.cli=cliente.id where cliente.nome = 'Raul Simas'

select max(preco) from produto

select descricao from produto where preco = (select max(preco) from produto)

select descricao from produto where preco < 100

select cli from venda

select * from cliente where id not in (select cli from venda)

select sum(produto.preco* venda.qtd) as Value_Day from
produto join venda on produto.id = venda.prod 
group by venda.data

create database Encomendas_hugo
use Encomendas_hugo

create table cliente(
id int identity(1,1) primary key,
nome varchar(50) not null,
morada varchar(50),
telef int,

)

create table encomenda(
codEncomenda int identity(1,1) primary key,
codCliente int,
data datetime default current_timestamp,
foreign key (codCliente) references cliente(id)
)

create table produto(
codProduto int identity(1,1) primary key,
descricao varchar(50) not null,
preco int ,
obs varchar(50)
)

create table linhaEncomenda(
codEncomenda int,
codProduto int,
quantidade int,
desconto decimal(5,2),
foreign key (codEncomenda) references encomenda(codEncomenda),
foreign key (codProduto) references produto(codProduto),
primary key (codEncomenda, codProduto)
)


insert into cliente (nome, morada, telef) 
values ('hugo', 'porto', 98764),
('ana', 'lisboa', 9897951),
('dani', 'malta', 9897)

insert into encomenda (codCliente) values (5)
select * from encomenda


insert into produto (descricao,preco) 
values ('rato logi', 10),('laptop', 100), ('teclado', 15)

insert into linhaEncomenda values (3,1,5,null),(4,2,6, null),(5,3,6, 0.5)

select sum(produto.preco*linhaEncomenda.quantidade) as total
from linhaencomenda 
join produto on linhaEncomenda.codProduto=produto.codProduto
join encomenda on linhaEncomenda.codEncomenda=encomenda.codEncomenda
group by encomenda.codEncomenda


create database Campeonato_Hugo
use Campeonato_Hugo


drop table equipas
drop table treinadores
drop table bolas
drop table experiencias


create table equipas (
idEquipa int primary key, 
nome varchar(50) not null,
cidade varchar(50),
diretor varchar(50)
)

create table treinadores(
idTreinador int identity(1,1) primary key,
nome varchar(50) not null,
idade int,
telefone bigint
)

create table bolas(
referencia varchar(20) not null,
idEquipa int,
fabricante varchar(20),
foreign key (idEquipa) references equipas(idEquipa),
primary key (referencia, idEquipa)
)

create table experiencias(
idEquipa  int,
idTreinador int,
escalao varchar(50),
anos int,
foreign key (idEquipa) references equipas(IdEquipa),
foreign key (idTreinador) references treinadores(idTreinador),
primary key (idEquipa, idTreinador, escalao)

)



INSERT INTO treinadores (nome, idade, telefone) VALUES('António', 34, 922424561);
INSERT INTO treinadores (nome, idade, telefone) VALUES( 'Barbosa', 45, 965552936);
INSERT INTO treinadores (nome, idade, telefone) VALUES( 'Tavares', 48, 933332267);
INSERT INTO treinadores (nome, idade, telefone) VALUES( 'Joaquim', 57, 918638465);
INSERT INTO treinadores (nome, idade, telefone) VALUES( 'Alberto', 33, 966785309);
INSERT INTO treinadores (nome, idade, telefone) VALUES( 'Duarte', 54, 912773446);

select * from treinadores

SET IDENTITY_INSERT equipas OFF;

INSERT INTO equipas (idEquipa,nome,cidade, diretor) VALUES(12, 'Académico', 'Porto', 'Mário');
INSERT INTO equipas (idEquipa,nome,cidade, diretor) VALUES(15, 'Universitário', 'Coimbra', 'João');
INSERT INTO equipas  (idEquipa,nome,cidade, diretor) VALUES(20, 'Juventude', 'Braga', 'Silva');
INSERT INTO equipas (idEquipa,nome,cidade, diretor) VALUES(24, 'Tigres', 'Espinho', 'Cardoso');

INSERT INTO bolas VALUES(1, 12, 'Adidas');
INSERT INTO bolas VALUES(9, 12, 'Reebok');
INSERT INTO bolas VALUES(13, 12, 'Adidas');
INSERT INTO bolas VALUES(1, 15, 'Adidas');
INSERT INTO bolas VALUES(3, 20, 'Olimpic');
INSERT INTO bolas VALUES(4, 20, 'Nike');
INSERT INTO bolas VALUES(18, 24, 'Reebok');
INSERT INTO bolas VALUES(21, 24, 'Olimpic');


INSERT INTO experiencias VALUES(12, 1, 'juniores', 10);
INSERT INTO experiencias VALUES(12, 1, 'seniores', 5);
INSERT INTO experiencias VALUES(12, 2, 'iniciados', 2);
INSERT INTO experiencias VALUES(12, 2, 'juniores', 3);
INSERT INTO experiencias VALUES(12, 2, 'juvenis', 4);
INSERT INTO experiencias VALUES(15, 3, 'juniores', 15);
INSERT INTO experiencias VALUES(24, 5, 'juvenis', 12);

select *  from equipas

select * from equipas where idEquipa =12

select idEquipa , nome from equipas

select * from treinadores where idade <40

select * from treinadores where idade  between 43 and 53
order by idade 

select * from bolas where fabricante in('Reebok', 'Olimpic')

select nome from treinadores where nome like 'A%'

select count(*) from equipas 

select distinct(fabricante) from bolas

select count(*) from treinadores where idade >40 

select max(idade) from treinadores

select distinct(idEquipa) from bolas where fabricante = 'Adidas'

select avg(treinadores.idade) from treinadores
join experiencias on treinadores.idTreinador=experiencias.idTreinador 
where experiencias.escalao= 'juvenis'

select treinadores.nome as treinador, treinadores.idade as idade, equipas.nome as equipa, equipas.cidade as cidade   from treinadores
join experiencias on treinadores.idTreinador=experiencias.idTreinador 
join equipas on equipas.idEquipa= experiencias.idEquipa

select treinadores.nome , equipas.nome 
from treinadores
join treinadores on treinadores.idTreinador= ex