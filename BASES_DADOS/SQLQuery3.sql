create database teste3
use teste3


create table cliente (
cliente_id int identity(1,1) primary key, 
nome text);

create table contrato (
contrato_id int identity(1,1) primary key, 
data_inicio date,
data_fim date, 
cliente_id int);

create table elevador (
elevador_id int identity(1,1) primary key, 
contrato_id int, 
marca text);

create table visita (
visita_id int identity(1,1) primary key, 
contrato_id int, data_visita date, 
tecnico_id int);

create table relatorio (
relatorio_id int identity(1,1)
primary key, elevador_id int, 
visita_id int);

create table proposta (
proposta_id int identity(1,1) primary key, 
relatorio_id int, a
ceite bit);
create table pecas_proposta (proposta_id int not null, peca_id int not null, custo decimal(10,2));

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
select * from elevador;
insert into visita (contrato_id, data_visita, tecnico_id) values (1,'2021-11-9', 101), (2,'2021-11-9', 102);
select * from visita;
insert into relatorio (elevador_id, visita_id) values (1,1);
select * from relatorio;
insert into proposta (relatorio_id, aceite) values (1,1);
select * from proposta;
insert into pecas_proposta (proposta_id, peca_id, custo) values (1,1005,10.3);
select * from pecas_proposta;






--n.
select count(elevador.elevador_id) as contagem
from contrato
join elevador on elevador.contrato_id=contrato.contrato_id
join visita on  visita.contrato_id= contrato.contrato_id
join relatorio on  visita.visita_id=relatorio.visita_id
group by contrato.contrato_id
order by contagem



--m....


select count(visita.visita_id) as contagem
from contrato
join elevador on elevador.contrato_id=contrato.contrato_id
join visita on  visita.contrato_id= contrato.contrato_id
join relatorio on  visita.visita_id=relatorio.visita_id

group by contrato.contrato_id
having  count(visita.visita_id)>0


select contrato.contrato_id, contrato.data_fim ,visita.tecnico_id,relatorio.relatorio_id, elevador.elevador_id
from contrato
join elevador on elevador.contrato_id=contrato.contrato_id
join visita on  visita.contrato_id= contrato.contrato_id
join relatorio on  visita.visita_id=relatorio.visita_id
where contrato.data_fim > getdate()
group by contrato.contrato_id


--l.
-- lista de elevadores com intervencao o join ja faz 
select elevador.elevador_id  
from contrato
join elevador on elevador.contrato_id=contrato.contrato_id
join visita on  visita.contrato_id= contrato.contrato_id
join relatorio on  visita.visita_id=relatorio.visita_id


-- lista de de intervencoes sem 
select * from elevador where elevador_id not in(
select elevador.elevador_id  
from contrato
join elevador on elevador.contrato_id=contrato.contrato_id
join visita on  visita.contrato_id= contrato.contrato_id
join relatorio on  visita.visita_id=relatorio.visita_id
)




-- a.
--select cliente.nome, contrato.data_fim 
--from contrato INNER JOIN cliente ON (contrato.cliente_id = cliente.cliente_id) 
--where data_fim > GETDATE();

-- b.
--select count(*) as contratos_ativos
--from contrato INNER JOIN cliente ON (contrato.cliente_id = cliente.cliente_id) 
--where data_fim > GETDATE()
--group by cliente.cliente_id

-- c.
--select contrato_id, count(*) as nrElevadores 
--from elevador
--group by contrato_id
--having count(*) >1

-- d.
select tecnico_id, contrato_id from visita
where data_visita like '%-11-%' and contrato_id IN (
select contrato_id from elevador
group by contrato_id
having count(*) >1)

-- e.
select contrato.contrato_id, count(*) as nrElevadores
from elevador 
INNER JOIN contrato ON (elevador.contrato_id = contrato.contrato_id)
where data_fim > GETDATE()
group by contrato.contrato_id
having count(*) >1

-- f.
select * from visita
where contrato_id IN (
select contrato.contrato_id
from elevador INNER JOIN contrato ON (elevador.contrato_id = contrato.contrato_id)
where data_fim > GETDATE()
group by contrato.contrato_id
having count(*) >1)

-- g.
go
create view IntervencoesNosContratosAtivosComMaisQueUmElevador as
select * from visita
where contrato_id 
IN (select contrato.contrato_id from elevador JOIN contrato ON (elevador.contrato_id = contrato.contrato_id)
where data_fim > GETDATE()
group by contrato.contrato_id
having count(*) >1)



--select * from IntervencoesNosContratosAtivosComMaisQueUmElevador INNER 

-- h.
select tecnico_id
from visita where tecnico_id NOT IN (
select tecnico_id 
from visita
where data_visita like '%-11-%' and contrato_id IN (
select contrato_id from elevador
group by contrato_id
having count(*) >1 )
)

-- i.

go
create procedure CustoManutencaoDeContratoAtivo (@contrato int) as
select contrato.contrato_id, SUM(pecas_proposta.custo) as totalCusto
from pecas_proposta, proposta, relatorio, elevador, contrato
where pecas_proposta.proposta_id = proposta.proposta_id
	AND proposta.relatorio_id = relatorio.relatorio_id AND
		relatorio.elevador_id = elevador.elevador_id AND
		elevador.contrato_id = contrato.contrato_id AND
		proposta.aceite = 1 AND
		contrato.contrato_id = @contrato
group by contrato.contrato_id
go

exec CustoManutencaoDeContratoAtivo @contrato = 1;


-- j.
select tecnico_id, count(*) as Intervencoes from visita
where data_visita like '2020-06-%'
group by tecnico_id

-- k.

go
create view IntervencoesPorTecnicoJunho2020 as
select tecnico_id, count(*) as intervencoes from visita
where data_visita like '2020-06-%'
group by tecnico_id
go




Declare @media int = (select count(*) as intervencoes from visita
where data_visita like '2020-06-%')/(select count(*) as tecnicos from visita
where data_visita like '2020-06-%'
group by tecnico_id)

select @media


select count(*) as intervencoes from visita
where data_visita like '2020-06-%'

select count(*) as tecnicos from visita
where data_visita like '2020-06-%'
group by tecnico_id





select tecnico_id from IntervencoesPorTecnicoJunho2020
where intervencoes > (
select AVG(cast(intervencoes AS decimal(5, 2))) 
from IntervencoesPorTecnicoJunho2020
)

-- l.
--elevadores em contratos ativos
--select * 
--from elevador, contrato
--where elevador.contrato_id = contrato.contrato_id and 
--		contrato.data_fim > GETDATE() and -- elevadores em contratos ativos
--		elevador.elevador_id NOT IN (
--			-- lista de elevadores com intervencoes (elevador INNER JOIN com visita)
--			select distinct(elevador.elevador_id)
--			from visita, contrato, elevador
--			where visita.contrato_id = contrato.contrato_id AND
--					contrato.contrato_id = elevador.contrato_id
--		)

-- m.
--select elevador.elevador_id, count(*) as NrIntervencoes
--from elevador, contrato, visita
--where elevador.contrato_id = contrato.contrato_id and
--		contrato.contrato_id = visita.contrato_id and
--		contrato.data_fim > GETDATE()
--group by elevador.elevador_id
--having count(*) > 2

-- n.
select contrato.contrato_id, count(*) as nrElevadores
from contrato, elevador
where contrato.contrato_id = elevador.contrato_id and
		data_fim > GETDATE()
group by contrato.contrato_id
order by count(*) desc