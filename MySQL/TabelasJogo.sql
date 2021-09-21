create database db_generation_game_online;
use db_generation_game_online;
create table tb_classes (
	id bigint auto_increment,
    nome varchar(20),
    poder varchar(20),
    energia int,
    primary key (id) 

 );
 insert into tb_classes (nome, poder, energia) 
		values ("maga", "bola de fogo", 50);
insert into tb_classes (nome, poder, energia) 
		values ("arqueira", "chuva de flechas", 100);
insert into tb_classes (nome, poder, energia) 
		values ("tank", "destruição", 120);
insert into tb_classes (nome, poder, energia) 
		values ("morte", "sugadora de almas", 150);
insert into tb_classes (nome, poder, energia) 
		values ("guerreiro", "espadada",180);

create table tb_personagens(
id bigint auto_increment,
nome varchar(20),
genero varchar(20),
raça varchar(20),
ataque int,
vida int,
primary key (id),
fk bigint,
foreign key (fk) references tb_classes(id)
);
insert into  tb_personagens (nome, genero, raça, ataque, vida, fk) 
values 
("Guilherme","ele", "Morcego", 40, 150, 3),
("Matheus","ela", "humana", 20, 150, 3),
("Keren","elu", "bullywug", 8, 50, 4),
("graebin", "ele", "Humana", 22, 100, 2),
("Ilanna", "ela", "bullywug",25,120,4),
("Juan", "elu", "Jacare",21,110,4),
("Zé", "ele", "Morecego",11,80,2),
("Maria", "ela", "Humana",21,70,1);

select * from tb_personagens; 


select * from tb_personagens where ataque > 200;

select * from tb_personagens where ataque between 1000 and 2000;

select * from tb_personagens where nome like "%C%";

select * from tb_personagens inner join tb_classes
on tb_classes.id  = tb_personagens.fk;

select * from tb_personagens inner join tb_classes
on tb_classes.id  = tb_personagens.fk
where fk = 3;
 