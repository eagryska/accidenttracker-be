use accidenttracker_test;
set FOREIGN_KEY_CHECKS = 0;
truncate table clients;
set FOREIGN_KEY_CHECKS = 1;
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Bob', '50', '35', 'M');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Sally', '50', '35', 'F');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Rick', '50', '35', 'M');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Joe', '50', '35', 'M');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Bob 2', '50', '35', 'M');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Sally 2', '50', '35', 'F');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Rick 2', '50', '35', 'M');
INSERT INTO `accidenttracker_test`.`clients` (`name`, `payment`, `age`, `gender`)
VALUES ('Joe 2', '50', '35', 'M');