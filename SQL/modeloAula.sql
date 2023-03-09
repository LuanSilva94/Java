
-- comando para criação de banco de dados
create database db_quitanda;

-- comando que indica ao mysql workbench o banco de dados usado
use db_quitanda;
create table tb_produtos(
id bigint auto_increment primary key,

nome_produto varchar(255),
preco decimal(6,2)
);


-- comando que trás todos os dados da tabela de produtos
select * from tb_produtos;

insert into tb_produtos(nome_produto, preco) values("Banana", 2.50),("Mexerica", 4.50);

-- desativa o modo seguro do mysql e permite update e delete
set SQL_SAFE_UPDATES = 0;

-- atualização de um dado dentro da minha tabela
update tb_produtos set preco = 7.90 where id = 2;


