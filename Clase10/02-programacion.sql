/*
Empresa        :  EGCC
Software       :  Sistema Financiero de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  BDCOLEGIO
Script         :  Crea el esquema programacion
Responsable    :  Ing. Eric Gustavo Coronel Castillo
Telefono       :  (511) 9966-64457
Email          :  gcoronelc@gmail.com
Sitio Web      :  http://www.desarrollasoftware.com
Blog           :  http://gcoronelc.blogspot.com
*/


-- ---------------------------
-- base de datos
-- ---------------------------

use BDCOLEGIO;
SET NAMES 'utf8';


-- ---------------------------
-- Esquema: Programacion
-- ---------------------------

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

create table periodo(
  anio       int not null,
  estado     int not null check( estado in (0,1) ),
  cingreso   numeric(10,2) not null,
  cmatricula numeric(10,2) not null,
  cmensual   numeric(10,2) not null,
  cmora      numeric(10,2) not null,
  pdcto      numeric(10,2) not null,
  primary key pk_periodo( anio )
) engine = innodb;

insert into periodo(anio,estado,cingreso,
cmatricula,cmensual,cmora,pdcto) values
(2017,0,2000.0,800.0,800.0,1.0,0.07),
(2018,1,2500.0,850.0,860.0,1.0,0.08);


create table seccion(
  idseccion  int not null auto_increment,
  anio       int not null,
  idgrado    int not null,
  nombre     varchar(40) not null,
  vacantes   int not null,
  inscritos  int not null,
  estado     int not null check( estado in (0,1) ),
  idempleado int not null,
  primary key pk_seccion(idseccion),
  foreign key fk_seccion_periodo(anio)
	references periodo(anio),
  foreign key fk_seccion_grado(idgrado)
	references grado(idgrado),
  foreign key fk_seccion_empleado(idempleado)
	references empleado(idempleado)
) engine = innodb;

-- Periodo: Primaria 2017
insert into seccion(idseccion,anio,idgrado,
nombre,vacantes,inscritos,estado,idempleado) values
(1,2017,1,'A',20,15,1,1),
(2,2017,2,'B',20,16,1,1),
(3,2017,3,'C',20,13,1,1),
(4,2017,4,'D',20,16,1,1),
(5,2017,5,'E',20,12,1,1),
(6,2017,6,'F',20,16,1,1);



-- Periodo: Primaria 2018
insert into seccion(idseccion,anio,idgrado,
nombre,vacantes,inscritos,estado,idempleado) values
(12,2018,1,'A',20,0,1,1),
(13,2018,2,'B',20,0,1,1),
(14,2018,3,'C',20,0,1,1),
(15,2018,4,'D',20,0,1,1),
(16,2018,5,'E',20,0,1,1),
(17,2018,6,'F',20,0,1,1);

