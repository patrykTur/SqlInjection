create table hydro (id_stacji integer not null,
stacja varchar(50) not null,
rzeka varchar(50) not null,
województwo varchar(50),
stan_wody varchar(50),
stan_wody_data_pomiaru varchar(50),
temperatura_wody varchar(50),
temperatura_wody_data_pomiaru varchar(50),
zjawisko_lodowe varchar(50),
zjawisko_lodowe_data_pomiaru varchar(50),
zjawisko_zarastania varchar(50),
zjawisko_zarastania_data_pomiaru varchar(50),
PRIMARY KEY (id_stacji)
);