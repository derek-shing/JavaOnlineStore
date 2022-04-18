CREATE DATABASE  IF NOT EXISTS `yhystore`;
USE `yhystore`;

--
-- Table structure for table `Product`
--

DROP TABLE IF EXISTS `Product`;

CREATE TABLE `Product` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Barcode` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `PhotoLink` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `Product`
--

INSERT INTO `Product` VALUES 
	(1,'8809611402904','CERAMIC(WHITE)CHINESE SPOON(M)','CERAMIC(WHITE)CHINESE SPOON(M)',''),
	(2,'8809389844043','CERAMIC BOWL(CAT)-15CM','CERAMIC BOWL(CAT)-15CM',''),
	(3,'8809389844050','CERAMIC BOWL(CAT)-18CM','CERAMIC BOWL(CAT)-18CM','')



