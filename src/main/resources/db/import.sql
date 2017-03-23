drop table if exists user;
-- drop table if exists hotel;

create table user (id int primary key auto_increment, name varchar);
-- create table hotel (city int, name varchar, address varchar, zip varchar);

insert into user (name) values ('ivan');
insert into user (name) values ('luo');
-- insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001')