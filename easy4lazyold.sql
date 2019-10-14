-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 14, 2019 at 06:35 AM
-- Server version: 5.7.21
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `easy4lazyold`
--

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
CREATE TABLE IF NOT EXISTS `content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content_id` int(11) DEFAULT NULL,
  `content_type_id` int(11) NOT NULL,
  `answer_count` int(11) DEFAULT NULL,
  `body` text,
  `subject` varchar(255) DEFAULT NULL,
  `creation_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `tags` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `comment_count` int(11) DEFAULT NULL,
  `dtype` varchar(31) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_content_content1_idx` (`content_id`),
  KEY `fk_content_contentType1_idx` (`content_type_id`),
  KEY `fk_content_user1_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`id`, `content_id`, `content_type_id`, `answer_count`, `body`, `subject`, `creation_date`, `tags`, `user_id`, `comment_count`, `dtype`) VALUES
(1, 19, 3, NULL, 'secont comment for answer id 19', NULL, NULL, NULL, 3, NULL, 'Comment'),
(2, 19, 3, NULL, 'COMMENT COMMENT', NULL, NULL, NULL, 5, NULL, 'Comment'),
(3, 20, 3, NULL, 'COMMENT COMMENT', NULL, NULL, NULL, 3, NULL, 'Comment'),
(19, NULL, 1, NULL, 'Updated question', 'Update and edit', NULL, 'hibernate', 5, NULL, 'Question'),
(20, NULL, 1, NULL, 'this is my first question in easy 4 lazy', 'first question', '2019-10-09 05:13:14', 'hibernate', 5, NULL, 'Question'),
(21, NULL, 1, NULL, 'Updated question', 'Update and edit', NULL, 'hibernate', 5, NULL, 'Question'),
(22, NULL, 1, 10, 'body', 'subject', '2019-10-05 00:00:00', 'tags', 1, NULL, 'Question'),
(23, NULL, 1, NULL, 'this is for testing 2323 ', 'Edit first question', NULL, 'hibernate', 5, NULL, 'Question'),
(24, NULL, 1, 5, 'aa', 'Percentage width child element in absolutely positioned parent on Internet Explorer 7', '2008-07-31 00:00:00', '<html><css><css3><internet-explorer-7>', 3, NULL, 'Question'),
(25, NULL, 1, 64, 'aa', 'How do I calculate someone\'s age in C#?', '2008-07-31 00:00:00', '<c#><.net><datetime>', 3, NULL, 'Question'),
(26, NULL, 1, 35, 'aa', 'Calculate relative time in C#', '2008-07-31 00:00:00', '<c#><datetime><time><datediff><relative-time-span>', 3, NULL, 'Question'),
(27, NULL, 1, 25, 'aa', 'Determine a User\'s Timezone', '2008-08-01 00:00:00', '<javascript><html><browser><timezone><timezoneoffset>', 3, NULL, 'Question'),
(28, NULL, 1, 10, 'aa', 'Difference between Math.Floor() and Math.Truncate()', '2008-08-01 00:00:00', '<.net><math>', 3, NULL, 'Question'),
(29, NULL, 1, 6, 'aa', 'Filling a DataSet or DataTable from a LINQ query result set', '2008-08-01 00:00:00', '<c#><linq><web-services><.net-3.5>', 3, NULL, 'Question'),
(30, NULL, 1, 10, 'aa', 'Binary Data in MySQL', '2008-08-01 00:00:00', '<mysql><database><binary-data><data-storage>', 3, NULL, 'Question'),
(31, NULL, 1, 23, 'aa', 'What is the fastest way to get the value of π?', '2008-08-01 00:00:00', '<performance><algorithm><language-agnostic><unix><pi>', 3, NULL, 'Question'),
(32, NULL, 1, 6, 'aa', 'Throw an error in a MySQL trigger', '2008-08-01 00:00:00', '<mysql><database><triggers>', 3, NULL, 'Question'),
(33, NULL, 1, 9, 'aa', 'How to use the C socket API in C++ on z/OS', '2008-08-01 00:00:00', '<c++><c><sockets><mainframe><zos>', 3, NULL, 'Question'),
(34, NULL, 1, 8, 'aa', 'Unloading a ByteArray using Actionscript 3', '2008-08-01 00:00:00', '<arrays><actionscript-3><flex>', 3, NULL, 'Question'),
(35, NULL, 1, 8, 'aa', 'Check for changes to an SQL Server table?', '2008-08-01 00:00:00', '<sql><sql-server><datatable><rdbms>', 3, NULL, 'Question'),
(36, NULL, 1, 2, 'aa', 'Reliable timer in a console application', '2008-08-01 00:00:00', '<c#><.net><vb.net><timer>', 3, NULL, 'Question'),
(37, NULL, 1, 8, 'aa', 'Best way to allow plugins for a PHP application', '2008-08-01 00:00:00', '<php><plugins><architecture><hook>', 3, NULL, 'Question'),
(38, NULL, 1, 23, 'aa', 'Multiple submit buttons in an HTML form', '2008-08-01 00:00:00', '<html><form-submit><html-form><submit-button>', 3, NULL, 'Question'),
(39, NULL, 1, 7, 'aa', 'How do I get a distinct, ordered list of names from a DataTable using LINQ?', '2008-08-01 00:00:00', '<c#><linq><.net-3.5>', 3, NULL, 'Question'),
(40, NULL, 1, 1, 'aa', 'Microsoft Office 2007 file type, Mime types and identifying characters', '2008-08-01 00:00:00', '<mime><file-type><office-2007>', 3, NULL, 'Question'),
(41, NULL, 1, 4, 'aa', 'Paging a collection with LINQ', '2008-08-01 00:00:00', '<linq><.net-3.5>', 3, NULL, 'Question'),
(42, NULL, 1, 2, 'aa', 'How do I add existing comments to RDoc in Ruby?', '2008-08-01 00:00:00', '<ruby><rdoc>', 3, NULL, 'Question'),
(43, NULL, 1, NULL, 'this is a sample question', 'test', '2019-10-10 22:41:53', 'c++', 3, NULL, 'Question'),
(44, 19, 2, NULL, 'This is an answer for question with id 19', NULL, '2019-10-12 21:03:20', NULL, 4, NULL, 'Answer'),
(45, 20, 2, NULL, 'This is an answer for question with id 20', NULL, '2019-10-12 21:03:20', NULL, 5, NULL, 'Answer'),
(47, 44, 3, NULL, 'This is a comment for answer with id 44', NULL, '2019-10-12 21:05:27', NULL, 2, NULL, 'Comment'),
(48, 19, 2, NULL, 'this is answer to question with id 19', NULL, NULL, NULL, 4, NULL, 'Answer'),
(50, 20, 2, NULL, 'this is the third answer to the question with id 20', NULL, NULL, NULL, 3, NULL, 'Answer'),
(53, 19, 3, NULL, 'this is a comment form post man', NULL, NULL, NULL, 1, NULL, 'Comment'),
(54, 44, 3, NULL, 'this is a comment form post man', NULL, NULL, NULL, 1, NULL, 'Comment'),
(55, 44, 3, NULL, 'your answer solve my problem thank you', NULL, NULL, NULL, 3, NULL, 'Comment'),
(56, 44, 3, NULL, 'your answer solve my problem thank you', NULL, NULL, NULL, 3, NULL, 'Comment'),
(57, 48, 3, NULL, 'comment for answer with id 48', NULL, NULL, NULL, 3, NULL, 'Comment'),
(58, 48, 3, NULL, 'comment form post man for answer with id 48', NULL, NULL, NULL, 3, NULL, 'Comment'),
(59, 20, 3, NULL, 'comment form post man for answer id 45', NULL, NULL, NULL, 2, NULL, 'Comment'),
(60, 20, 3, NULL, 'second comment for answer id 45', NULL, NULL, NULL, 2, NULL, 'Comment'),
(61, 19, 2, NULL, 'new answer to the question with id 19', NULL, NULL, NULL, 5, NULL, 'Answer'),
(62, 19, 3, NULL, 'second comment for answer id 61', NULL, NULL, NULL, 2, NULL, 'Comment'),
(63, 61, 3, NULL, 'second comment for answer id 61', NULL, NULL, NULL, 2, NULL, 'Comment'),
(64, 61, 3, NULL, 'first comment for answer id 61', NULL, NULL, NULL, 2, NULL, 'Comment');

-- --------------------------------------------------------

--
-- Table structure for table `contenttype`
--

DROP TABLE IF EXISTS `contenttype`;
CREATE TABLE IF NOT EXISTS `contenttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contenttype`
--

INSERT INTO `contenttype` (`id`, `name`) VALUES
(1, 'question'),
(2, 'answer'),
(3, 'comment');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(25),
(25);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequences`
--

