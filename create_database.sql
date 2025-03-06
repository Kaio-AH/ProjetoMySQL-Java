create database if not exists hotelkaiao;
use hotelkaiao;

create table if not exists clientes (
	id int auto_increment primary key,
    nome varchar(100) not null,
    idade int not null,
    cpf varchar(100) not null,
    genero varchar(100) not null
)