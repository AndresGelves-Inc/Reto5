DROP SCHEMA IF EXISTS redflix;
CREATE SCHEMA redflix;
use redflix;

create table director(
    id_director  int primary key,
    nombre_director  char(30),
    apellidos_director char(30),
    nacionalidad  char(40)
);
create table serie(
    id_serie  int primary key,
    titulo  char(45),
    temporadas integer,
    episodios integer
);
create table usuario(
	user_name  char(20) primary key,
    nombre_user  char(25),
    apellido_user char(25),
    email  char(40),
    celular  long,
    contrasenia char(20),
    fecha_nacimiento char(40)
);
create table pelicula(
    id_pelicula  int primary key,
    titulo  char(45) NOT NULL,
    resumen longtext,
    anio integer,
    id_director integer,
    FOREIGN KEY (id_director) REFERENCES director(id_director)
);
CREATE TABLE contenidos(
	contenido_id_ INT primary key,
    id_pelicula int,
    id_serie int,
    titulos char(45),
    FOREIGN KEY (id_pelicula) REFERENCES pelicula(id_pelicula),
    FOREIGN KEY (id_serie) REFERENCES serie(id_serie)
);
CREATE TABLE registro_transm(
	idregistro_transm INT NOT NULL,
    user_name char(20),
    id_contenido integer,
    date_time char(25),
    FOREIGN KEY (user_name) REFERENCES usuario(user_name),
    FOREIGN KEY (id_contenido) REFERENCES contenidos(contenido_id_)
);
insert into director values (101, 'Hayo','Miyazaki', 'japones');
insert into director values (102, 'Joss', 'Whedon', 'estadounidense');
insert into director values (103, 'Christopher', 'Nolan', 'estadounidense');
insert into director values (104, 'Bong', 'Joon-ho', 'coreano');
insert into director values (105, 'Vincent', 'Ward', 'neozelandes');
insert into serie values (100, 'The walking dead', 11, 153);
insert into serie values (101, 'Viaje a las estrellas: la serie original', 3, 80);
insert into serie values (102, 'Glow', 3, 30);
insert into serie values (103, 'La casa de papel', 4, 31);
insert into serie values (104, 'Friends', 10, 236);
insert into serie values (105, 'Arrow', 8, 170);
insert into serie values (106, 'The big bang theory', 12, 279);
insert into serie values (107, 'Vikingos', 6, 79);
insert into usuario values ('lucky', 'Pedro', 'Perez', 'lucky@gmail.com', 310221122, 'lucky12342', '13-jun-1990');
insert into usuario values ('malopez', 'Maria', 'Lopez', 'malopez@gmail.com', 312211445, 'malopez123', '01-ene-1987');
insert into usuario values ('diva', 'Ana', 'Diaz', 'diazana@gmail.com', 3214433282, 'diva321', '15-ago-1993');
insert into usuario values ('dreamer', 'Luis', 'Rojas', 'luisrojas@gmail.com', 3224433201, 'rojas4321', '22-jul-1991');
insert into usuario values ('ninja', 'Andres', 'Cruz', 'andres.cruz@gmail.com', 3239955432, 'cruz45543', '30-nov-1994');
insert into usuario values ('neon', 'Nelson', 'Ruiz', 'ruiznelson@gmail.com', 3004433321, 'nelson2211', '10-may-1979');
insert into usuario values ('rose', 'Claudia', 'Mendez', 'claumendez@gmail.com', 3043322910, 'claumend211', '02-sep-1992');
insert into usuario values ('green', 'Jorge', 'Rodriguez', 'jorge.rodri@gmail.com', 3129943321, 'jorsh1234', '29-dic-1987');
insert into pelicula values (100, 'Los Vengadores', 'Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.', 1990 , 102);
insert into pelicula values (101, 'Interestelar', 'Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.', 2014 , 103);
insert into pelicula values (102, 'El viaje de Chihiro', 'Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.', 2001 , 101);
insert into pelicula values (103, 'Parasitos', 'Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.', 2019 , 104);
insert into pelicula values (104, 'Mas alla de los sueños', 'Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.', 1998 , 105);
insert into contenidos values (1, 100, null,'Los Vengadores');
insert into contenidos values (2, 101, null,'Interestelar');
insert into contenidos values (3, 102, null,'El viaje de Chihiro');
insert into contenidos values (4, 103, null,'Parasitos');
insert into contenidos values (5, 104, null,'Mas alla de los sueños');
insert into contenidos values (6, null, 100,'The walking dead');
insert into contenidos values (7, null, 101,'Viaje a las estrellas: la serie original');
insert into contenidos values (8, null, 102,'Glow');
insert into contenidos values (9, null, 103,'La casa de papel');
insert into contenidos values (10, null, 104,'Friends');
insert into contenidos values (11, null, 105,'Arrow');
insert into contenidos values (12, null, 106,'The big bang theory');
insert into contenidos values (13, null, 107,'Vikingos');
insert into registro_transm values (1, 'lucky', 1, '2017-10-25 20:00:00');
insert into registro_transm values (2, 'lucky', 4, '2019-03-15 18:30:00');
insert into registro_transm values (3, 'lucky', 9, '2019-05-20 20:30:00');
insert into registro_transm values (4, 'malopez', 1, '2018-05-20 20:30:00');
insert into registro_transm values (5, 'malopez', 9, '2020-01-20 20:30:00');
insert into registro_transm values (6, 'diva', 2, '2019-05-20 20:30:00');
insert into registro_transm values (7, 'diva', 3, '2018-06-22 21:30:00');
insert into registro_transm values (8, 'diva', 6, '2020-03-17 15:30:20');
insert into registro_transm values (9, 'dreamer', 6, '2020-03-17 15:30:20');
insert into registro_transm values (10, 'dreamer', 7, '2020-04-10 18:30:20');
insert into registro_transm values (11, 'ninja', 8, '2020-02-17 20:30:20');
insert into registro_transm values (12, 'ninja', 9, '2020-02-20 16:30:20');
insert into registro_transm values (13, 'ninja', 11, '2020-03-27 18:30:20');
insert into registro_transm values (14, 'rose', 10, '2020-03-20 21:30:20');
insert into registro_transm values (15, 'green', 2, '2020-01-10 17:30:20');
insert into registro_transm values (16, 'green', 4, '2020-02-15 20:30:20');
insert into registro_transm values (17, 'green', 5, '2020-03-17 18:30:20');