-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 08, 2023 lúc 03:28 AM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `do_an_oop`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diem_danh`
--

CREATE TABLE `diem_danh` (
  `id` int(144) NOT NULL,
  `ho_ten` varchar(255) NOT NULL,
  `goi_tap` varchar(255) NOT NULL,
  `ngay_tap` date DEFAULT NULL,
  `idHoiVien` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `diem_danh`
--

INSERT INTO `diem_danh` (`id`, `ho_ten`, `goi_tap`, `ngay_tap`, `idHoiVien`) VALUES
(11, 'Le Kien Cuong', '12 Tháng', '2023-01-04', '1'),
(12, 'cuong', 'hello', '2022-12-07', '3'),
(13, 'Le Kien Cuong', 'hello', '2023-01-04', '5'),
(14, 'Le Kien Cuong', 'hello', '2022-12-05', '5'),
(15, 'Le Kien Cuong', '12 Tháng', '2023-01-07', '1'),
(16, 'cuong123', '1 tháng\r ', '2023-01-08', '14'),
(17, 'Hieu', '12 Tháng', '2023-01-08', '13'),
(18, 'cuong', 'hello', '2023-01-08', '3');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dung_cu`
--

CREATE TABLE `dung_cu` (
  `id` int(144) NOT NULL,
  `ten_thiet_bi` varchar(255) NOT NULL,
  `hang_sx` varchar(255) NOT NULL,
  `so_luong` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `dung_cu`
--

INSERT INTO `dung_cu` (`id`, `ten_thiet_bi`, `hang_sx`, `so_luong`) VALUES
(1, 'tay1124', 'samsung', '123'),
(3, 'viejt', 'apple', '123412'),
(6, 'tay1124', 'samsung', '123'),
(7, 'viejt', 'apple', '123412'),
(9, 'viejt', 'apple', '123412'),
(10, 'tay1124', 'samsung', '123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `goi_tap`
--

CREATE TABLE `goi_tap` (
  `id` int(144) NOT NULL,
  `tenGoiTap` varchar(200) NOT NULL,
  `giaTien` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `goi_tap`
--

INSERT INTO `goi_tap` (`id`, `tenGoiTap`, `giaTien`) VALUES
(4, '1 tháng\r\n', '10000'),
(6, '12 Tháng', '100000'),
(7, '1 tháng\r ', '10000'),
(9, '1 tuần', '5000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don`
--

CREATE TABLE `hoa_don` (
  `id` int(11) NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `sdt` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `giatien` varchar(255) NOT NULL,
  `goitap` varchar(255) NOT NULL,
  `ngaydangky` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hoa_don`
--

INSERT INTO `hoa_don` (`id`, `hoten`, `sdt`, `email`, `giatien`, `goitap`, `ngaydangky`) VALUES
(1, 'Le Kien Cuong', '0989933060', 'cuongkien91@gmail.com', '10000', '12 Tháng', '2023-01-03'),
(3, 'cuong', '123', '2332', '123', 'hello', '2023-01-03'),
(4, 'Nguyễn Việt Hưng', '098314', '@gmail.com', '10000', '12 Tháng', '2023-01-04'),
(5, 'Le Kien Cuong', '012391', 'cuongkien@gmail', '123', 'hello', '2023-01-05'),
(6, 'Khuat Duy Khanh', '234131', 'nuce.edu.vn', '123', 'hello', '2022-12-01'),
(7, 'Le Chung', '098992232', 'chung@gmail.com', '123', 'hello', '2023-01-07'),
(8, 'Nguyen Viet Hung', '0947641867', 'hung@gmail.com', '10000', '12 Tháng', '2023-01-07'),
(9, 'câc', '', '', '10000', '', '0000-00-00'),
(10, '123', '1231', '1233', '10000', '12 Tháng', '2023-01-07'),
(11, 'Nguyen Nam Khanh', '12312', 'khanh@nuce.edu', '10000', '1 tháng\r\n', '2023-01-07'),
(12, 'Nguyen Viet', '865334', 'tai@nuce.edu', '10000', '1 tháng\r\n', '2023-01-08'),
(13, 'Hieu', '1232413', 'hieu@gmai.com', '10000', '12 Tháng', '2023-01-08'),
(14, 'cuong123', '0988888', '999@gmail', '10000', '1 tháng\r\n', '2023-01-08');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoi_vien`
--

CREATE TABLE `hoi_vien` (
  `id` int(144) NOT NULL,
  `hoTen` varchar(244) NOT NULL,
  `sdt` varchar(244) NOT NULL,
  `email` varchar(244) NOT NULL,
  `goiTap` varchar(244) NOT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hoi_vien`
--

INSERT INTO `hoi_vien` (`id`, `hoTen`, `sdt`, `email`, `goiTap`, `status`) VALUES
(1, 'Le Kien Cuong', '0989933060', 'cuongkien91@gmail.com', '12 Tháng', 'true'),
(3, 'cuong', '123', '2332', 'hello', 'true'),
(4, 'Nguyễn Việt Hưng', '098314', '@gmail.com', '12 Tháng', 'true'),
(5, 'Le Kien Cuong', '012391', 'cuongkien@gmail', 'hello', 'true'),
(6, 'Khuat Duy Khanh', '234131', 'nuce.edu.vn', 'hello', 'true'),
(7, 'Le Trung Kien', '09812345', 'kien@gmail.com', 'hello', 'true'),
(9, 'Nguyen Viet Hung', '0947641867', 'hung@gmail.com', '12 Tháng', 'true'),
(10, '123', '1231', '1233', '12 Tháng', 'true'),
(11, 'Nguyen Nam Khanh', '12312', 'khanh@nuce.edu', '1 tháng\r\n', 'true'),
(12, 'Nguyen Viet', '865334', 'tai@nuce.edu', '1 tháng\r\n', 'true'),
(13, 'Hieu', '1232413', 'hieu@gmai.com', '12 Tháng', 'true'),
(14, 'cuong123', '0988888', '999@gmail', '1 tháng\r\n', 'true');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `diem_danh`
--
ALTER TABLE `diem_danh`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `dung_cu`
--
ALTER TABLE `dung_cu`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `goi_tap`
--
ALTER TABLE `goi_tap`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `hoi_vien`
--
ALTER TABLE `hoi_vien`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `diem_danh`
--
ALTER TABLE `diem_danh`
  MODIFY `id` int(144) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `dung_cu`
--
ALTER TABLE `dung_cu`
  MODIFY `id` int(144) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `goi_tap`
--
ALTER TABLE `goi_tap`
  MODIFY `id` int(144) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT cho bảng `hoi_vien`
--
ALTER TABLE `hoi_vien`
  MODIFY `id` int(144) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
