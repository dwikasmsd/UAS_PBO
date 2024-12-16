-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2024 at 02:27 PM
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
-- Database: `floruna`
--

-- --------------------------------------------------------

--
-- Table structure for table `game_session`
--

CREATE TABLE `game_session` (
  `ID` int(11) NOT NULL,
  `Score` int(11) NOT NULL,
  `ID_User` varchar(100) NOT NULL,
  `Status` varchar(255) NOT NULL,
  `ID_Kategori` int(11) NOT NULL,
  `ID_Level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `level`
--

CREATE TABLE `level` (
  `ID` int(11) NOT NULL,
  `Level` int(11) NOT NULL,
  `ID_Kategori` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `soal`
--

CREATE TABLE `soal` (
  `ID` int(11) NOT NULL,
  `ID_Level` int(11) NOT NULL,
  `Gambar` varchar(255) NOT NULL,
  `pertanyaan` varchar(255) NOT NULL,
  `Jawaban` varchar(255) NOT NULL,
  `ID_Kategori` int(11) NOT NULL,
  `Bobot` int(11) NOT NULL,
  `Pilihan_Jawaban` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tingkat_kesulitan`
--

CREATE TABLE `tingkat_kesulitan` (
  `ID` int(11) NOT NULL,
  `tingkat_kesulitan` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tingkat_kesulitan`
--

INSERT INTO `tingkat_kesulitan` (`ID`, `tingkat_kesulitan`) VALUES
(1, 'Easy'),
(2, 'Medium'),
(3, 'Hard');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Score_kumulatif` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Nama`, `Password`, `Score_kumulatif`) VALUES
(1, 'asep', '123', 0),
(6, 'abas', '12345', 0),
(10, 'fauzi', '1234', 0),
(11, 'kiki', '1234', 0),
(13, 'bbb', '1234', 0),
(14, 'aaaa', '12345', 0),
(17, 'andra', '2345', 0),
(25, 'Al', '1234', 0),
(28, 'asd', '123', 0),
(29, 'uzi', '1234', 0),
(30, 'jow', '23', 0),
(31, 'wawan', 'qwerty', 0),
(32, 'dika', '1234', 0),
(33, 'wkwk', '696969', 0),
(34, 'bagasganteng', '250804', 0),
(35, 'kajow', '5678', 0),
(36, 'ekopur', '12345', 0),
(37, 'aku', '098', 0),
(38, 'joww', '4444', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `game_session`
--
ALTER TABLE `game_session`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `level`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `soal`
--
ALTER TABLE `soal`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tingkat_kesulitan`
--
ALTER TABLE `tingkat_kesulitan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
