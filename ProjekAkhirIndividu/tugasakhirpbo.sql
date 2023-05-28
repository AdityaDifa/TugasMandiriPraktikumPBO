-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Bulan Mei 2023 pada 14.33
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasakhirpbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelas_b`
--

CREATE TABLE `kelas_b` (
  `No_Induk` int(4) NOT NULL,
  `Nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kelas_b`
--

INSERT INTO `kelas_b` (`No_Induk`, `Nama`) VALUES
(1000, 'Yuda');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kelas_b`
--
ALTER TABLE `kelas_b`
  ADD PRIMARY KEY (`No_Induk`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kelas_b`
--
ALTER TABLE `kelas_b`
  MODIFY `No_Induk` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1001;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
