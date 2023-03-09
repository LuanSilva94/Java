CREATE DATABASE db_registroescola;

USE db_registroescola;

/*primary key serve para identificação unica dentro da tabela
(na gen usaremo o id para linkar a primary key)
*/
CREATE TABLE tb_estudantes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
nota DECIMAL(4,2),
matricula INT(10),
turma VARCHAR(10),
periodo VARCHAR(10),
transporte BOOLEAN
);

INSERT INTO tb_estudantes(nome,nota,matricula,turma,periodo,transporte)
VALUES("Maria",08.50,456789123,"3A","noite",true),
("Jonas",10.00,355998525,"9A","manhã",false),
("Joaquina",9.0,445689771,"2B","noite",true),
("Clara",6.5,445689771,"7G","tarde",false),
("Plínio",5.50,899443100,"3A","noite",true),
("Francisco",7.9,899443101,"3C","noite",true),
("Josefa",9.5,565789440,"6D","manhã",false),
("Cléubio",10.0,411230689,"2F","noite",true);

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota > 7.00;

SELECT * FROM tb_estudantes WHERE nota < 7.00;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_estudantes SET nota = 4.5 WHERE id = 7;