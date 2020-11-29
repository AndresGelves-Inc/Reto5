CREATE TABLE IF NOT EXISTS usuarios(
	id_usuario varchar(50) not null,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
	email varchar(100) not null,
    celular char(10) not null,
    contrasena varchar(50) not null,
    fecha_nacimiento date not null,
	primary key(id_usuario)
);

insert into usuarios (id_usuario, nombre, apellido, email, celular, contrasena, fecha_nacimiento)
values
('lucky', 'Pedro', 'Perez', 'pedro.perez@gmail.com', '3000000000', 'pedro.perez', '1994-11-25'),
('malopez', 'Maria' , 'Lopez', 'maria.lopez@gmail.com', '3000000001', 'maria.lopez', '1990-02-14'),
('diva ', ' Ana        ', ' Diaz         ', 'ana.diaz@gmail.com', '3000000002', 'ana.diaz', '2000-05-12'),
('dreamer', 'Luis',  'Rojas' , 'luis.rojas@gmail.com', '3000000003', 'luis.rojas',  '1995-07-20'),
('ninja', 'Andres', 'Cruz', 'andres.cruz@gmail.com', '3000000004', 'andrez.cruz', '1992-01-30'),
('neon', 'Nelson',  'Ruiz', 'nelson.ruiz@gmail.com', '3000000005', 'nelson.ruiz', '1994-08-03'),
('rose', 'Claudia', 'Mendez', 'claudia.mendez@gmail.com', '3000000006', 'claudia.mendez', '1984-07-24'),
('green ', ' Jorge      ', ' Rodriguez    ', 'jorge.rodriguez@gmail.com', '3000000007', 'jorge.rodriguez', '1980-06-25'); 