CREATE DATABASE `accidenttracker_dev` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE `cars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `make` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cars_clients_id_fk_idx` (`client_id`),
  CONSTRAINT `cars_clients_id_fk` FOREIGN KEY (`client_id`) REFERENCES `clients` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
CREATE TABLE `claims` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `clients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `payment` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;