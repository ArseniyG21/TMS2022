DROP SCHEMA IF EXISTS store_db;
CREATE SCHEMA IF EXISTS store_db;

DROP TABLE IF EXISTS store_db.producsts;
CREATE TABLE IF EXISTS store_db.products
(
    id
    INT
    NOT
    NULL
    AUTO_INCREMENT,
    name
    VARCHAR
(
    50
) NOT NULL,
    description VARCHAR
(
    200
) NOT NULL,
    price DOUBLE NOT NULL,
    amount INT NOT NULL,
    isStock BIT NOT NULL,
    PRIMARY KEY
(
    id
));

INSERT INTO store_db.produsts(name, description, price, amount, isStock)
VALUES ('Зубная щетка', 'Производитель Colgate', 2.52, 132, true);
INSERT INTO store_db.products(name, description, price, amount, isStock)
VALUES ('Паста зубная', 'Производитель Lacalut', 4.99, 99, true);
INSERT INTO store_db.products(name, description, price, amount, isStock)
VALUES ('Мыло', 'Жидкое мыло в пакете', 7.99, 0, false);

