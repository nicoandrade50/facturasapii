CREATE TABLE IF NOT EXISTS asistente(
id SERIAL,
nombre VARCHAR(50) NOT NULL,
correo VARCHAR(50) NOT NULL,
institucion VARCHAR(50),
PRIMARY KEY(id),
UNIQUE(correo)
);