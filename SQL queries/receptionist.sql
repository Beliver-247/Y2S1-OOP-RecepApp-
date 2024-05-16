-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: receptionist
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS patient;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE patient (
  id int NOT NULL AUTO_INCREMENT,
  NIC varchar(20) DEFAULT NULL,
  pName varchar(100) DEFAULT NULL,
  `pAge` varchar(4) DEFAULT NULL,
  Gender varchar(10) DEFAULT NULL,
  Mphone varchar(20) DEFAULT NULL,
  Hphone varchar(20) DEFAULT NULL,
  pAddress varchar(200) DEFAULT NULL,
  pEmail varchar(50) DEFAULT NULL,
  bloodType varchar(4) DEFAULT NULL,
  Insurance varchar(50) DEFAULT NULL,
  MedicalHistory varchar(200) DEFAULT NULL,
  pwd varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES patient WRITE;
/*!40000 ALTER TABLE patient DISABLE KEYS */;
INSERT INTO patient VALUES (10,'720721074v','Dumindu Mendis','56','male','0777744820','0362266400','I/230/A/1,Morawatte , Ruwanwella,Kegalle\r\n','dumindamendis123@gmail.com','A+','Union insuarance','good','D31234#44'),(16,'200201902343','Kavindu Pathirana','89','male','0714211115','0362266405','I/230/A/1,Morawatte , Ruwanwella\r\n-','mendisdumindu123@gmail.com','A+','Sr lanka Insuarance','good.Admit to Dr.Katulanda','Hav1#333'),(17,'200310201036','Havindu Sineth','20','male','0712346577','0363459854','Dangahamulahandiya','HavinduSineth@gmail.com','O+','-','good ','1234D#Ghfhf'),(24,'200201902343','Dumindu Mendis','89','male','0714211115','0362266405','I/230/A/1,Morawatte , Ruwanwella\r\n-','mendisdumindu123@gmail.com','A+','Sr lanka Insuarance','good','Hav1#333');
/*!40000 ALTER TABLE patient ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescription`
--

DROP TABLE IF EXISTS prescription;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE prescription (
  PresID int NOT NULL AUTO_INCREMENT,
  Medication varchar(50) DEFAULT NULL,
  Instructions varchar(50) DEFAULT NULL,
  Duration varchar(20) DEFAULT NULL,
  PRIMARY KEY (PresID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescription`
--

LOCK TABLES prescription WRITE;
/*!40000 ALTER TABLE prescription DISABLE KEYS */;
/*!40000 ALTER TABLE prescription ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reception`
--

DROP TABLE IF EXISTS reception;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE reception (
  id int NOT NULL AUTO_INCREMENT,
  Rname varchar(50) DEFAULT NULL,
  Address varchar(200) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  mobile varchar(20) DEFAULT NULL,
  UserID varchar(50) DEFAULT NULL,
  UPassword varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reception`
--

LOCK TABLES reception WRITE;
/*!40000 ALTER TABLE reception DISABLE KEYS */;
INSERT INTO reception VALUES (1,'Nuwan Pamunugama','I/45/1,Kegalle,Ruwanwella','Pamunugama25@gmail.com','0727584066','R001','PamuMal@23'),(2,'Malithi Pahalawela','H/35/2,Kotiyakumbura,Palewela','MalithiPaba23@gmail.com','0782244166','R002','Malintha45#'),(3,'Nimmi Katuwegedara','Isurupura,Malabe','Nimmi456@gmail.com','0712584568','R003','Nim@mi%');
/*!40000 ALTER TABLE reception ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-12 13:36:29
