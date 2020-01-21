Intro to MySQL
Intro to db tables
Intro to database design,primary keys, foreign keys
Intro to DDL
Intro to DML
Intro to queries
-------------
Intro to RDMS Theory
Intro to Normalization

create table demo(id serial,name varchar(100))

insert into demo (name) values ('Chief Ozzy')
insert into demo (name) values ('Student Kparo')
insert into demo (name) values ('Student Ozigi')
insert into demo (name) values ('Student Worldbest')

select * from demo;

/*public class SalaryLevel
{
private Serial id;
private String grade;
private Double salary;
}*/

create table salarygrades(
grade varchar(10) primary key not null,
salary decimal(12,3) not null, 
deduction decimal(12,3) null,
overtime decimal(12,3) null,
description varchar(256)
)

-- alter table salarygrades  add description varchar(256)
-- drop table taxbracket 
create table taxbracket(
bracket varchar(10) primary key not null,
-- grade varchar(10) not null constraint fk_bracket_grade foreign key references salarygrades(grade),
grade varchar(10) not null,
taxpercent decimal(12,3),
description varchar(256)
)

drop table employees 
create table employees(
id varchar(20) not null primary key,
firstname varchar(100) not null,
lastname varchar(100) not null,
gender varchar(20) not null,
age tinyint not null,
address varchar(100) not null,
phone varchar(12) not null,
email varchar(100) null
)

create table payrollmaster
(
id serial not null primary key,
name varchar(128) not null,
payrolldate date not null,
description varchar(256)
)

create table payrolldetails
(
id serial not null primary key,
employee_id varchar(20) not null,
payroll_id integer not null,
netsalary decimal(12,3) not null,
actualtax decimal(12,3) not null,
aftertax decimal(12,3) not null,
description varchar(256)
)



Employees->Salary Levels
Employees->Tax brackets


