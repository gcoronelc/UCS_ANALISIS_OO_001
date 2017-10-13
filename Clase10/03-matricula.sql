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

-- --------------------------
-- base de datos
-- --------------------------

use BDCOLEGIO;

SET NAMES 'utf8';


-- --------------------------
-- Esquema: Matricula
-- --------------------------

CREATE TABLE estudiante
(
	idestudiante   INTEGER AUTO_INCREMENT,
	apellido       VARCHAR(60) NOT NULL,
	nombre         VARCHAR(60) NOT NULL,
	email          VARCHAR(60) NOT NULL,
	telefono       VARCHAR(20) NOT NULL,
	PRIMARY KEY PK_ESTUDIANTE(idestudiante)
);

insert into estudiante(idestudiante,apellido,nombre,
email,telefono) values
(1,'Bbb','Cccc','Ddddd','Fffff'),
(2,'Bbb','Cccc','Ddddd','Fffff'),
(3,'Bbb','Cccc','Ddddd','Fffff'),
(4,'Bbb','Cccc','Ddddd','Fffff'),
(5,'Bbb','Cccc','Ddddd','Fffff');

CREATE TABLE matricula
(
	idmatricula          INTEGER AUTO_INCREMENT,
	idestudiante         INTEGER NULL,
	idseccion            int NULL,
	fecha                DATE NOT NULL,
	idempleado           int NULL,
	PRIMARY KEY (idmatricula),
	FOREIGN KEY FK_MATRICULA_ESTUDIANTE (idestudiante) REFERENCES estudiante (idestudiante),
	FOREIGN KEY FK_MATRICULA_SECCION (idseccion) REFERENCES seccion (idseccion),
	FOREIGN KEY FK_MATRICULA_EMPLEADO (idempleado) REFERENCES empleado (idempleado)
);


insert into matricula(idmatricula,
idestudiante,idseccion,fecha,idempleado) values
(1,1,12,'2017-07-15',1),
(2,2,12,'2017-07-15',1),
(3,3,12,'2017-07-15',1);

