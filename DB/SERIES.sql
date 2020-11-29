CREATE TABLE IF NOT EXISTS series(
	id_serie INT auto_increment,
    titulo varchar(100) not null,
    episodios int not null,
	temporadas int not null,
	primary key(id_serie)
);

insert into series(titulo, episodios, temporadas)
values
('The walking dead', 153, 11),
('Viaje a las estrellas: la serie original', 80, 3),
('Glow', 30, 3),
('La casa de papel', 31, 4),
('Friends', 236, 10),
('Arrow', 170, 8),
('The big bang theory', 279, 12),
('Vikingos', 79, 6);