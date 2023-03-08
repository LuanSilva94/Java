CREATE DATABASE db_RHservice;

USE db_RHservice;

CREATE TABLE tb_funcionarios(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
cargo VARCHAR(50),
salario DECIMAL(7,2),
idade INT,
genero VARCHAR(10)
);

INSERT INTO tb_funcionarios(nome,cargo,salario,idade,genero) VALUES("Luan","Dev junior",5000.00,28,"Masculino"),("Luciano","Aprendiz",900.00,16,"Masculino"),
("Fernanda","Estagiaria",1800.00,21,"Feminino"),("Marta","Gerente de Projetos",35000.00,32,"Feminino"),
("Paulo","Dev Sênior",20000.00,37,"Masculino");

SELECT *FROM tb_funcionarios WHERE salario > 2000.00;

SELECT *FROM tb_funcionarios WHERE salario < 2000.00;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_funcionarios SET salario = 5000.00, cargo = "Dev junior" WHERE id = 3;
