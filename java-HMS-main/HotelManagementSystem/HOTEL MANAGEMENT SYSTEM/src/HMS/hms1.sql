-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2019 at 07:34 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms1`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `Room_Number` varchar(20) NOT NULL,
  `Room_Type` varchar(30) NOT NULL,
  `Room_Rent` varchar(20) NOT NULL,
  `Status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`Room_Number`, `Room_Type`, `Room_Rent`, `Status`) VALUES
('101', 'Single', '4000', 'Reserved'),
('102', 'Large', '222555', 'Reserved'),
('103', 'Family', '10000', 'Reserved');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_Id` varchar(20) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Permanent_Address` varchar(30) NOT NULL,
  `Mobile_No` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `National_id` varchar(30) NOT NULL,
  `Arrival_Date` varchar(30) NOT NULL,
  `Departure_Date` varchar(30) NOT NULL,
  `Credit_Card` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_Id`, `Name`, `Permanent_Address`, `Mobile_No`, `Email`, `National_id`, `Arrival_Date`, `Departure_Date`, `Credit_Card`) VALUES
('1', 'Nur', 'Dinajpur', '017856585', 'nur@gmail.com', '1245786', '2019-12-05 ', '2019-12-08 ', '2354574'),
('111', 'Nur', 'Dhaka', '01711448754', 'nur@gmail.com', '852963', '26/12/2019', '27/12/2019', '147852369'),
('2', 'Limon', 'Dhaka', '01754544', 'limon@gmail.com', '45145', '20-12-19', '30-12-19', '15454');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` varchar(20) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `User_Type` varchar(30) NOT NULL,
  `salary` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Name`, `Password`, `User_Type`, `salary`) VALUES
('1', 's', '1', 'Admin', '50000'),
('2', 'Ashraful', '456', 'Employee', '30000'),
('5', 'Hridoy', '1248', 'Employee', '200000'),
('6', 'deb', '123', 'Employee', '15000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`Room_Number`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_Id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
