-- auto Generated on 2018-09-12
-- DROP TABLE IF EXISTS user;
CREATE TABLE user(
	id VARCHAR (50) NOT NULL AUTO_INCREMENT COMMENT 'id',
	name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
