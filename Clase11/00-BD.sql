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

------------------------------------
-- base de datos
------------------------------------

DROP DATABASE IF EXISTS BDCOLEGIO;

create database BDCOLEGIO;

use BDCOLEGIO;

SET NAMES 'utf8';


-- ----------------------------------
-- usuario de base de datos
-- ----------------------------------

USE MYSQL;
GRANT ALL PRIVILEGES ON *.* TO 'colegio'@'%' IDENTIFIED BY 'admin' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON *.* TO 'colegio'@'localhost' IDENTIFIED BY 'admin' WITH GRANT OPTION;
FLUSH PRIVILEGES;
USE BDCOLEGIO;



