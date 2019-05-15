create table hydro (id_stacji integer not null,
stacja varchar(50) not null,
rzeka varchar(50) not null,
województwo varchar(50),
stan_wody integer,
stan_wody_data_pomiaru date,
temperatura_wody numeric(4,2),
temperatura_wody_data_pomiaru date,
zjawisko_lodowe integer,
zjawisko_lodowe_data_pomiaru date,
zjawisko_zarastania integer,
zjawisko_zarastania_data_pomiaru date,
PRIMARY KEY (id_stacji)
);