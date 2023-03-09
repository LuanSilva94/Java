CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

/* criar a classe(categoria) primeiro, atribuir valores a ela, depois criar produtos
pois iremos usar o id da categoria com referência
*/

CREATE TABLE tb_classes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tipo VARCHAR(50),
hp INT(4)
);

CREATE TABLE tb_personagens(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nick VARCHAR(50),
nivel int(3),
poderAtak INT(5),
defesa INT(5),
classes_id bigint,

FOREIGN KEY (classes_id) REFERENCES tb_classes (id)
);

INSERT INTO tb_classes (tipo,hp) values ("mago",2000),("soldado",5000),("ladino",3000),("tank",8000),("suporte",7000);

INSERT INTO tb_personagens(nick,nivel,poderAtak,defesa,classes_id)
VALUES("Killua",99,6000,5000,1),
("Seya",80,7000,9999,2),
("Hiei",70,2000,1500,3),
("Vegeta",100,9000,8500,4),
("Lellouch",60,100,50,5),
("Chihiro",100,10,20,5),
("Madara",100,7000,4000,4),
("Sakura",40,200,150,1);

SELECT * FROM tb_classes;

SELECT * FROM tb_personagens;

SELECT * FROM tb_personagens WHERE poderAtak > 2000;

SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nick LIKE "%c%";

/*não precisa colocar atributos, pode usar "*", ou colocar ponto*/

SELECT * from tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id;

SELECT * from tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id
WHERE tb_classes.tipo = "mago";

SELECT * from tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id
WHERE tb_classes.tipo = "soldado";



