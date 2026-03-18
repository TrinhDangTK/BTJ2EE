# BTJ2EE
Bài Tập môn J2EE

SQL BT5: use quanlysach;

INSERT INTO book_category (name) VALUES ('Văn học');

INSERT INTO book_category (name) VALUES ('Kỹ thuật');

INSERT INTO book_category (name) VALUES ('Kinh tế');

INSERT INTO account (login_name,password) VALUES('admin','$2a$12$Qj/kcF0L22L9j6viwvyx7.3CXNlLHdTfPsSLusAi071se8/knkFl.');
INSERT INTO account (login_name,password) VALUES('user','$2a$12$5JcOvrCJOhUJHjMatercHelJDMaueRoNkeMuosp/lhV12tZiM76ne');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO account_role (account_id,role_id) VALUES (1,1);
INSERT INTO account_role (account_id,role_id) VALUES (2,2);
