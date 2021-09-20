create database db_funcionaries;
use db_funcionaries;
create table tb_func(
    id bigint(9) auto_increment,
    nome varchar(20) not null,
    salario decimal (6,2),
    fucao varchar (20) not null,
    idade int (3),
    genero varchar(1), 
    primary key (id)
);

insert into tb_func (nome, salario, fucao, idade, genero)
values ("João", 1100.00, "Atendente",19,"M");
insert into tb_func (nome, salario, fucao, idade, genero)
values ("Julio", 3000.00, "Supervisor",32,"M");
insert into tb_func (nome, salario, fucao, idade, genero)
values ("Helena", 1500.00, "Monitora",24,"F");
insert into tb_func (nome, salario, fucao, idade, genero)
values ("Ana", 7000.00, "Gerente",35,"F");
insert into tb_func (nome, salario, fucao, idade, genero)
values ("Inacio", 5500.00, "Subgerente",26,"M");
select * from tb_func; 
select * from tb_func where salario >2000.00;
select * from tb_func where salario <2000.00;
update tb_func set salario =3100.00 where id =2;


drop database db_funcionaries;