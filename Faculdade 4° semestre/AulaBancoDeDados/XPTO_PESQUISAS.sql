CREATE DATABASE IF NOT EXISTS XPTO_PESQUISAS;
USE XPTO_PESQUISAS;
SET SQL_SAFE_UPDATES = 0;

-- Criando a primeira tabela, dos projetos
CREATE TABLE Projetos (
id_projeto INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nome_projeto varchar(100),
valor_projeto double,
departamento_projeto varchar(100),
filial_projeto varchar(100),
fonte_projeto varchar(100),
investimento_projeto double
);

-- Inserindo os dados tabela Projetos
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Acesso a Oportunidades", 15000.00, 'DIDES', 'NORTE', 'BID - Banco Interamericano de Desenvolvimento', 100000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Brasil em Desenvolvimento", 19000.00, 'DIRUR', 'SUL', 'BNDES - Banco Nacional de Desenvolvimento Econômico e Social', 30000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Emprego no Turismo", 35000.00, 'DIMAC', 'NORTE', 'BID - Banco Interamericano de Desenvolvimento', 100000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Mapa das Organizações da Sociedade Civil", 55000.00, 'DIMAC', 'SUL', 'BNDES - Banco Nacional de Desenvolvimento Econômico e Social', 200000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Observatório de Gestão do Conhecimento ", 20000.00, 'DIDES', 'SUL', 'BNDES - Banco Nacional de Desenvolvimento Econômico e Social', 50000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Atlas da Violência", 20000.00, 'DINTE', 'SUDESTE', 'BANERJ - Banco do Estado do Rio de Janeiro', 70000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Centro de Pesquisa em Ciência, Tecnologia e Sociedade", 45000.00, 'DISOC', 'SUDESTE', 'BANESPA - Banco do Estado de São Paulo', 45000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Retrato das Desigualdades de Gênero e Raça", 25000.00, 'DISOC', 'SUDESTE', 'BANESPA - Banco do Estado de São Paulo', 85000.00);
INSERT INTO Projetos (nome_projeto, valor_projeto, departamento_projeto, filial_projeto, fonte_projeto, investimento_projeto) VALUES ("Índice de Vulnerabilidade Social", 60000.00, 'DISOC', 'SUDESTE', 'BDMG - Banco de Desenvolvimento de Minas Gerais', 120000.00);

SELECT * FROM Projetos;

-- Criando a primeira tabela, dos pesquisadores
CREATE TABLE Pesquisadores (
id_pesquisador INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nome_pesquisador varchar(100),
status_pesquisador varchar(100),
valor_pesquisador double,
cidade_pesquisador varchar(100),
estado_pesquisador varchar(100),
nome_projeto varchar(100),
departamento_projeto varchar(100),
FOREIGN KEY (nome_projeto) REFERENCES Projetos(nome_projeto),
FOREIGN KEY (departamento_projeto) REFERENCES Projetos(departamento_projeto)
);

-- Inserindo os dados tabela Pesquisadores
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Miguel Silva', 'Ativo', 3100.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Acesso a Oportunidades'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIDES'), 'Boa Vista', 'Roraima');

/*
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Arthur Carvalho', 'Ativo', 2500.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Emprego no Turismo'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIMAC'), 'Palmas', 'Tocantins');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Helena Sousa', 'Inativo', 4000.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Brasil em Desenvolvimento'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIRUR'), 'Porto Alegre', 'Rio Grande do Sul');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Laura Pereira', 'Ativo', 2500.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Mapa das Organizações da Sociedade Civil'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIMAC'), 'Macapa', 'Amapa');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Gabriel Luz', 'Ativo', 3200.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Observatório de Gestão do Conhecimento '), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIDES'), 'Belem', 'Para');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Samuel Santos', 'Inativo', 2000.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Acesso a Oportunidades'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIDES'), 'Palmas', 'Tocantins');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Maria Oliveira', 'Ativo', 2500.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Acesso a Oportunidades'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIDES'), 'Boa Vista', 'Roraima');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Alice Rodrigues', 'Ativo', 3100.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Brasil em Desenvolvimento'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIRUR'), 'Florianopolis', 'Santa Catarina');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Bernardo Alves', 'Ativo', 2000.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Mapa das Organizações da Sociedade Civil'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIMAC'), 'Porto Velho', 'Rondonia');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Theo Gomes', 'Inativo', 2500.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Observatório de Gestão do Conhecimento '), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DIDES'), 'Rio Branco', 'Acre');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Ailton Santos', 'Ativo', 3100.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Atlas da Violência'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DINTE'), 'Cabo Frio', 'Rio de Janeiro');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Ana Beatriz', 'Ativo', 2100.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Retrato das Desigualdades de Gênero e Raça'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DISOC'), 'Campinas', 'São Paulo');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Bruno Gomes', 'Inativo', 3500.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Retrato das Desigualdades de Gênero e Raça'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DISOC'), 'Guarulhos', 'São Paulo');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Leticia Rodrigues', 'Ativo', 2500.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Índice de Vulnerabilidade Social'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DISOC'), 'Belo Horizonte', 'Minas Gerais');
INSERT INTO Pesquisadores(nome_pesquisador, status_pesquisador, valor_pesquisador, nome_projeto, departamento_projeto, cidade_pesquisador, estado_pesquisador) VALUES ('Vinicius Silva', 'Ativo', 2800.00, (SELECT nome_projeto FROM Projetos WHERE nome_projeto = 'Atlas da Violência'), (SELECT departamento_projeto FROM Projetos WHERE departamento_projeto = 'DINTE'), 'São Paulo', 'São Paulo');
*/

SELECT * FROM Pesquisadores;