DROP TABLE IF EXISTS `hibernate_sequences`;
CREATE TABLE IF NOT EXISTS `hibernate_sequences` (
  `sequence_name` varchar(255) NOT NULL,
  `next_val` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`sequence_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequences`
--

INSERT INTO `hibernate_sequences` (`sequence_name`, `next_val`) VALUES
('default', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `about_me` mediumtext,
  `age` int(11) DEFAULT NULL,
  `creation_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `name` varchar(255) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `about_me`, `age`, `creation_date`, `name`, `location`, `email`, `password`, `token`) VALUES
(1, 'Im from Egypt', 26, '2019-10-05 00:00:00', 'Hedra', NULL, '1@mum.edu', '827ccb0eea8a706c4c34a16891f84e7b', NULL),
(2, 'Im from Mexico', 26, '2019-10-05 00:00:00', 'Eduardo', NULL, 'eduardo@mum.edu', '827ccb0eea8a706c4c34a16891f84e7b', NULL),
(3, 'Im from Afganistan', 26, '2019-10-05 00:00:00', 'Ali', NULL, 'ali@mum.edu', '827ccb0eea8a706c4c34a16891f84e7b', NULL),
(4, 'Im from Peru', 26, '2019-10-05 00:00:00', 'Dany', NULL, 'dany@mum.edu', '827ccb0eea8a706c4c34a16891f84e7b', NULL),
(5, 'Im from Nigeria', 26, '2019-10-05 00:00:00', 'Adeola', NULL, 'Adeola@mum.edu', '827ccb0eea8a706c4c34a16891f84e7b', NULL),
(6, NULL, 0, '2019-10-09 10:50:32', 'Alex', NULL, 'alex@gmail.com', '123', NULL),
(7, NULL, 0, '2019-10-09 10:54:09', 'Mick', NULL, 'mick@gmail.com', '123', NULL),
(8, NULL, 0, '2019-10-09 10:55:21', 'Mick', NULL, 'mick@gmail.com', '123', NULL),
(9, NULL, 0, '2019-10-09 10:57:00', 'Emma', NULL, 'emma@yahoo.com', 'asdf', NULL),
(10, NULL, 0, '2019-10-09 18:35:03', 'Ali Ansari', NULL, 'weli@gmail.com', '23323', NULL),
(11, NULL, 0, '2019-10-09 18:55:03', 'Harry Potter', NULL, 'harry@gmail.com', '23323', NULL),
(12, NULL, 0, '2019-10-10 21:42:21', 'emma watson', NULL, 'emma@gmail.com', 'asdfasdf', NULL),
(13, NULL, 0, NULL, 'jamshid fardi', NULL, 'jamshid@gmail.com', '1234567', NULL),
(14, NULL, 0, NULL, 'jamshid fardi', NULL, 'jamshid@gmail.com', '127', NULL),
(15, NULL, 0, NULL, 'fardi', NULL, 'jamshid@gmail.com', '127', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vote`
--

DROP TABLE IF EXISTS `vote`;
CREATE TABLE IF NOT EXISTS `vote` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vote_type_id` int(11) NOT NULL,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `user_id` int(11) NOT NULL,
  `content_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_vote_voteType_idx` (`vote_type_id`),
  KEY `fk_vote_user1_idx` (`user_id`),
  KEY `fk_vote_content1_idx` (`content_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vote`
--

INSERT INTO `vote` (`id`, `vote_type_id`, `created_date`, `user_id`, `content_id`) VALUES
(1, 1, NULL, 2, 19),
(2, 1, NULL, 4, 19),
(3, 1, NULL, 1, 19),
(4, 1, NULL, 5, 19),
(5, 2, NULL, 5, 19),
(6, 2, NULL, 1, 19),
(7, 1, NULL, 1, 20),
(8, 1, NULL, 1, 20),
(9, 1, NULL, 4, 20),
(10, 2, NULL, 2, 20),
(11, 2, NULL, 3, 20),
(12, 2, NULL, 3, 20),
(13, 1, NULL, 3, 20),
(14, 2, NULL, 4, 44),
(15, 1, NULL, 3, 61),
(16, 1, NULL, 3, 61),
(17, 1, NULL, 5, 61),
(18, 2, NULL, 5, 61),
(19, 2, NULL, 5, 61),
(20, 2, NULL, 4, 50),
(21, 2, NULL, 4, 50);

-- --------------------------------------------------------

--
-- Table structure for table `votetype`
--

DROP TABLE IF EXISTS `votetype`;
CREATE TABLE IF NOT EXISTS `votetype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `votetype`
--

INSERT INTO `votetype` (`id`, `type`) VALUES
(1, 'like'),
(2, 'dislike');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `content`
--
ALTER TABLE `content`
  ADD CONSTRAINT `content_id` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_content_content1` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_content_contentType1` FOREIGN KEY (`content_type_id`) REFERENCES `contenttype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_content_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `vote`
--
ALTER TABLE `vote`
  ADD CONSTRAINT `fk_vote_content1` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vote_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vote_voteType` FOREIGN KEY (`vote_type_id`) REFERENCES `votetype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
