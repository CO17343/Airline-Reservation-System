-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 12, 2019 at 07:00 AM
-- Server version: 5.5.0-m2-community
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db1`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking_details`
--

DROP TABLE IF EXISTS `booking_details`;
CREATE TABLE IF NOT EXISTS `booking_details` (
  `Ticket_no` int(20) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Flight_id` int(20) NOT NULL,
  `Seat_no` int(5) NOT NULL,
  `amount` int(20) NOT NULL,
  `card_no` bigint(20) NOT NULL,
  `cvv` int(5) NOT NULL,
  `validity` varchar(20) NOT NULL,
  PRIMARY KEY (`Ticket_no`),
  UNIQUE KEY `Seat_no` (`Seat_no`),
  UNIQUE KEY `Username` (`Username`),
  UNIQUE KEY `card_no` (`card_no`),
  KEY `Flight_id` (`Flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `flight_details`
--

DROP TABLE IF EXISTS `flight_details`;
CREATE TABLE IF NOT EXISTS `flight_details` (
  `Flight_id` int(20) NOT NULL AUTO_INCREMENT,
  `Flight_name` varchar(20) NOT NULL,
  `Source` varchar(50) NOT NULL,
  `Destination` varchar(50) NOT NULL,
  `Departure_Time` varchar(50) NOT NULL,
  `Arrival_Time` varchar(50) NOT NULL,
  `Seats` int(11) NOT NULL,
  `Fare` int(20) NOT NULL,
  `date_of_departure` varchar(20) NOT NULL,
  `date_of_arrival` varchar(20) NOT NULL,
  PRIMARY KEY (`Flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `months`
--

DROP TABLE IF EXISTS `months`;
CREATE TABLE IF NOT EXISTS `months` (
  `month` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `months`
--

INSERT INTO `months` (`month`) VALUES
('January'),
('February'),
('March'),
('April'),
('May'),
('June'),
('July'),
('August'),
('September'),
('October'),
('November'),
('December');

-- --------------------------------------------------------

--
-- Table structure for table `nationality`
--

DROP TABLE IF EXISTS `nationality`;
CREATE TABLE IF NOT EXISTS `nationality` (
  `country` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nationality`
--

INSERT INTO `nationality` (`country`) VALUES
('India'),
('England'),
('China'),
('France'),
('Germany'),
('Finalnd'),
('USA'),
('Norway');

-- --------------------------------------------------------

--
-- Table structure for table `signup_info`
--

DROP TABLE IF EXISTS `signup_info`;
CREATE TABLE IF NOT EXISTS `signup_info` (
  `Username` varchar(20) NOT NULL DEFAULT '',
  `Password` varchar(20) DEFAULT NULL,
  `First_name` varchar(20) DEFAULT NULL,
  `Last_name` varchar(20) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Date_of_birth` varchar(20) DEFAULT NULL,
  `Email_id` varchar(30) DEFAULT NULL,
  `Contact_no` bigint(20) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Nationality` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup_info`
--

INSERT INTO `signup_info` (`Username`, `Password`, `First_name`, `Last_name`, `Gender`, `Date_of_birth`, `Email_id`, `Contact_no`, `Address`, `Nationality`) VALUES
('mukul7', '123456', 'mukul', 'sethi', 'Male', '29October1998', 'mukuls@gmail.com', 7865434256, '100-b,Bhadson road,ambala', 'India'),
('muskan', 'muskan99', 'muskan', 'arora', 'Female', '17January1900', 'mmuskan_be17@thapar.edu', 7978567890, '56-c,vikas colony,patiala', 'India');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking_details`
--
ALTER TABLE `booking_details`
  ADD CONSTRAINT `booking_details_ibfk_1` FOREIGN KEY (`Username`) REFERENCES `signup_info` (`Username`),
  ADD CONSTRAINT `booking_details_ibfk_2` FOREIGN KEY (`Flight_id`) REFERENCES `flight_details` (`Flight_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
