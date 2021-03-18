CREATE TABLE users (
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
)
    ENGINE = InnoDB;

INSERT INTO users VALUES (1, 'admin', 'admin@mail.ru');
INSERT INTO users VALUES (2, 'user', 'user@mail.ru');