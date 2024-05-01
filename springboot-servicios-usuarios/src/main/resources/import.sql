INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('cristian', '12345', 1,'Cristian', 'Salazar', 'crissalazar@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jorge', '12345', 1,'Jorge', 'Roque', 'jorgeroque@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (user_id,rooles_id) VALUES(1,1);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES(2, 2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES(2,1)