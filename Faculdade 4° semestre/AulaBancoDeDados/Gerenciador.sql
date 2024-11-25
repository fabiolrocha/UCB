CREATE DATABASE GerenciadorEstoque;
USE GerenciadorEstoque;

CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT
);


CREATE TABLE produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    quantidade INT DEFAULT 0,
    preco_compra DECIMAL(10, 2),
    preco_venda DECIMAL(10, 2),
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);

CREATE TABLE movimentacoes (
    id_movimentacao INT AUTO_INCREMENT PRIMARY KEY,
    id_produto INT,
    tipo_movimentacao ENUM('entrada', 'saida') NOT NULL,
    quantidade INT NOT NULL,
    data_movimentacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_produto) REFERENCES produtos(id_produto)
);

DELIMITER //
CREATE PROCEDURE cadastrar_produto(
    IN nome VARCHAR(100),
    IN descricao TEXT,
    IN quantidade INT,
    IN preco_compra DECIMAL(10, 2),
    IN preco_venda DECIMAL(10, 2),
    IN id_categoria INT
)
BEGIN
    INSERT INTO produtos (nome, descricao, quantidade, preco_compra, preco_venda, id_categoria)
    VALUES (nome, descricao, quantidade, preco_compra, preco_venda, id_categoria);
END //
DELIMITER ;
 
DELIMITER //
CREATE PROCEDURE cadastrar_categoria(
    IN nome VARCHAR(100),
    IN descricao TEXT
)
BEGIN
    INSERT INTO categorias (nome, descricao)
    VALUES (nome, descricao);
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER verificar_estoque_baixo
AFTER UPDATE ON produtos
FOR EACH ROW
BEGIN
    IF NEW.quantidade < 1 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Estoque abaixo do mínimo!';
    END IF;
END //
DELIMITER ;
