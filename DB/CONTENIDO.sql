CREATE TABLE IF NOT EXISTS contenido(
	id_contenido int auto_increment,
    titulo_contenido varchar(100),
    tipo varchar(50),
    primary key (id_contenido)
);

insert into contenido (titulo_contenido, tipo)
values
('Los Vengadores','pelicula'),
('Interestelar', 'pelicula'),
('El viaje de Chihiro', 'pelicula'),
('Parasitos', 'pelicula'),
('Mas alla de los sueños', 'pelicula'),
('The walking dead', 'serie'),
('Viaje a las estrellas: la serie original', 'serie'),
('Glow', 'serie'),
('La casa de papel', 'serie'),
('Friends', 'serie'),
('Arrow', 'serie'),
('The big bang theory', 'serie'),
('Vikingos', 'serie');