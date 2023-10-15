CREATE DATABASE  IF NOT EXISTS `bdvendasprojeto` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdvendasprojeto`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: bdvendasprojeto
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `tbl_cliente`
--

DROP TABLE IF EXISTS `tbl_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cliente` (
  `pk_id_cliente` bigint unsigned NOT NULL AUTO_INCREMENT,
  `cliente_nome` varchar(60) NOT NULL,
  `cliente_endereco` varchar(60) DEFAULT NULL,
  `cliente_bairro` varchar(50) DEFAULT NULL,
  `cliente_numero` varchar(10) DEFAULT NULL,
  `cliente_cidade` varchar(35) DEFAULT NULL,
  `cliente_uf` varchar(2) DEFAULT NULL,
  `cliente_cep` varchar(9) DEFAULT NULL,
  `cliente_telefone` varchar(15) NOT NULL,
  `cliente_complemento` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`pk_id_cliente`),
  UNIQUE KEY `pk_id_cliente` (`pk_id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cliente`
--

LOCK TABLES `tbl_cliente` WRITE;
/*!40000 ALTER TABLE `tbl_cliente` DISABLE KEYS */;
INSERT INTO `tbl_cliente` VALUES (1,'THOMAS SHELBY','','','','','AC','     -   ','(  )      -    ',''),(2,'UDYR DA SILVA','','','','','PB','     -   ','(  )      -    ',''),(3,'MARIO BRAGANÇA','','','','','PE','     -   ','(  )      -    ',''),(4,'JUNIOR CALVACANTE','','','','','PE','     -   ','(  )      -    ',''),(5,'RICARDO SILVA E SILVA','','','','','MT','     -   ','(  )      -    ','');
/*!40000 ALTER TABLE `tbl_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_produto`
--

DROP TABLE IF EXISTS `tbl_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_produto` (
  `pk_id_produto` bigint unsigned NOT NULL AUTO_INCREMENT,
  `produto_nome` varchar(100) NOT NULL,
  `produto_fabricante` varchar(100) NOT NULL,
  `produto_preco` decimal(10,2) DEFAULT NULL,
  `produto_custo` decimal(10,2) DEFAULT NULL,
  `produto_estoque` int DEFAULT NULL,
  PRIMARY KEY (`pk_id_produto`),
  UNIQUE KEY `pk_id_produto` (`pk_id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_produto`
--

LOCK TABLES `tbl_produto` WRITE;
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
INSERT INTO `tbl_produto` VALUES (1,'CANETA AZUL','BIC',2.59,0.98,20),(2,'CANETA PRETA','BIC',2.69,0.97,20),(3,'CANETA VERMELHA','BIC',2.49,1.00,30),(4,'MARCA TEXTO VERDE','BIC',4.19,2.39,10),(5,'COCA-COLA 310ML','COCA-COLA',2.99,0.90,40),(6,'ÁGUA COM GÁS','LEVISSIMA',2.99,1.00,41),(7,'ÁGUA NATURAL','LEVISSIMA',2.49,0.69,28);
/*!40000 ALTER TABLE `tbl_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` bigint unsigned NOT NULL AUTO_INCREMENT,
  `usuario_nome` varchar(60) NOT NULL,
  `usuario_login` varchar(50) NOT NULL,
  `usuario_senha` varchar(30) NOT NULL,
  PRIMARY KEY (`pk_id_usuario`),
  UNIQUE KEY `pk_id_usuario` (`pk_id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (1,'admin','admin','admin'),(2,'DIEGO SILVA','diego','123');
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_vendas`
--

DROP TABLE IF EXISTS `tbl_vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_vendas` (
  `pk_id_vendas` bigint unsigned NOT NULL AUTO_INCREMENT,
  `fk_cliente` bigint unsigned DEFAULT NULL,
  `venda_data` date DEFAULT NULL,
  `venda_valor_liquido` decimal(10,2) DEFAULT NULL,
  `venda_valor_bruto` decimal(10,2) DEFAULT NULL,
  `venda_desconto` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`pk_id_vendas`),
  UNIQUE KEY `pk_id_vendas` (`pk_id_vendas`),
  KEY `fk_cliente` (`fk_cliente`),
  CONSTRAINT `tbl_vendas_ibfk_1` FOREIGN KEY (`fk_cliente`) REFERENCES `tbl_cliente` (`pk_id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendas`
--

LOCK TABLES `tbl_vendas` WRITE;
/*!40000 ALTER TABLE `tbl_vendas` DISABLE KEYS */;
INSERT INTO `tbl_vendas` VALUES (1,1,'2023-10-07',81.72,102.15,20.00),(2,3,'2023-10-07',5.28,10.56,50.00),(3,NULL,'2023-10-07',91.85,91.85,0.00),(4,NULL,'2023-10-08',0.83,31.92,97.40);
/*!40000 ALTER TABLE `tbl_vendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_vendas_produtos`
--

DROP TABLE IF EXISTS `tbl_vendas_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_vendas_produtos` (
  `pk_id_venda_produto` bigint unsigned NOT NULL AUTO_INCREMENT,
  `fk_produto` bigint unsigned DEFAULT NULL,
  `fk_venda` bigint unsigned DEFAULT NULL,
  `venda_produto_valor` decimal(10,2) DEFAULT NULL,
  `venda_produto_quantidade` int DEFAULT NULL,
  PRIMARY KEY (`pk_id_venda_produto`),
  UNIQUE KEY `pk_id_venda_produto` (`pk_id_venda_produto`),
  KEY `fk_produto` (`fk_produto`),
  KEY `fk_venda` (`fk_venda`),
  CONSTRAINT `tbl_vendas_produtos_ibfk_1` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`pk_id_produto`),
  CONSTRAINT `tbl_vendas_produtos_ibfk_2` FOREIGN KEY (`fk_venda`) REFERENCES `tbl_vendas` (`pk_id_vendas`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendas_produtos`
--

LOCK TABLES `tbl_vendas_produtos` WRITE;
/*!40000 ALTER TABLE `tbl_vendas_produtos` DISABLE KEYS */;
INSERT INTO `tbl_vendas_produtos` VALUES (1,1,1,2.59,5),(2,2,1,2.69,5),(3,3,1,2.49,5),(4,4,1,4.19,5),(5,5,1,2.99,5),(6,6,1,2.99,5),(7,7,1,2.49,5),(8,7,2,2.49,1),(9,2,2,2.69,3),(10,1,3,2.59,23),(11,2,3,2.69,12),(12,2,4,2.69,10),(13,1,4,2.59,2);
/*!40000 ALTER TABLE `tbl_vendas_produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-15 10:03:29
