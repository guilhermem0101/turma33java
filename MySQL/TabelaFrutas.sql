create database db_cidade_das_frutas;
use db_cidade_das_frutas;
CREATE TABLE `tb_categoria` (
	`semente` BOOLEAN NOT NULL,
	`citrica` BOOLEAN NOT NULL,
	`madura` BOOLEAN NOT NULL,
	`id` INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_produto` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(20) NOT NULL,
	`quabtidade` INT(20) NOT NULL,
	`preco` INT(20) NOT NULL,
	`validade` DATE NOT NULL,
	`peso_unitario` DECIMAL(20) NOT NULL,
	`fk_categoria` INT NOT NULL,
	PRIMARY KEY (`id`),
    FOREIGN KEY (`fk_categoria`) REFERENCES `tb_categoria`(`id`)
);

insert into tb_categoria (semente,citrica,madura) values
(true,true,true),
(true,true,false),
(false,false,false),
(true,false,true),
(false, false,true);

insert into tb_produto (nome,quabtidade,preco,validade,peso_unitario,fk_categoria) values
("banana",4,5.00,"2021-10-06",200,3),
("maça",10,6.00,"2022-05-21",300,5),
("melancia",1,10.00,"2021-11-25",5000,4),
("limão",8,3.00,"2022-01-03",100,1),
("laranja",5,7.45,"2021-12-12",500,2),
("melão",2,8.99,"2022-01-05",3000,4),
("goiaba",12,3.50,"2023-05-31",100,5),
("manga",5,5.00,"2021-12-25",300,4);

select * from tb_produto where preco >50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%C%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.fk_categoria;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.fk_categoria where fk_categoria =4 ;
