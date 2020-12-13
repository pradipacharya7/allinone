INSERT  INTO user(id,email,fullname,password,status,username) VALUES (1,'abc.xyz@gmail.com','ABC','$2y$10$gg9AmRWTBaoUWWmPVqTunucFg4MpNlQS7Qaj0IVZtl8Y.49pTcYFq',true,'user');
INSERT into authorities (id,authority,username) values (1,'ROLE_USER','user');

INSERT  INTO user(id,email,fullname,password,status,username) VALUES (2,'abc.xyz@gmail.com','ABC','$2y$10$d/KNOELWUBeGEHaUdJ.wPOcbboFdc18Tg/olj4ujCxRGZ22Y0YniK',true,'admin');
INSERT INTO authorities (id,authority,username) VALUES (2,'ROLE_ADMIN','admin');

