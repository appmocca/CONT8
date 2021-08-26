DROP DATABASE IF EXISTS mydb;
DROP TABLE IF EXISTS USER;
DROP TABLE IF EXISTS BOOK;
DROP TABLE IF EXISTS PURCHASE_RECORD;

CREATE DATABASE mydb;
USE mydb;

CREATE TABLE USER(
EMAIL VARCHAR(30) PRIMARY KEY,
FIRST_NAME VARCHAR(30) NOT NULL,
LAST_NAME VARCHAR(30) NOT NULL,
PASSWORD VARCHAR(30) NOT NULL
);

--PUT MORE DATA:
INSERT INTO USER VALUES ("joe123@gmail.com","kwok","chan","123");
INSERT INTO USER VALUES ("bcd@gmail.com","mary","cheung","123");
INSERT INTO USER VALUES ("abc@gmail.com","chan","j","123");

CREATE TABLE BOOK(
BNumber VARCHAR(30) PRIMARY KEY,
Book_NAME VARCHAR(30) NOT NULL,
Aurthor_FNAME VARCHAR(30) NOT NULL,
Aurthor_LNAME VARCHAR(30) NOT NULL,
Date_of_Publish DATETIME NOT NULL,
URL VARCHAR(30) NOT NULL);

-- PUT MORE DATA FOR BOOK 
INSERT INTO BOOK VALUES ("BN001",	);

CREATE TABLE PURCHASE_RECORD(
EMAIL VARCHAR(30),
BNumber VARCHAR(30),
Date_of_Purchase DATETIME NOT NULL,
PRIMARY KEY(EMAIL,BNumber),
FOREIGN KEY (EMAIL) REFERENCES USER(EMAIL),
FOREIGN KEY (BNumber) REFERENCES BOOK(BNumber));

-- PUT MORE DATA FOR PURCHASE_RECORD 
