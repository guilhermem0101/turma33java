create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categoria(
        id bigint auto_increment,
        tipo varchar(20),
        comprimidos int,
        laboratótio varchar(20),
        primary key (id)
);

insert into tb_categoria(tipo,comprimidos, laboratótio)
VALUES
("Alopático", 20, "EMS CORP"),
("Genérico", 30, "HYPERA PHARMA"),
("Fitoterápico", 30, "ACHÉ"),
("Homeopático", 10, "BAYER"),
("Referência", 20, "EUROFARMA");

create table tb_produto(
    id bigint auto_increment,
    fk_id_categoria bigint,
    nome varchar (20),
    dose int,
	validade varchar(20), 
    geometria varchar(20),
    preço decimal (2.2),
    primary key (id),
    foreign key (fk_id_categoria) references tb_categoria (id)
);



insert into tb_produto(nome,dose,validade,geometria,preço,fk_id_categoria) 
values 
("Escitalopram", 3,"2024-08-11","redondo",50.00,2),
("Mirtazapina",4,"2027-09-28","cilindro",60.00,4),
("Citalopram",2,"2023-04-12","cilindro",40.00,3),
("Diazepam",1,"2022-06-17","redondo",45.00,4),
("Alprazolam",2,"2022-05-04","cilindro",49.50,1),
("Clozapina",3,"2022-07-31","redondo",47.30,3),
("Risperidona ",5,"2023-02-21","redondo",35.00,5),
("Bromazepam",1,"2024-03-19","cilindro",60.00,2);


select * from tb_produto where preço > 50;

select * from tb_produto where preço between 3 and 60;

select * from tb_produto where sabor like "%B%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id  = tb_produto.fk_id_categoria;

select * from tb_produto inner join tb_categoria
on tb_categoria.id  = tb_produto.fk_id_categoria
where fk_id_categoria = 2;