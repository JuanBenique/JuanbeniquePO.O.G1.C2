CREATE TABLE participante (
    dni TEXT PRIMARY KEY,
    nombre TEXT NOT NULL,
    apellidos TEXT NOT NULL,
    carrera TEXT NOT NULL,
    tipo_participante TEXT NOT NULL,
    estado INTEGER NOT NULL CHECK (estado IN (0, 1))
);