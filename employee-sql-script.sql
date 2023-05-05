create database if not exists employee_directory;
use employee_directory;

drop table if exists employee;

create table employee(
	id int not null auto_increment,
    first_name varchar(45) default null,
    last_name varchar(45) default null,
    email varchar(45) default null,
    primary key(id)
    ) engine=InnoDB auto_increment=1 default charset=latin1;
    
-- Dummy data

INSERT INTO employee (first_name, last_name, email)
VALUES
    ('John', 'Doe', 'john.doe@example.com'),
    ('Jane', 'Smith', 'jane.smith@example.com'),
    ('Bob', 'Johnson', 'bob.johnson@example.com'),
    ('Samantha', 'Williams', 'samantha.williams@example.com'),
    ('Chris', 'Lee', 'chris.lee@example.com');


-- implementing the default spring security schema -->
drop table if exists authorities;
drop table if exists users;

create table users(
    username varchar(50) not null,
    password varchar(68) not null,
    enabled tinyint not null,
    primary key(username)
)ENGINE=InnoDB DEFAULT charset=latin1;

insert into users values
    ('john', '{bcrypt}$2a$10$zTK6u2/7Yvs035nDjhPyfOlk3HdWUym9lGUuNHVuMlsy.b5KyWNrG', 1),
    ('mary', '{bcrypt}$2a$10$UoEPKPMg1o90v56l5MeOuOHC7RI7pSU4t7mRPZd4LjJVMuGJO2I8O', 1),
    ('susan', '{bcrypt}$2a$10$.W5mPL4A9U4IKSczcyTtt.zAWvgf/4NK7/gc1cqMpuCObYVsWILRq', 1);

create table authorities(
    username varchar(50) not null,
    authority varchar(50) not null,
    unique key authorities_idx_1 (username, authority),
    constraint authorities_ibfk_1 foreign key(username) references users (username)
)ENGINE=InnoDB DEFAULT charset=latin1;

insert into authorities values
    ('john', 'ROLE_EMPLOYEE'),
    ('mary', 'ROLE_EMPLOYEE'),
    ('mary', 'ROLE_MANAGER'),
    ('susan', 'ROLE_EMPLOYEE'),
    ('susan', 'ROLE_MANAGER'),
    ('susan', 'ROLE_ADMIN');