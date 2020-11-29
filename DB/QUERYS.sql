SELECT 'Consulta 1';
SELECT TITULO FROM PELICULAS
UNION
SELECT TITULO FROM SERIES;

SELECT 'Consulta 2';
SELECT TITULO, RESUMEN, FECHA_LANZAMIENTO FROM PELICULAS
WHERE FECHA_LANZAMIENTO > 2000
ORDER BY TITULO;

SELECT 'Consulta 3';
SELECT TITULO FROM PELICULAS
WHERE DIRECTOR = 'Vincent Ward';

SELECT 'Consulta 4';
SELECT TITULO_CONTENIDO FROM TRANSMISIONES
WHERE USERNAME = 'lucky'
ORDER BY TITULO_CONTENIDO;

SELECT 'Consulta 5';
SELECT U.ID_USUARIO, U.NOMBRE, U.APELLIDO FROM USUARIOS U
LEFT JOIN TRANSMISIONES T ON U.ID_USUARIO = T.USERNAME
WHERE T.TITULO_CONTENIDO = 'Interestelar        '
ORDER BY U.NOMBRE;

SELECT 'Consulta 6';
SELECT COUNT(TITULO) FROM PELICULAS
WHERE FECHA_LANZAMIENTO > 2000;
