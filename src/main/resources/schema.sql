CREATE TABLE IF NOT EXISTS t_employee (
 id SERIAL PRIMARY KEY,
 employee_no CHAR(4) UNIQUE,
 last_name TEXT,
 first_name TEXT,
 birthday TEXT,
 gender INT,
 tel TEXT,
 email TEXT,
 post_no CHAR(7),
 prefecture TEXT,
 address1 TEXT,
 address2 TEXT
);