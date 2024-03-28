use Exercicio4;

insert into cliente values ('Helena','Pearafita',1 ),('Raul','Palmela',0 )

insert into produto values ('rato logiteck',10 ),('monitor sony',120 )

select *from Venda

insert into Venda values ('1','2024-03-28 12:53:49.567','1' ),('1','2024-03-28 12:53:49.567','5' )


create table venda(






)

go
set @data CURRENT_TIMESTAMP()= GETDATE
select CURRENT_TIMESTAMP


create procedure alteraMorada
(@morada varchar(100), @cli int

)
as 
update cliente 
set morada = @morada
where id=@cli

go



Exec alteraMorada@morada ='Porto', @cli=2;
go


select nome from clientes where estado =1

go


create view clientes_acticos AS
select nome from cliente 
where estado=1
go


select * from clientes_acticos

go



create procedure clientes_activo (@estado int)
as
go
create view clientesactivos as
select nome from cliente where estado = estado

go

create procedure quatasVendas(@cli int)
as
 select count(v.cli) as contagem
 from venda v
 where v.cli=@cli
go


select max(preco) from produtos
go
create view produtos_caro as 

select descricao from produtos where preco = (select max(preco) from produtos)

go

create view cclientesnuncacomprar as
select nome 
from cliente
where id not in (select cli from venda)
go


