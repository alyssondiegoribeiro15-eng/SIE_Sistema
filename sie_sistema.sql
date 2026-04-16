CREATE DATABASE sie_sistema;

USE sie_sistema;

CREATE TABLE material (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100),
    saldoAtual INT
);

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50),
    senha VARCHAR(100)
);

CREATE TABLE movimentacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(20),
    quantidade INT
);
    
INSERT INTO material (descricao, saldoAtual) VALUES
('Parafuso', 100),
('Porca', 200);

SELECT * FROM material;

SHOW DATABASES;

SELECT * FROM material;

SELECT * FROM movimentacao;