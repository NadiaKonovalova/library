CREATE DATABASE IF NOT EXISTS usersList;
USE usersList;

CREATE TABLE IF NOT EXISTS USERS(
userId int not null auto_increment,
nameSurname varchar(100) not null, 
phoneNumber varchar(50) not null,
email varchar (100) not null,
primary key(userId, phoneNumber)

);

SELECT * FROM users;

INSERT INTO users (nameSurname, phoneNumber, email) VALUES('Janis Berzins', '2569876', 'janis.b@nhjk.lv');


