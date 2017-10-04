
create database demo;

use demo;

SET NAMES 'utf8';

create table nivel(
  idnivel int not null,
  nombre varchar(40) not null,
  constraint pk_nivel primary key(idnivel)
) engine = innodb;


create table grado(
  idgrado int not null,
  idnivel int not null,
  nombre varchar(40) not null,
  constraint pk_grado primary key(idgrado),
  constraint fk_grado_nivel
	foreign key(idnivel)
	references nivel(idnivel)
) engine = innodb;


insert into nivel(idnivel, nombre) values
(1,'NIVEL PRIMARIA'),
(2,'NIVEL SECUNDARIA');


insert into grado(idgrado,idnivel,nombre) values
(1,1,'PRIMARIA - 1ER GRADO'),
(2,1,'PRIMARIA - 2DO GRADO'),
(3,1,'PRIMARIA - 3ER GRADO'),
(4,1,'PRIMARIA - 4TO GRADO'),
(5,1,'PRIMARIA - 5TO GRADO'),
(6,1,'PRIMARIA - 6TO GRADO'),
(7,2,'SECUNDARIA - 1ER GRADO'),
(8,2,'SECUNDARIA - 2DO GRADO'),
(9,2,'SECUNDARIA - 3ER GRADO'),
(10,2,'SECUNDARIA - 4TO GRADO'),
(11,2,'SECUNDARIA - 5TO GRADO');










  
  
  