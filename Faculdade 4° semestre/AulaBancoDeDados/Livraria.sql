CREATE DATABASE IF NOT EXISTS Livraria;
USE Livraria;
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE Livro (
    id_livro int UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    titulo varchar(100),
    autor varchar(100),
    ano_publicacao int,
    preco double,
    quantidade_estoque int
);

INSERT INTO Livro (titulo, autor, ano_publicacao, preco, quantidade_estoque) VALUES
('Introdução ao MYSQL', 'João Silva', 2015, 50.00, 10),
('Mastering SQL', 'Maria Souza', 2018, 120.00, 5),
('SQL para Iniciantes', 'Paulo Santos', 2020, 75.00, 8);

SELECT titulo, autor, preco FROM Livro;

SELECT titulo, ano_publicacao FROM Livro WHERE ano_publicacao >= 2018;

SELECT titulo, preco FROM Livro WHERE preco BETWEEN 60.00 AND 100.00;

SELECT titulo, quantidade_estoque FROM Livro WHERE quantidade_estoque < 10;

UPDATE Livro SET preco = 80.00 WHERE titulo = 'SQL para Iniciantes';

UPDATE Livro SET quantidade_estoque = 15 WHERE titulo = 'Introdução ao MYSQL';

DELETE FROM Livro WHERE titulo = 'Mastering SQL';

SELECT SUM(preco * quantidade_estoque) AS preco_total_estoque FROM Livro;

SELECT titulo, preco FROM Livro ORDER BY preco DESC LIMIT 1;



