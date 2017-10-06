/*
Empresa        :  EGCC
Software       :  Sistema Financiero de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  BDCOLEGIO
Script         :  Crea la Base de Datos
Responsable    :  Ing. Eric Gustavo Coronel Castillo
Telefono       :  (511) 9966-64457
Email          :  gcoronelc@gmail.com
Sitio Web      :  http://www.desarrollasoftware.com
Blog           :  http://gcoronelc.blogspot.com
*/


-- base de datos

DROP DATABASE IF EXISTS BDCOLEGIO;

create database BDCOLEGIO;

use BDCOLEGIO;

SET NAMES 'utf8';

-- Esquema: Seguridad

create table empleado(
  idempleado int not null auto_increment,
  apellido   varchar(60) not null,
  nombre     varchar(60) not null,
  email      varchar(60) not null,
  telefono   varchar(20) not null,
  constraint pk_empleado primary key(idempleado)
) engine = innodb;

insert into empleado(idempleado,apellido,nombre,
email,telefono) values
(1,'A','B','C','D'),
(2,'A','B','C','D'),
(3,'A','B','C','D'),
(4,'A','B','C','D'),
(5,'A','B','C','D');


create table rol(
  idrol int not null,
  nombre varchar(30) not null,
  constraint pk_rol primary key(idrol)
) engine = innodb;

insert into rol(idrol, nombre) values
(1,'Administrador'),
(2,'Coordinador'),
(3,'Operador'),
(4,'Usuario');


create table usuario(
  idempleado int not null,
  idrol      int not null,
  usuario    varchar(20) not null,
  clave      varchar(60) not null,
  estado     int not null check( estado in (0,1) ),
  constraint pk_usuario primary key(idempleado),
  foreign key fk_usuario_empleado(idempleado)
          references empleado( idempleado ),
  foreign key fk_usuario_rol(idrol)
          references rol( idrol )
) engine = innodb;


insert into usuario(idempleado,idrol,usuario,
clave, estado) values
(1,1,'gustavo',SHA('gustavo'),1),
(2,3,'claudia',SHA('clauida'),1),
(3,2,'ricardo',SHA('ricardo'),1),
(4,3,'karla',SHA('karla'),0);



-- Esquema: Programacion

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
	references grado(idgrado)
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

-- Esquema: Matricula

create table estudiante(

) engine = innodb;


create table estudiante(

) engine = matricula;


-- Esquema: Finanzas

create table tobligacion(

) engine = innodb;


create table obligacion(

) engine = matricula;


create table pago(

) engine = matricula;



