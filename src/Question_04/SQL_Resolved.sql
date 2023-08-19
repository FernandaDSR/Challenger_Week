
-- Criated a Address
CREATE TABLE Address (
address_id SERIAL PRIMARY KEY,
zip_code varchar(10) NOT null,
address varchar(255) NOT null,
complementet varchar(100),
neighborhood varchar(100),
city varchar(100) NOT null,
state varchar(50) NOT null,
country varchar(50) NOT null
);

-- Criated Person
Create table person(
person_id SERIAL PRIMARY KEY,
name varchar(100) not null,
age integer,
phone varchar(20),
heitght decimal(5,2),
email VARCHAR(100),
cpf VARCHAR(14),
date_of_birth DATE,
id_address integer references Address(address_id)
);

SELECT *
from Address;

SELECT *
from person;