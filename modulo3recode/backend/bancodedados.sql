CREATE DATABASE TropicalTravel;
USE TropicalTravel;

CREATE TABLE Usuario (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    nome_usuario VARCHAR(30),
    data_nasc DATE,
    cpf VARCHAR(15),
    rg VARCHAR(9),
    tel_usuario VARCHAR(11),
    endereco VARCHAR(50),
    email_usuario VARCHAR(30),
    senha_usuario VARCHAR(8)
);

CREATE TABLE Destinos (
    id_destino INTEGER PRIMARY KEY auto_increment,
    nome_destino VARCHAR(20)
);

CREATE TABLE Passagem (
    id_passagem INTEGER PRIMARY KEY auto_increment,
    nome_passageiro VARCHAR(30),
    data_ida DATE,
    id_usuario INTEGER,
    FOREIGN KEY (id_usuario) references Usuario (id_usuario),
    id_destino INTEGER,
    FOREIGN KEY (id_destino) references Destinos (id_destino)
);

CREATE TABLE Compra (
    id_compra INTEGER PRIMARY KEY auto_increment,
    valor_compra DECIMAL,
    data_compra DATE,
    id_usuario INTEGER,
    FOREIGN KEY (id_usuario) references Usuario (id_usuario),
    id_passagem INTEGER,
    FOREIGN KEY (id_passagem) references Passagem (id_passagem)
);






