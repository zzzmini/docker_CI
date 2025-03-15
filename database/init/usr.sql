use myapp;

SET NAMES utf8mb4;
SET CHARACTER SET utf8mb4;
SET collation_connection = 'utf8mb4_unicode_ci';

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
`name` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL
);

INSERT INTO `user`(name)
VALUES ('zzzmini');