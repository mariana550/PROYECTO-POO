CREATE DATABASE IF NOT EXISTS clientes_gym;
USE clientes_gym;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    peso DOUBLE NOT NULL,
    contraseña VARCHAR(50) NOT NULL
);
SELECT * FROM usuarios;
