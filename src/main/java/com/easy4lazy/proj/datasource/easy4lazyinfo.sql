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

  CONSTRAINT `fk_content_content1` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`),

  CONSTRAINT `fk_content_contentType1` FOREIGN KEY (`contentType_id`) REFERENCES `contenttype` (`id`),

  CONSTRAINT `fk_content_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

/*!40101 SET character_set_client = @saved_cs_client */;



--

-- Dumping data for table `content`

--



LOCK TABLES `content` WRITE;

/*!40000 ALTER TABLE `content` DISABLE KEYS */;

INSERT INTO `content` VALUES (22,NULL,1,6,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','How to kill a service process?','2019-10-05','c# .net windows',1),(23,NULL,1,13,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Convert Decimal to Double?','2019-07-31','<c#><floating-point><type-conversion><double><decimal>',3),(24,NULL,1,5,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Percentage width child element in absolutely positioned parent on Internet Explorer 7','2019-07-31','<html><css><css3><internet-explorer-7>',3),(25,NULL,1,64,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','How do I calculate someone\'s age in C#?','2019-01-01','<c#><.net><datetime>',3),(26,NULL,1,35,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Calculate relative time in C#','2019-08-10','<c#><datetime><time><datediff><relative-time-span>',3),(27,NULL,1,25,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Determine a User\'s Timezone','2019-08-01','<javascript><html><browser><timezone><timezoneoffset>',3),(28,NULL,1,10,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Difference between Math.Floor() and Math.Truncate()','2019-08-01','<.net><math>',3),(29,NULL,1,6,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Filling a DataSet or DataTable from a LINQ query result set','2019-08-01','<c#><linq><web-services><.net-3.5>',3),(30,NULL,1,10,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Binary Data in MySQL','2019-08-01','<mysql><database><binary-data><data-storage>',3),(31,NULL,1,23,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','What is the fastest way to get the value of π?','2008-08-01','<performance><algorithm><language-agnostic><unix><pi>',3),(32,NULL,1,6,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Throw an error in a MySQL trigger','2008-08-01','<mysql><database><triggers>',3),(33,NULL,1,9,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','How to use the C socket API in C++ on z/OS','2008-08-01','<c++><c><sockets><mainframe><zos>',3),(34,NULL,1,8,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Unloading a ByteArray using Actionscript 3','2008-08-01','<arrays><actionscript-3><flex>',3),(35,NULL,1,8,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Check for changes to an SQL Server table?','2008-08-01','<sql><sql-server><datatable><rdbms>',3),(36,NULL,1,2,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Reliable timer in a console application','2008-08-01','<c#><.net><vb.net><timer>',3),(37,NULL,1,8,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Best way to allow plugins for a PHP application','2008-08-01','<php><plugins><architecture><hook>',3),(38,NULL,1,23,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Multiple submit buttons in an HTML form','2008-08-01','<html><form-submit><html-form><submit-button>',3),(39,NULL,1,7,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','How do I get a distinct, ordered list of names from a DataTable using LINQ?','2008-08-01','<c#><linq><.net-3.5>',3),(40,NULL,1,1,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Microsoft Office 2007 file type, Mime types and identifying characters','2008-08-01','<mime><file-type><office-2007>',3),(41,NULL,1,4,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','Paging a collection with LINQ','2008-08-01','<linq><.net-3.5>',3),(42,NULL,1,2,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','How do I add existing comments to RDoc in Ruby?','2008-08-01','<ruby><rdoc>',3),(43,NULL,1,0,'I\'m trying to kill a service process, if it stucks when trying to stop it via ServiceController. I have a Process object of this service; however, nothing happens when I call the Kill() method on it. No exceptions, and the process is still running.So, how can I kill this process?','how to do this','2019-10-12','how to do this',1),(44,22,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',1),(45,22,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',2),(46,22,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',2),(47,23,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',2),(48,23,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(49,24,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(50,25,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(51,25,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(52,26,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(53,26,2,0,'There\'s nothing unusual about service processes from the kernel\'s point of view, but the permissions on them do not explicitly give PROCESS_TERMINATE access to the Administrators group. To bypass this, you need to enable debug privilege.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',1),(54,22,2,0,'If TerminateProcess() doesn\'t work either, the most likely problem is that you forgot to enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',1),(55,22,3,0,'If TerminateProcess() doesn\'t work either, the most likely problem is that you forgot to enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',2),(56,22,3,0,'If TerminateProcess() doesn\'t work either, the most likely problem is that you forgot to enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(57,44,3,0,'If TerminateProcess() doesn\'t work either, the most likely problem is that you forgot to enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',3),(58,44,3,0,'If TerminateProcess() doesn\'t work either, the most likely problem is that you forgot to enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',4),(59,44,3,0,'If TerminateProcess() doesn\'t work either, the most likely problem is that you forgot to enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',5),(60,45,3,0,' enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',1),(61,46,3,0,' enable debug privilege and/or didn\'t request the PROCESS_TERMINATE access right in the call to OpenProcess(). Either way the error code from TerminateProcess() would be 5, access denied. (If the error code is something else, it\'s a different problem. But we\'ve got no hope of identifying it without at least knowing what the error code is.',NULL,'2019-10-13','<html><css><css3><internet-explorer-7>',1),(62,22,3,0,'comment on question',NULL,'2019-10-13',NULL,2),(65,44,3,0,'comment in answer',NULL,'2019-10-13',NULL,2),(66,44,3,0,'comment in answersddsf',NULL,'2019-10-13',NULL,2),(67,44,3,0,'comment on answer',NULL,'2019-10-13',NULL,2);

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

-- Temporary table structure for view `dislikes_count`

--



DROP TABLE IF EXISTS `dislikes_count`;

/*!50001 DROP VIEW IF EXISTS `dislikes_count`*/;

SET @saved_cs_client     = @@character_set_client;

SET character_set_client = utf8;

/*!50001 CREATE TABLE `dislikes_count` (

  `content_id` tinyint NOT NULL,

  `count` tinyint NOT NULL

) ENGINE=MyISAM */;

SET character_set_client = @saved_cs_client;



--

-- Temporary table structure for view `likes_count`

--



DROP TABLE IF EXISTS `likes_count`;

/*!50001 DROP VIEW IF EXISTS `likes_count`*/;

SET @saved_cs_client     = @@character_set_client;

SET character_set_client = utf8;

/*!50001 CREATE TABLE `likes_count` (

  `content_id` tinyint NOT NULL,

  `count` tinyint NOT NULL

) ENGINE=MyISAM */;

SET character_set_client = @saved_cs_client;



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

INSERT INTO `user` VALUES (1,'Im from Egypt',26,'2019-10-05','Hedra',NULL,'1@mum.edu','827ccb0eea8a706c4c34a16891f84e7b','1f32aa4c9a1d2ea010adcf2348166a04'),(2,'Im from Mexico',26,'2019-10-05','Eduardo',NULL,'eduardo@mum.edu','827ccb0eea8a706c4c34a16891f84e7b','1f32aa4c9a1d2ea010adcf2348166a04'),(3,'Im from Afganistan',26,'2019-10-05','Ali',NULL,'ali@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL),(4,'Im from Peru',26,'2019-10-05','Dany',NULL,'dany@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL),(5,'Im from Nigeria',26,'2019-10-05','Adeola',NULL,'Adeola@mum.edu','827ccb0eea8a706c4c34a16891f84e7b',NULL);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;

UNLOCK TABLES;



--

-- Table structure for table `vote`

--



DROP TABLE IF EXISTS `vote`;

/*!40101 SET @saved_cs_client     = @@character_set_client */;

/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `vote` (

  `id` int(11) NOT NULL AUTO_INCREMENT,

  `voteType_id` int(11) NOT NULL,

  `createdDate` date NOT NULL,

  `user_id` int(11) NOT NULL,

  `content_id` int(11) NOT NULL,

  PRIMARY KEY (`id`),

  KEY `fk_vote_voteType_idx` (`voteType_id`),

  KEY `fk_vote_user1_idx` (`user_id`),

  KEY `fk_vote_content1_idx` (`content_id`),

  CONSTRAINT `fk_vote_content1` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`),

  CONSTRAINT `fk_vote_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),

  CONSTRAINT `fk_vote_voteType` FOREIGN KEY (`voteType_id`) REFERENCES `votetype` (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

/*!40101 SET character_set_client = @saved_cs_client */;



--

-- Dumping data for table `vote`

--



LOCK TABLES `vote` WRITE;

/*!40000 ALTER TABLE `vote` DISABLE KEYS */;

INSERT INTO `vote` VALUES (1,1,'2019-10-13',1,22),(2,1,'2019-10-13',1,22),(3,1,'2019-10-13',1,23),(4,1,'2019-10-13',1,24),(5,1,'2019-10-13',1,25),(6,1,'2019-10-13',1,25),(7,1,'2019-10-13',1,26),(8,1,'2019-10-13',1,27),(9,1,'2019-10-13',1,28),(10,1,'2019-10-13',1,29),(11,1,'2019-10-13',1,30),(12,1,'2019-10-13',1,31),(13,1,'2019-10-13',1,22),(14,1,'2019-10-13',1,22),(15,1,'2019-10-13',1,22),(16,1,'2019-10-13',1,22),(17,1,'2019-10-13',1,22),(18,1,'2019-10-13',1,22),(19,1,'2019-10-13',1,22),(20,1,'2019-10-13',1,22),(21,1,'2019-10-13',1,44),(22,1,'2019-10-13',1,44),(23,1,'2019-10-13',1,44),(24,1,'2019-10-13',1,44),(25,1,'2019-10-13',1,44),(26,2,'2019-10-13',1,22),(27,2,'2019-10-13',1,22),(28,2,'2019-10-13',1,22),(29,2,'2019-10-13',1,22),(30,2,'2019-10-13',1,22),(31,1,'2019-10-13',2,22),(32,1,'2019-10-13',2,22),(33,1,'2019-10-13',2,44),(34,1,'2019-10-13',2,45),(35,1,'2019-10-13',2,22),(36,1,'2019-10-13',2,43),(37,1,'2019-10-13',2,43);

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



--

-- Current Database: `easy4lazy`

--



USE `easy4lazy`;



--

-- Final view structure for view `dislikes_count`

--



/*!50001 DROP TABLE IF EXISTS `dislikes_count`*/;

/*!50001 DROP VIEW IF EXISTS `dislikes_count`*/;

/*!50001 SET @saved_cs_client          = @@character_set_client */;

/*!50001 SET @saved_cs_results         = @@character_set_results */;

/*!50001 SET @saved_col_connection     = @@collation_connection */;

/*!50001 SET character_set_client      = utf8mb4 */;

/*!50001 SET character_set_results     = utf8mb4 */;

/*!50001 SET collation_connection      = utf8_general_ci */;

/*!50001 CREATE ALGORITHM=UNDEFINED */

/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */

/*!50001 VIEW `dislikes_count` AS select `vote`.`content_id` AS `content_id`,count(0) AS `count` from `vote` where `vote`.`voteType_id` = 2 group by `vote`.`content_id` */;

/*!50001 SET character_set_client      = @saved_cs_client */;

/*!50001 SET character_set_results     = @saved_cs_results */;

/*!50001 SET collation_connection      = @saved_col_connection */;



--

-- Final view structure for view `likes_count`

--



/*!50001 DROP TABLE IF EXISTS `likes_count`*/;

/*!50001 DROP VIEW IF EXISTS `likes_count`*/;

/*!50001 SET @saved_cs_client          = @@character_set_client */;

/*!50001 SET @saved_cs_results         = @@character_set_results */;

/*!50001 SET @saved_col_connection     = @@collation_connection */;

/*!50001 SET character_set_client      = utf8mb4 */;

/*!50001 SET character_set_results     = utf8mb4 */;

/*!50001 SET collation_connection      = utf8_general_ci */;

/*!50001 CREATE ALGORITHM=UNDEFINED */

/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */

/*!50001 VIEW `likes_count` AS select `vote`.`content_id` AS `content_id`,count(0) AS `count` from `vote` where `vote`.`voteType_id` = 1 group by `vote`.`content_id` */;

/*!50001 SET character_set_client      = @saved_cs_client */;

/*!50001 SET character_set_results     = @saved_cs_results */;

/*!50001 SET collation_connection      = @saved_col_connection */;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;

/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;

/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;