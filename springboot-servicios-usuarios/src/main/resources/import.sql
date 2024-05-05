INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('cristian', '$2a$10$daTFAm.HgAHqmg4HzO7RiOjPxqtiXABsYgaNwvfnsQ.xPlKih/7SG', 1,'Cristian', 'Salazar', 'crissalazar@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jorge', '$2a$10$4gM3hwbJ9iy0Umouw.nemejPCYMXwT47whNFwu2oC6U98U7KEHnOS', 1,'Jorge', 'Roque', 'jorgeroque@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_to_roles (user_id,rooles_id) VALUES(1,1);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES(2, 2);
INSERT INTO usuarios_to_roles (user_id, rooles_id) VALUES(2,1)