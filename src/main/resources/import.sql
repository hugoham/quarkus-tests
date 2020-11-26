
create database quarkus
go

use quarkus
go

create table quarkus_data (
    id integer,
    name varchar(100)
)
go

insert into quarkus_data values (1, 'Hugo');
insert into quarkus_data values (2, 'Emmely');

select * from quarkus_data