CREATE TABLE IF NOT EXISTS directores(
	id_director INT auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
	nacionalidad varchar(100) not null,
	primary key(id_director)
);

insert into directores(nombre, apellido, nacionalidad)
values
('Hayo', 'Miyazaki', 'Japón'),
('Joss', 'Whedon', 'Estados Unidos'),
('Christopher', 'Nolan', 'Estados Unidos'),
('Bong', 'Joon-ho', 'Corea del Sur'),
('Vincent', 'Ward', 'Nueva Zelanda');