CREATE DATABASE mydb;
USE mydb;

CREATE TABLE USER(
EMAIL VARCHAR(30) PRIMARY KEY,
FIRST_NAME VARCHAR(30) NOT NULL,
LAST_NAME VARCHAR(30) NOT NULL,
PASSWORD VARCHAR(30) NOT NULL
);

--PUT MORE DATA:
INSERT INTO USER VALUES ("abc@gmail.com","joe","chan","123");

