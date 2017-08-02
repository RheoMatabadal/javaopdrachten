-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: db_monteur
-- ------------------------------------------------------
-- Server version	5.6.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `filiaal`
--

DROP TABLE IF EXISTS `filiaal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filiaal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `locatie` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `locatie` (`locatie`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filiaal`
--

LOCK TABLES `filiaal` WRITE;
/*!40000 ALTER TABLE `filiaal` DISABLE KEYS */;
INSERT INTO `filiaal` VALUES (3,'Indira Ghandiweg'),(2,'Johannes Mungrastraat'),(1,'Kwatta'),(5,'Leysweg'),(4,'Sommelsdaijkstraat');
/*!40000 ALTER TABLE `filiaal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monteur`
--

DROP TABLE IF EXISTS `monteur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monteur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) DEFAULT NULL,
  `familienaam` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monteur`
--

LOCK TABLES `monteur` WRITE;
/*!40000 ALTER TABLE `monteur` DISABLE KEYS */;
INSERT INTO `monteur` VALUES (1,'Shayant','Sital'),(2,'Rishwi	','Fattoe'),(3,'Rivaldo	','Vola'),(4,'Nirul','Sultan'),(5,'Kevin','Edoo'),(6,'Jovin','Fransman'),(7,'Rheo','Matabadal'),(17,'Zoe','Jadi'),(18,'Rheo','Masrabadal'),(19,'Christy','Mangoenredjo'),(20,'Micheal','jackson');
/*!40000 ALTER TABLE `monteur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooster`
--

DROP TABLE IF EXISTS `rooster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rooster` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filiaal` int(11) NOT NULL,
  `monteur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `monteur_id` (`monteur`),
  KEY `filiaal_id` (`filiaal`),
  CONSTRAINT `rooster_ibfk_1` FOREIGN KEY (`filiaal`) REFERENCES `filiaal` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rooster_ibfk_2` FOREIGN KEY (`monteur`) REFERENCES `monteur` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooster`
--

LOCK TABLES `rooster` WRITE;
/*!40000 ALTER TABLE `rooster` DISABLE KEYS */;
/*!40000 ALTER TABLE `rooster` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-12 22:13:18
