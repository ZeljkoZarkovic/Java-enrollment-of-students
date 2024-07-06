-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 06, 2024 at 04:13 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `upisstudenataftn`
--

-- --------------------------------------------------------

--
-- Table structure for table `studentiftn`
--

CREATE TABLE `studentiftn` (
  `ID` int(11) NOT NULL,
  `br_indeksa` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `datum_rodjenja` varchar(20) DEFAULT NULL,
  `pol` varchar(255) DEFAULT NULL,
  `bracni_status` varchar(255) DEFAULT NULL,
  `radni_status` varchar(255) DEFAULT NULL,
  `adresa` varchar(255) DEFAULT NULL,
  `drzavljanstvo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `studentiftn`
--

INSERT INTO `studentiftn` (`ID`, `br_indeksa`, `ime`, `prezime`, `datum_rodjenja`, `pol`, `bracni_status`, `radni_status`, `adresa`, `drzavljanstvo`) VALUES
(12, '44/2022', 'Marta', 'Markovic', '2002-03-02', 'Zenski', 'Udata', 'Nezaposlena', 'Svetog Save 66', 'Srpsko'),
(13, '43/2020', 'Predrag', 'Tanasijevic', '2002-03-02', 'Muski', 'Neozenjen', 'Nezaposlen', 'Svetog Save 66', 'Srpsko'),
(15, '10/2019', 'Pavle', 'Pavlovic', '2000-05-02', 'Muski', 'Neozenjen', 'Nezaposlen', 'Boska Buhe 12', 'Nemacko'),
(21, '78/2019', 'Andjela', 'Maksimovic', '1999-04-02', 'Zenski', 'Neudata', 'Nezaposlena', 'Knez Mihajlova', 'Srpsko'),
(22, '02/2022', 'Isidora', 'Kovacevic', '2003-10-11', 'Zenski', 'Neudata', 'Nezaposlena', 'Ibarska 44', 'Srpsko'),
(23, '55/2021', 'Zeljko', 'Zarkovic', '2002-07-06', 'Muski', 'Neozenjen', 'Nezaposlen', 'Svetog Save 66', 'Srpsko');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentiftn`
--
ALTER TABLE `studentiftn`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentiftn`
--
ALTER TABLE `studentiftn`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
