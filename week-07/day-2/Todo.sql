create database TodoApplication;
use TodoApplication;
create table todo (
TaskID int not null auto_increment primary key,
NameTaks varchar(50)
);

create table doing (
TaskID int(2)
);

create table Review (
TaskID int(5)
);

create table Done (
TaskID int(20)
);

INSERT INTO todo(NameTaks) values ('Print usage'), ('List tasks'), ('Empty list'), ('Add new task');
SELECT * FROM todo;

