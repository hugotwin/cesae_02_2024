create database Elevadores_hugo

create table cliente (
cliente_id int identity(1,1) primary key, 
nome text);

create table contrato (
contrato_id int identity(1,1) 
primary key, 
data_inicio date, 
data_fim date, 
cliente_id int);

create table elevador (
elevador_id int identity(1,1) primary key, 
contrato_id int, 
marca text);

create table visita (
visita_id int identity(1,1) primary key,
contrato_id int, 
data_visita date, 
tecnico_id int);

create table relatorio (
relatorio_id int identity(1,1) primary key,
elevador_id int, 
visita_id int);

create table proposta (
proposta_id int identity(1,1) primary key, 
relatorio_id int, 
aceite bit);

create table pecas_proposta (
proposta_id int not null, 
peca_id int not null, 
custo decimal(10,2));

alter table pecas_proposta 
add primary key (proposta_id, peca_id);
alter table contrato
add foreign key (cliente_id) references cliente(cliente_id);
alter table elevador
add foreign key (contrato_id) references contrato(contrato_id);
alter table visita
add foreign key (contrato_id) references contrato(contrato_id);
alter table relatorio
add foreign key (elevador_id) references elevador(elevador_id);
alter table relatorio
add foreign key (visita_id) references visita(visita_id);
alter table proposta
add foreign key (relatorio_id) references relatorio(relatorio_id);
alter table pecas_proposta
add foreign key (proposta_id) references proposta(proposta_id);

insert into cliente (nome) values ('Maria'), ('Manuel');
select * from cliente;
insert into contrato (data_inicio, data_fim, cliente_id) values ('2021-11-9', '2021-11-10', 1), ('2021-05-9', '2021-05-10', 2);
select * from contrato;
insert into elevador (contrato_id, marca) values (1,'XPTO'), (2,'XPTO10');
insert into elevador (contrato_id, marca) values (2,'XPTO'), (2,'XPTO10');
insert into elevador (contrato_id, marca) values (7,'XPTO'), (5,'XPTO10');
select * from elevador;
insert into visita (contrato_id, data_visita, tecnico_id) values (1,'2021-11-9', 101), (2,'2021-11-9', 102);
insert into visita (contrato_id, data_visita, tecnico_id) values (5,'2021-11-9', 108), (7,'2021-11-9', 110);
insert into visita (contrato_id, data_visita, tecnico_id) values (1,'2024-06-9', 101), (2,'2024-06-9', 102);
insert into visita (contrato_id, data_visita, tecnico_id) values (1,'2024-07-10', 103), (2,'2024-07-9', 104);
select * from visita;
insert into relatorio (elevador_id, visita_id) values (1,1);
select * from relatorio;
insert into proposta (relatorio_id, aceite) values (1,1);
select * from proposta;
insert into pecas_proposta (proposta_id, peca_id, custo) values (1,1005,10.3);
select * from pecas_proposta;

go

Update contrato set data_fim = '2025-05-12' where cliente_id = 2 
go
create view contrato_cliente as

select cliente.cliente_id, cliente.nome, contrato.contrato_id, contrato.data_inicio,contrato.data_fim 
from cliente 
join contrato on cliente.cliente_id= contrato.cliente_id  where contrato.data_fim >  GETDATE()

go

select * from contrato_cliente



drop view contrato_cliente


select count(*) from   contrato_cliente

go

create view elevador_contrato as

select contrato.cliente_id, contrato.contrato_id, contrato.data_fim, contrato.data_inicio , elevador.elevador_id, elevador.marca
from contrato
join elevador on contrato.contrato_id= elevador.contrato_id

go

create view contagem as
select count(contrato_id) as contagem, contrato_id from elevador_contrato group by contrato_id
go

select * from contagem where contagem >1

select count(contrato_id) as contagem, contrato_id from elevador_contrato group by contrato_id having count(contrato_id) >1


select  contrato.cliente_id, contrato.contrato_id, contrato.data_fim, contrato.data_inicio , elevador.elevador_id, elevador.marca , visita.tecnico_id, visita.data_visita , visita.visita_id
from contrato
join elevador on contrato.contrato_id= elevador.contrato_id
join visita on visita.contrato_id = contrato.contrato_id where data_visita >'2024-05-01' and  data_visita < '2024-05-30' 

go
drop view  elevador_cliente_contrato
go
create view elevador_cliente_contrato as

select  contrato.cliente_id, contrato.contrato_id, contrato.data_fim, contrato.data_inicio , elevador.elevador_id, elevador.marca , visita.tecnico_id, visita.data_visita , visita.visita_id
from contrato
join elevador on contrato.contrato_id= elevador.contrato_id
join visita on visita.contrato_id = contrato.contrato_id

go

create view elevador_cliente_contrato_2 as

select  contrato.cliente_id, contrato.contrato_id, contrato.data_fim, contrato.data_inicio , elevador.elevador_id, elevador.marca , visita.tecnico_id, visita.data_visita , visita.visita_id
from contrato
join elevador on contrato.contrato_id= elevador.contrato_id
join visita on visita.contrato_id = contrato.contrato_id where data_visita >'2024-05-01' and  data_visita < '2024-05-30' 

go

select count(contrato_id) as contagem, tecnico_id  from elevador_cliente_contrato_2  group by tecnico_id having count(contrato_id) >1

select count(contrato_id) as contagem, tecnico_id  from elevador_cliente_contrato_2  group by tecnico_id having count(contrato_id) >1


select count(contrato_id)
from  elevador_cliente_contrato 
group by contrato_id having  data_fim <GETDATE()



delete  elevador_cliente_contrato where data_visita >'2024-05-01' and  data_visita < '2024-05-30' 

 go
create view elevador_cliente_contrato_3 as

select  contrato.cliente_id, contrato.contrato_id, contrato.data_fim, contrato.data_inicio , elevador.elevador_id, elevador.marca , visita.tecnico_id, visita.data_visita , visita.visita_id
from contrato
join elevador on contrato.contrato_id= elevador.contrato_id
join visita on visita.contrato_id = contrato.contrato_id where data_fim > GETDATE()

go

select * from elevador_cliente_contrato_3 where contrato_id in(select contrato_id
from  elevador_cliente_contrato_3 
group by contrato_id
having count(contrato_id) >1)


select count(contrato_id), contrato_id
from  elevador_cliente_contrato_3 
group by contrato_id
having count(contrato_id) >1

select distinct( tecnico_id) from elevador_cliente_contrato_3 where contrato_id in(select contrato_id
from  elevador_cliente_contrato_3 
group by contrato_id
having count(contrato_id) <1)

go

create view elevador_cliente_contrato_4 as

select  contrato.cliente_id, contrato.contrato_id, contrato.data_fim, contrato.data_inicio , elevador.elevador_id, elevador.marca , visita.tecnico_id, visita.data_visita , visita.visita_id
from contrato
join elevador on contrato.contrato_id= elevador.contrato_id
join visita on visita.contrato_id = contrato.contrato_id 

go


create view custos_ativo as



select contrato.contrato_id, elevador.elevador_id,visita.visita_id, relatorio.relatorio_id,proposta.proposta_id, pecas_proposta.custo
from contrato 
join elevador on elevador.contrato_id=contrato.contrato_id
join visita on visita.contrato_id=elevador.contrato_id
join relatorio on relatorio.visita_id = visita.visita_id
join proposta on proposta.relatorio_id=relatorio.relatorio_id
join pecas_proposta on pecas_proposta.proposta_id= proposta.proposta_id

go

