create database db_estudantes;
use db_estudantes;
create table tb_estudantes(
    id bigint(9) auto_increment,
    nome varchar(20) not null,
    nota decimal (6,2),
    sala int(3) not null,
    idade int (3),
    genero varchar(1), 
    primary key (id)
);

insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("João", 8.2, 3,12,"M");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("Julio", 5.3, 3,13,"M");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("Helena", 4.8, 1,11,"F");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("Ana", 7.9, 2,14,"F");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("Inacio", 9.0, 1,15,"M");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("Paulo", 6.2, 2, 16, "N");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("Aline", 8.5, 1, 13, "F");
insert into tb_estudantes (nome, nota, sala, idade, genero)
values ("FAbio", 9.3, 3, 12, "M");
select * from tb_estudantes; 
select * from tb_estudantes where nota >7;
select * from tb_estudantes where nota <7;
update tb_estudantes set nota =5.8 where id =2;


drop database db_estudantes;