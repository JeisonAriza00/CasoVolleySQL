-- 
-- Uncomment me if you want :)
-- CREATE DATABASE CasoPracticoVolley;

CREATE TABLE Libro de cartas
(
    numeroCorreoEntrante Integer NOT NULL,
    fechaRecibido String NOT NULL
);

CREATE TABLE Persona
(
    nombre String NOT NULL,
    apellido String NOT NULL,
    fechaNacimiento String NOT NULL,
    genero String NOT NULL,
    telefono Integer NOT NULL,
    direccion String NOT NULL
);

CREATE TABLE Libro de Miembros
(
    numeroMiembro Integer NOT NULL,
    cantidadPagar Integer NOT NULL
);

CREATE TABLE Tarifas anuales
(
    valorAnual Integer NOT NULL
);

CREATE TABLE Facturas
(
    precio Integer NOT NULL
);

CREATE TABLE Carta
(
    status String NOT NULL,
    fechaAceptacion invalid NOT NULL,
    nombre String NOT NULL,
    fechaNacimiento String NOT NULL,
    apellido String NOT NULL,
    genero String NOT NULL,
    telefono Integer NOT NULL,
    direccion String NOT NULL
);

CREATE TABLE Tarjetas de miembros
(
    numeroMembresia Integer NOT NULL,
    fechaInicio String NOT NULL,
    nombre String NOT NULL,
    fechaNacimiento String NOT NULL,
    direccionPostal String NOT NULL
);

