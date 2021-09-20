use Ecommerce;
create table prod(
    id int(9) auto_increment,
    produto varchar(20) not null,
    preco decimal (8,2),
    marca varchar (20) not null,
    estoque int (3),
    cor varchar(10), 
    primary key (id)
);

insert into prod (produto, preco, marca, estoque, cor) values ("Tenis",699.99,"Adidas",10,"preto");
insert into prod (produto, preco, marca, estoque, cor) values ("Camisa", 59.99,"Nike",8,"azul");
insert into prod (produto, preco, marca, estoque, cor) values ("Short",49.99,"Ciclone",11,"verde");
insert into prod (produto, preco, marca, estoque, cor) values ("Relogio",899.99,"Rolex",13,"preto");
insert into prod (produto, preco, marca, estoque, cor) values ("blusa",159.99, "Ecko",5,"rosa");
insert into prod (produto, preco, marca, estoque, cor) values ("cachecol",29.99,"Marca1",22,"laranja");
insert into prod (produto, preco, marca, estoque, cor) values ("Meia",19.99,"Adidas",31,"preta");
insert into prod (produto, preco, marca, estoque, cor) values ("Chapeu",599.99,"Nike",3,"branco");

select * from prod; 

select * from prod where preco >500;
select * from prod where preco <500;

update prod set preco = 17.99 where id =7;

