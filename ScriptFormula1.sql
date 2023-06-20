CREATE DATABASE IF NOT EXISTS Formula1;

USE Formula1;

CREATE TABLE Equipe (
  ID INT PRIMARY KEY,
  Nome VARCHAR(255) NOT NULL,
  País VARCHAR(255) NOT NULL,
  Chefe VARCHAR(255) NOT NULL
);

CREATE TABLE Piloto (
  ID INT PRIMARY KEY,
  Nome VARCHAR(255) NOT NULL,
  Nacionalidade VARCHAR(255) NOT NULL,
  NumeroCarro INT,
  EquipeID INT,
  FOREIGN KEY (EquipeID) REFERENCES Equipe(ID)
);

CREATE TABLE Corrida (
  ID INT PRIMARY KEY,
  Nome VARCHAR(255) NOT NULL,
  Local VARCHAR(255) NOT NULL,
  VencedorID INT,
  FOREIGN KEY (VencedorID) REFERENCES Piloto(ID)
);