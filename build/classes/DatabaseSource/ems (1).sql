-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2025 at 04:16 PM
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
-- Database: `ems`
--

-- --------------------------------------------------------

--
-- Table structure for table `appusers`
--

CREATE TABLE `appusers` (
  `UserId` int(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(40) NOT NULL,
  `email` varchar(45) NOT NULL,
  `Contact` varchar(40) NOT NULL,
  `RoleName` varchar(30) DEFAULT NULL,
  `Created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appusers`
--

INSERT INTO `appusers` (`UserId`, `Name`, `Username`, `Password`, `email`, `Contact`, `RoleName`, `Created`) VALUES
(3, 'Ogoy', 'Ogoy', '123', 'ogoychristopher@gmail.com', '0983674734673', 'Admin', '2025-11-02 12:53:08');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `AttendanceId` int(11) NOT NULL,
  `EmpId` int(11) NOT NULL,
  `Date` date NOT NULL,
  `TimeIn` time DEFAULT NULL,
  `TimeOut` time DEFAULT NULL,
  `Status` varchar(50) NOT NULL DEFAULT 'No Attendance yet',
  `Overtime` int(11) DEFAULT NULL,
  `Remarks` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`AttendanceId`, `EmpId`, `Date`, `TimeIn`, `TimeOut`, `Status`, `Overtime`, `Remarks`) VALUES
(55, 47, '2025-11-11', '22:33:28', '22:33:33', 'Completed', NULL, NULL),
(56, 42, '2025-11-11', '22:33:40', NULL, 'Absent', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `benefits`
--

CREATE TABLE `benefits` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Amount` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `benefits`
--

INSERT INTO `benefits` (`Id`, `Name`, `Amount`) VALUES
(14, 'Allowance', 2000.00);

-- --------------------------------------------------------

--
-- Table structure for table `deductions`
--

CREATE TABLE `deductions` (
  `Id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Amount` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `deductions`
--

INSERT INTO `deductions` (`Id`, `Name`, `Amount`) VALUES
(3, 'SSS', 2500),
(5, 'Pagibig', 1000),
(9, 'Absent', 695);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DepartmentId` int(11) NOT NULL,
  `DepartmentName` varchar(50) NOT NULL,
  `Created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DepartmentId`, `DepartmentName`, `Created`) VALUES
(1, 'IT Department', '2025-10-29 14:50:21'),
(3, 'Accounting Department', '2025-10-29 14:50:36');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmpId` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `MiddleName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Contact` varchar(30) NOT NULL,
  `Gmail` varchar(45) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `DepartmentId` int(11) NOT NULL,
  `PositionId` int(11) NOT NULL,
  `HireDate` date DEFAULT NULL,
  `Gender` varchar(30) NOT NULL,
  `JobPosition` varchar(100) DEFAULT NULL,
  `Status` varchar(30) NOT NULL,
  `Days` varchar(30) DEFAULT NULL,
  `Created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpId`, `FirstName`, `MiddleName`, `LastName`, `Contact`, `Gmail`, `Address`, `DepartmentId`, `PositionId`, `HireDate`, `Gender`, `JobPosition`, `Status`, `Days`, `Created`) VALUES
(42, 'Jerald', 'Rabino', 'Montemor', '09488749263', 'xmontemorjerald@gmail.com', 'test lang', 1, 1, NULL, 'Female', NULL, 'Active', NULL, '2025-11-06 06:56:42'),
(47, 'Ogoy', 'Ogoy', 'Ogoy', '09488749376', 'ogoy@gmail.com', 'MSNFJSFSDFN', 1, 1, NULL, 'Female', NULL, 'Active', NULL, '2025-11-11 14:09:55');

-- --------------------------------------------------------

--
-- Table structure for table `leaves`
--

CREATE TABLE `leaves` (
  `LeaveId` int(11) NOT NULL,
  `EmpId` int(11) NOT NULL,
  `LeaveType` enum('Vacation','Sick','Emergency','Other') NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `Reason` text DEFAULT NULL,
  `Status` enum('Pending','Approved','Rejected') DEFAULT 'Pending',
  `RequestedAt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `position`
--

CREATE TABLE `position` (
  `PositionId` int(11) NOT NULL,
  `DepartmentId` int(11) NOT NULL,
  `PositionName` varchar(150) NOT NULL,
  `SalaryRate` decimal(10,2) NOT NULL,
  `CreatedAt` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `position`
--

INSERT INTO `position` (`PositionId`, `DepartmentId`, `PositionName`, `SalaryRate`, `CreatedAt`) VALUES
(1, 1, 'Quality Assurance', 60000.00, '2025-11-11 15:15:45'),
(2, 1, 'IT Department', 200000.00, '2025-11-02 16:08:39');

-- --------------------------------------------------------

--
-- Table structure for table `salaries`
--

CREATE TABLE `salaries` (
  `SalaryID` int(11) NOT NULL,
  `EmpId` int(11) NOT NULL,
  `BaseSalary` decimal(10,2) NOT NULL,
  `OvertimePay` decimal(10,2) DEFAULT 0.00,
  `Deductions` decimal(10,2) DEFAULT 0.00,
  `NetSalary` decimal(10,2) GENERATED ALWAYS AS (`BaseSalary` + `OvertimePay` - `Deductions`) VIRTUAL,
  `DateIssued` date DEFAULT curdate()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salaries`
--

INSERT INTO `salaries` (`SalaryID`, `EmpId`, `BaseSalary`, `OvertimePay`, `Deductions`, `DateIssued`) VALUES
(25, 42, 60000.00, 2000.00, 4890.00, '2025-11-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appusers`
--
ALTER TABLE `appusers`
  ADD PRIMARY KEY (`UserId`),
  ADD UNIQUE KEY `Username` (`Username`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD UNIQUE KEY `email` (`email`),
  ADD KEY `Contact` (`Contact`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`AttendanceId`),
  ADD KEY `EmpId` (`EmpId`);

--
-- Indexes for table `benefits`
--
ALTER TABLE `benefits`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- Indexes for table `deductions`
--
ALTER TABLE `deductions`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DepartmentId`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmpId`),
  ADD UNIQUE KEY `Gmail` (`Gmail`),
  ADD UNIQUE KEY `Contact` (`Contact`);

--
-- Indexes for table `leaves`
--
ALTER TABLE `leaves`
  ADD PRIMARY KEY (`LeaveId`),
  ADD KEY `EmpId` (`EmpId`);

--
-- Indexes for table `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`PositionId`),
  ADD KEY `FK_Department` (`DepartmentId`);

--
-- Indexes for table `salaries`
--
ALTER TABLE `salaries`
  ADD PRIMARY KEY (`SalaryID`),
  ADD KEY `EmpId` (`EmpId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appusers`
--
ALTER TABLE `appusers`
  MODIFY `UserId` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `AttendanceId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT for table `benefits`
--
ALTER TABLE `benefits`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `deductions`
--
ALTER TABLE `deductions`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `DepartmentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `EmpId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `leaves`
--
ALTER TABLE `leaves`
  MODIFY `LeaveId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `position`
--
ALTER TABLE `position`
  MODIFY `PositionId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `salaries`
--
ALTER TABLE `salaries`
  MODIFY `SalaryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`EmpId`) REFERENCES `employee` (`EmpId`);

--
-- Constraints for table `leaves`
--
ALTER TABLE `leaves`
  ADD CONSTRAINT `leaves_ibfk_1` FOREIGN KEY (`EmpId`) REFERENCES `employee` (`EmpId`);

--
-- Constraints for table `salaries`
--
ALTER TABLE `salaries`
  ADD CONSTRAINT `salaries_ibfk_1` FOREIGN KEY (`EmpId`) REFERENCES `employee` (`EmpId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
