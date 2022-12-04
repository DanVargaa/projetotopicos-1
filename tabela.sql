use anotacao;
drop table medida;
create table medida (
  medida_id bigint primary key auto_increment,
  temperatura float not null,
  fumaca float not null,
  date_time varchar(30) not null
);
insert into medida(temperatura,fumaca,date_time)
 values(10.0,5.3,'2022-10-10 11:00'),(10.0,5.3,'2022-10-10 11:00');