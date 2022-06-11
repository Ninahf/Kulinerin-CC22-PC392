-- MySQL dump 10.13  Distrib 5.7.38, for Linux (x86_64)
--
-- Host: localhost    Database: foods_recipe
-- ------------------------------------------------------
-- Server version	5.7.37-google-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `foods_recipe`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `foods_recipe` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `foods_recipe`;

--
-- Table structure for table `foods`
--

DROP TABLE IF EXISTS `foods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `foods` (
  `name` varchar(50) DEFAULT NULL,
  `origin` varchar(50) DEFAULT NULL,
  `ingredients` varchar(1000) DEFAULT NULL,
  `method` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foods`
--

LOCK TABLES `foods` WRITE;
/*!40000 ALTER TABLE `foods` DISABLE KEYS */;
INSERT INTO `foods` VALUES ('Rendang','Padang','500 gr daging sapi has, 500 ml santan kental , 300 ml santan cair, 1 sdt garam, 1 sdt kaldu sapi bubuk, 1 sdm gula pasir, 7 lembar daun jeruk, 1 lembar daun kunyit, 3 lembar daun salam, 3 batang serai, 3 ruas lengkuas, 10 buah cabai merah besar, 10 buah cabai keriting, 5 siung bawang putih, 5 siung bawang merah, 3 cm jahe, 3 butir kemiri, 1 sdt ketumbar sangrai, 1 sdt merica butir, 1 batang kayu manis, 1 sdm gula merah.','1. Tumis bumbu halus hingga harum dengan minyak cukup banya agar tidak kering dan gosong. Ketika sudah harum, masukkan daun kunyit, jeruk, salam, serai, dan lengkuas. Tumis hingga bumbu matang atau bau langunya hilang. 2. Masukkan daging dan aduk rata dengan bumbu. Aduk terus hingga daging matang bagian luarnya atau mulai mengeluarkan minyak. Proses ini cukup lama jadi harus sabar. 3. Jika daging suka mulai mengeluarkan minyak, tuang santan kental dan santan cair. Aduk rata. Masak hingga mendidih. 4. Masukkan gula merah, gula pasir, garam, dan kaldu bubuk secukupnya. Tes rasa, jika sudah sesuai, masak terus hingga daging empuk. Semakin lama memasak semakin enak bumbunya. 5. Ketika kuah santannya sudah agak habis dan bumbunya mengenta pekat, angkat. Rendang siap dinikmati. Jika tidak punya santan dari kelapa asli, bisa diganti dengan santan instan. Sesuaikan saja kekentalan dan porsinya.'),('Nasi Goreng Kampung','Yogyakarta','2 sdm mentega tawar, 10 gram bawang merah, 5 gram bawang putih, 15 gram terasi, 3 buah cabai rawit, 10 buah cabai merah, 1 butir telur, 10 gram irisan daun bawang, 250 gram nasi putih, 1/4 sdt merica bubuk, 1/4 sdt garam, 1/2 sdt kaldu bubuk instan rasa ayam, 1/4 sdt gula pasir, 1/4 sdt penyedap rasa (opsional).','1. Panaskan mentega, tumis bawang merah dan bawang putih sampai harum. Masukkan terasi, cabai rawit, dan cabai merah. Aduk rata. 2. Tambahkan telur dan daun bawang. Aduk. Masukkan nasi, merica, garam, kaldu bubuk, gula pasir, dan penyedap rasa. Aduk rata. Masak hingga matang dan bumbu meresap. Angkat. Nasi goreng kampung siap disajikan.'),('Soto Banjar','Kalimantan Selatan','1 ekor ayam muda, 2 buah kentang direbus dipotong-potong, 100 gram Soun yang sudah direndam, 3 sdm bawang goreng, 1 sdm bawang putih goreng, 5 batang seledri dirajang, 4 butir telur rebus dibelah empat bagian, 4 buah perkedel, 4 sdm minyak goreng untuk menumis, 1 buah ketupat banjar dipotong-potong, 1 batang kayu manis, 2 sdm kecap asin, 2 buah jeruk nipis, 1500 ml Air, 4 buah bawang merah, 3 siung bawang putih, 1/2 sdt adas, 1/2 sdt jintan, 3 cm jahe, 2 cm kunyit, 1/2 sdt lada putih bubuk, 1 sdt garam.','Rebus ayam dengan kayu manis dan garam hingga mendidih. Tumis bumbu yang dihaluskan dengan menggunakan minyak goreng hingga harum, kemudian masukkan ke dalam rebusan ayam, rebus kembali hingga ayam empuk. Angkat ayam dari rebusan kemudian tiriskan hingga dingin kemudian suwir. Letakkan ketupat di atas mangkuk beserta soun, kentang, perkedel, suwiran ayam, telur, kemudian siram dengan kuah soto. Taburkan bawang goreng, bawang putih goreng, seledri dan perahan jeruk, hidangkan.'),('Gado-gado Betawi','Jakarta','Kubis/ Kol sebanyak 150 gram, Bayam sebanyak 175 gram, Mentimun sebanyak 200 gram, Kentang rebus sebanyak 300 gram, Kacang panjang sebanyak 200 gram, Tahu kuning sebanyak 300 gram, Telur rebus, Kerupuk dan emping, Bawang goreng. Saus: Cabe rawit sebanyak 4 buah, Cabe merah sebanyak 4 buah, Gula merah sebanyak 4 sdt, Terasi bakar sebanyak 1 sdt, Air asam jawa sebanyak 1,5 sdm, Garam sebanyak 2 sdt, Kacang tanah sebanyak 175 gram ditumbuk halus, Kacang kenari sebanyak 175 gram ditumbuk halus, Kecap manis, Air sebanyak 750 ml.','Rebus semua sayuran hingga lunak lalu tiriskan. Haluskan cabe merah, terasi, cabe rawit, garam sampai halus. Kemudian masukkan kacang kenari dan kacang tanah. Tambahkan air asam, air, kecap manis, dan gula merah. Campur sampai rata kemudian masak di atas wajah hingga mendidih. Tunggu sampai dingin. Siapkan piring kemudian tata sayuran, kentang, tahu, dan telur. Kemudian tuang saus kacang di atasnya. Taburi dengan bawang goreng dan beri tambahan emping goreng.'),('Ayam Penyet','Surabaya','1 kg ayam, minyak goreng secukupnya, 4 helai daun salam, 1 batang serai, 4 helai daun cengkeh, 4 helai daun kayu manis,  3 helai daun jeruk. Bumbu halus ungkep: 7 siung bawang merah, 4 siung bawah putih, 3 cm jahe,  2 cm lengkuas,  2 cm kunyit, garam secukupnya. Bahan sambal ayam penyet: 10 cabai merah, 1 terasi cabai rawit sesuai selera, 3 siung bawang merah, 1 siung bawang putih,  1 buah tomat, garam secukupnya, gula merah secukupnya.','1. Campurkan ayam dengan bumbu halus, daun salam, serai, daun cengkeh, daun kayu manis, daun jeruk, dan air secukupnya. Masak dengan atas api kompor sedang hingga air berkurang.  2. Setelah ayam ungkep matang, panaskan minyak goreng, goreng ayam dengan api sedang hingga matang. Kemudian tiriskan. 3. Goreng cabai, terasi, cabai rawit, bawang merah, bawang putih dan tomat dengan api kecil selama satu menit. 4. Setelah bahan sambal digoreng, ulek semua bahan hingga halus, tambahkan garam dan gula merah sesuai selera. 5. Penyet ayam goreng dengan sambal yang sudah diulek. Ayam penyet siap disantap.'),('Mie Aceh','Aceh','250 gram mi kering atau mi lidi (rebus hingga matang, lalu tiriskan), 6 buah bawang merah, 4 buah bawang putih, 7 buah cabai merah, 10 buah cabai rawit, 1 buah tomat, 1 ruas jahe, 4 butir kemiri sangrai, 2 butir telur kocok, 1 sdm bubuk kari, 3 sdm kecap manis, 2 sdm kecap asin, 1 cangkir air, garam dan gula secukupnya, kol, sawi, dan seledri iris secukupnya, penyedap bubuk secukupnya, minyak goreng secukupnya.','1. Haluskan bawang merah, bawang putih, cabai merah, cabai rawit, kemiri, dan tomat. 2. Panaskan minyak, tumis bumbu yang telah dihaluskan hingga harum. Masukkan telur, aduk-aduk sampai rata dan telur kaku. 3. Masukkan sayur-sayuran dan air. Aduk-aduk sebentar, kemudian masukkan semua bahan kecuali mi. Aduk kembali hingga rata. 4. Masukkan mi. Aduk kembali hingga rata dan cek rasa. 5. Jika sudah pas, angkat, dan mi aceh sederhana siap disajikan.');
/*!40000 ALTER TABLE `foods` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-11 20:12:30
