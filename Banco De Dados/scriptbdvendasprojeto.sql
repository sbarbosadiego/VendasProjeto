CREATE SCHEMA bdvendasprojeto
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

/* Usar show databases para conferir se a mesma foi criada corretamente */

USE bdvendasprojeto;

CREATE TABLE IF NOT EXISTS tbl_cliente (
pk_id_cliente SERIAL NOT NULL AUTO_INCREMENT PRIMARY KEY,
cliente_nome VARCHAR(60) NOT NULL,
cliente_endereco VARCHAR(60),
cliente_bairro VARCHAR(50),
cliente_numero VARCHAR(10),
cliente_cidade VARCHAR(35),
cliente_uf VARCHAR(2),
cliente_cep VARCHAR(9),
cliente_telefone VARCHAR(15) NOT NULL
);

CREATE TABLE IF NOT EXISTS tbl_usuario (
pk_id_usuario SERIAL NOT NULL AUTO_INCREMENT PRIMARY KEY,
usuario_nome VARCHAR(60) NOT NULL,
usuario_login VARCHAR(50) NOT NULL,
usuario_senha VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS tbl_produto (
pk_id_produto SERIAL NOT NULL AUTO_INCREMENT PRIMARY KEY,
produto_nome VARCHAR(100) NOT NULL,
produto_valor DECIMAL(10,2),
produto_estoque INT
);

CREATE TABLE IF NOT EXISTS tbl_vendas (
pk_id_vendas SERIAL NOT NULL AUTO_INCREMENT PRIMARY KEY,
fk_cliente BIGINT UNSIGNED NOT NULL,
venda_data DATE,
venda_valor_liquido DECIMAL(10,2),
venda_valor_bruto DECIMAL(10,2),
venda_desconto DECIMAL(10,2)
);

CREATE TABLE IF NOT EXISTS tbl_vendas_produtos (
pk_id_venda_produto SERIAL NOT NULL AUTO_INCREMENT PRIMARY KEY,
fk_produto BIGINT UNSIGNED,
fk_venda BIGINT UNSIGNED,
venda_produto_valor DECIMAL(10,2),
venda_produto_quantidade INT
);

/* Criar chaves estrangeiras */
ALTER TABLE tbl_vendas
ADD FOREIGN KEY (fk_cliente)
REFERENCES tbl_cliente(pk_id_cliente);

ALTER TABLE tbl_vendas_produtos
ADD FOREIGN KEY (fk_produto)
REFERENCES tbl_produto(pk_id_produto);

ALTER TABLE tbl_vendas_produtos
ADD FOREIGN KEY (fk_produto)
REFERENCES tbl_vendas(pk_id_vendas);
