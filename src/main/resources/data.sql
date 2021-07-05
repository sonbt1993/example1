INSERT INTO role (id, name)
VALUES (1, 'Admin');
INSERT INTO role (id, name)
VALUES (2, 'Mod');
INSERT INTO role (id, name)
VALUES (3, 'Member');

INSERT INTO USER (id, username, email, password, role_id)
VALUES (1, 'admin', 'admin@gmail.com', 123, 1);
INSERT INTO USER  (id, username, email, password, role_id)
VALUES (2, 'mod', 'mod@gmail.com', 123, 2);
INSERT INTO USER  (id, username, email, password, role_id)
VALUES (3, 'member1', 'member1@gmail.com', 123, 3);
INSERT INTO USER  (id, username, email, password, role_id)
VALUES (4, 'member2', 'member2@gmail.com', 123, 3);
INSERT INTO USER  (id, username, email, password, role_id)
VALUES (5, 'member3', 'member3@gmail.com', 123, 3);

INSERT INTO tag (name) VALUES ('Sport');
INSERT INTO tag (name) VALUES ('Music');
INSERT INTO tag (name) VALUES ('eSport');