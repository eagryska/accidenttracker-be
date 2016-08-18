use accidenttracker_test;
set FOREIGN_KEY_CHECKS = 0;
truncate table cars;
set FOREIGN_KEY_CHECKS = 1;
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Honda ', 'Accord', '2015', 'blue', '1');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Lexus ', 'Accord', '2015', 'blue', '1');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('BMW ', 'Accord', '2015', 'blue', '2');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Merc ', 'Accord', '2015', 'blue', '2');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Kia ', 'Accord', '2015', 'blue', '2');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Toyota ', 'Accord', '2015', 'blue', '3');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Ford ', 'Accord', '2015', 'blue', '3');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Dodge ', 'Accord', '2015', 'blue', '4');
INSERT INTO `accidenttracker_test`.`cars` (`make`, `model`, `year`, `color`, `client_id`)
VALUES ('Hummer ', 'Accord', '2015', 'blue', '4');