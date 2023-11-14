DROP TABLE IF EXISTS movies;

CREATE TABLE names (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO names (id, name) VALUES (1, "フランク・ダラボン");
INSERT INTO names (id, name) VALUES (2, "片渕須直");
