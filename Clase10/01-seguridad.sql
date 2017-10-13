/*
Empresa        :  EGCC
Software       :  Sistema Financiero de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  BDCOLEGIO
Script         :  Crea el esquema de seguridad
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
-- Esquema: Seguridad
-- ---------------------------

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



