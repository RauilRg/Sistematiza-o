Create table entregadores (

	id bigint not null auto_increment, 
	cpf varchar(11) not null, 
	nome varchar(50) not null,
	capacidadeveiculo int not null,
	
	primary key(id)

				); 