CREATE DATABASE IF NOT EXISTS Loja;
USE Loja;
SET SQL_SAFE_UPDATES = 0;

-- Criando a primeira tabela;
CREATE TABLE Categoria(
id_categoria INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nome_categoria varchar(100)
);

-- Criando a segunda tabela;
CREATE TABLE Produtos (
id_produto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nome varchar(100) NOT NULL,
preco DOUBLE CHECK (preco > 0),
quantidade_em_estoque INT CHECK (quantidade_em_estoque >= 0),
id_categoria INT UNSIGNED,
FOREIGN KEY (id_categoria) REFERENCES Categoria (id_categoria)
);

-- Inserinto os nomes das categorias;
INSERT INTO Categoria (nome_categoria) VALUES ("Roupas Esportivas");
INSERT INTO Categoria (nome_categoria) VALUES ("Equipamentos de Futebol");
INSERT INTO Categoria (nome_categoria) VALUES ("Acessorios de Treino");

-- Inserindo os produtos nas tabelas;
INSERT INTO Produtos (nome, preco, quantidade_em_estoque, id_categoria) VALUES ("Camisa de Futebol", 89.90, 100, (SELECT id_categoria FROM Categoria WHERE nome_categoria = "Roupas Esportivas" ));
INSERT INTO Produtos (nome, preco, quantidade_em_estoque, id_categoria) VALUES ("Tênis de Corrida", 299.99, 50, (SELECT id_categoria FROM Categoria WHERE nome_categoria = "Equipamentos de Futebol"));
INSERT INTO Produtos (nome, preco, quantidade_em_estoque, id_categoria) VALUES ("Faixa de Cabeça", 25.00, 200, (SELECT id_categoria FROM Categoria WHERE nome_categoria = "Acessorios de Treino"));

SELECT * FROM Produtos;

-- Consultar todos os produtos com suas categorias;
SELECT Produtos.nome, Produtos.preco, Produtos.quantidade_em_estoque, Categoria.nome_categoria FROM Produtos JOIN Categoria ON Produtos.id_categoria = Categoria.id_categoria;

-- Consultar todos os produtos de uma categoria específica (por exemplo, 'Equipamentos de Futebol');
SELECT Produtos.nome, Produtos.preco, Produtos.quantidade_em_estoque, Categoria.nome_categoria FROM Produtos JOIN Categoria ON Produtos.id_categoria = Categoria.id_categoria WHERE Categoria.nome_categoria = "Equipamentos de Futebol";

-- Consultar categorias que têm mais de 50 produtos em estoque;
SELECT Categoria.nome_categoria FROM Produtos JOIN Categoria ON Produtos.id_categoria = Categoria.id_categoria GROUP BY Categoria.nome_categoria HAVING SUM(Produtos.quantidade_em_estoque) > 50;

-- Alterar o preço de um produto específico (por exemplo, 'Tênis de Corrida') para um novo valor (por exemplo, 279.99);
UPDATE Produtos SET preco = 279.99 WHERE nome = "Tênis de Corrida";
SELECT * FROM Produtos;

-- Adicionar uma nova categoria e atualizar um produto para essa nova categoria;
INSERT INTO Categoria (nome_categoria) VALUE ("Bolas de Futebol");
INSERT INTO Produtos (nome, preco, quantidade_em_estoque, id_categoria) VALUES ("Jabulani", 75.99, 150, (SELECT id_categoria FROM Categoria WHERE nome_categoria = "Bolas de Futebol"));
SELECT * FROM Produtos;

-- Excluir um produto específico (por exemplo, 'Faixa de Cabeça');
DELETE FROM Produtos WHERE nome = "Faixa de Cabeça";
SELECT * FROM Produtos;