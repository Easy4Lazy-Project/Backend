-- MariaDB dump 10.17  Distrib 10.4.6-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: easy4lazy
-- ------------------------------------------------------
-- Server version	10.4.6-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `easy4lazy`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `easy4lazy` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `easy4lazy`;

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content_id` int(11) DEFAULT NULL,
  `contentType_id` int(11) NOT NULL,
  `answerCount` int(11) NOT NULL,

  `body` text DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `creationDate` date NOT NULL,
  `tags` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_content_content1_idx` (`content_id`),
  KEY `fk_content_contentType1_idx` (`contentType_id`),
  KEY `fk_content_user1_idx` (`user_id`),
  CONSTRAINT `fk_content_content1` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_content_contentType1` FOREIGN KEY (`contentType_id`) REFERENCES `contenttype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_content_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
INSERT INTO `content` VALUES (22,NULL,1,10,'body','subject','2019-10-05','tags',1),(23,NULL,1,13,'aa','Convert Decimal to Double?','2008-07-31','<c#><floating-point><type-conversion><double><decimal>',3),(24,NULL,1,5,'aa','Percentage width child element in absolutely positioned parent on Internet Explorer 7','2008-07-31','<html><css><css3><internet-explorer-7>',3),(25,NULL,1,64,'aa','How do I calculate someone\'s age in C#?','2008-07-31','<c#><.net><datetime>',3),(26,NULL,1,35,'aa','Calculate relative time in C#','2008-07-31','<c#><datetime><time><datediff><relative-time-span>',3),(27,NULL,1,25,'aa','Determine a User\'s Timezone','2008-08-01','<javascript><html><browser><timezone><timezoneoffset>',3),(28,NULL,1,10,'aa','Difference between Math.Floor() and Math.Truncate()','2008-08-01','<.net><math>',3),(29,NULL,1,6,'aa','Filling a DataSet or DataTable from a LINQ query result set','2008-08-01','<c#><linq><web-services><.net-3.5>',3),(30,NULL,1,10,'aa','Binary Data in MySQL','2008-08-01','<mysql><database><binary-data><data-storage>',3),(31,NULL,1,23,'aa','What is the fastest way to get the value of π?','2008-08-01','<performance><algorithm><language-agnostic><unix><pi>',3),(32,NULL,1,6,'aa','Throw an error in a MySQL trigger','2008-08-01','<mysql><database><triggers>',3),(33,NULL,1,9,'aa','How to use the C socket API in C++ on z/OS','2008-08-01','<c++><c><sockets><mainframe><zos>',3),(34,NULL,1,8,'aa','Unloading a ByteArray using Actionscript 3','2008-08-01','<arrays><actionscript-3><flex>',3),(35,NULL,1,8,'aa','Check for changes to an SQL Server table?','2008-08-01','<sql><sql-server><datatable><rdbms>',3),(36,NULL,1,2,'aa','Reliable timer in a console application','2008-08-01','<c#><.net><vb.net><timer>',3),(37,NULL,1,8,'aa','Best way to allow plugins for a PHP application','2008-08-01','<php><plugins><architecture><hook>',3),(38,NULL,1,23,'aa','Multiple submit buttons in an HTML form','2008-08-01','<html><form-submit><html-form><submit-button>',3),(39,NULL,1,7,'aa','How do I get a distinct, ordered list of names from a DataTable using LINQ?','2008-08-01','<c#><linq><.net-3.5>',3),(40,NULL,1,1,'aa','Microsoft Office 2007 file type, Mime types and identifying characters','2008-08-01','<mime><file-type><office-2007>',3),(41,NULL,1,4,'aa','Paging a collection with LINQ','2008-08-01','<linq><.net-3.5>',3),(42,NULL,1,2,'aa','How do I add existing comments to RDoc in Ruby?','2008-08-01','<ruby><rdoc>',3);
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contenttype`
--

DROP TABLE IF EXISTS `contenttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contenttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contenttype`
--

LOCK TABLES `contenttype` WRITE;
/*!40000 ALTER TABLE `contenttype` DISABLE KEYS */;
INSERT INTO `contenttype` VALUES (1,'question'),(2,'answer'),(3,'comment');
/*!40000 ALTER TABLE `contenttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aboutMe` mediumtext DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `creationDate` date NOT NULL,
  `name` varchar(255) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Im from Egypt',26,'2019-10-05','Hedra',NULL,'1@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL),(2,'Im from Mexico',26,'2019-10-05','Eduardo',NULL,'eduardo@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL),(3,'Im from Afganistan',26,'2019-10-05','Ali',NULL,'ali@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL),(4,'Im from Peru',26,'2019-10-05','Dany',NULL,'dany@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL),(5,'Im from Nigeria',26,'2019-10-05','Adeola',NULL,'Adeola@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

-- -----------------------------------------------------
-- Table `easy4lazy`.`vote`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `easy4lazy`.`vote` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `voteType_id` INT NOT NULL,
  `createdDate` DATE NOT NULL,
  `user_id` INT NOT NULL,
  `content_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_vote_voteType_idx` (`voteType_id` ASC) ,
  INDEX `fk_vote_user1_idx` (`user_id` ASC) ,
  INDEX `fk_vote_content1_idx` (`content_id` ASC) ,
  CONSTRAINT `fk_vote_voteType`
    FOREIGN KEY (`voteType_id`)
    REFERENCES `easy4lazy`.`votetype` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vote_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `easy4lazy`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vote_content1`
    FOREIGN KEY (`content_id`)
    REFERENCES `easy4lazy`.`content` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE=InnoDB DEFAULT CHARSET=utf8;
--
-- Dumping data for table `vote`
--

LOCK TABLES `vote` WRITE;
/*!40000 ALTER TABLE `vote` DISABLE KEYS */;
/*!40000 ALTER TABLE `vote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votetype`
--

DROP TABLE IF EXISTS `votetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `votetype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votetype`
--

LOCK TABLES `votetype` WRITE;
/*!40000 ALTER TABLE `votetype` DISABLE KEYS */;
INSERT INTO `votetype` VALUES (1,'like'),(2,'dislike');
/*!40000 ALTER TABLE `votetype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-05 14:58:34
