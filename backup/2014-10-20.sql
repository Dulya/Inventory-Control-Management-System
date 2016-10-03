-- MySQL dump 10.10
--
-- Host: localhost    Database: bookshop
-- ------------------------------------------------------
-- Server version	5.0.17-nt

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
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `idAuthor` varchar(10) NOT NULL,
  `authorName` varchar(100) NOT NULL,
  PRIMARY KEY  (`idAuthor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `author`
--


/*!40000 ALTER TABLE `author` DISABLE KEYS */;
LOCK TABLES `author` WRITE;
INSERT INTO `author` VALUES ('A0001','Sujeewa'),('A0002','Gamage'),('A0003','Silva'),('A0004','Perera');
UNLOCK TABLES;
/*!40000 ALTER TABLE `author` ENABLE KEYS */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookTitle` varchar(200) NOT NULL,
  `Publisher_idPublisher` varchar(10) NOT NULL,
  `Author_idAuthor` varchar(10) NOT NULL,
  `Language_idLanguage` varchar(10) NOT NULL,
  `bookId` varchar(45) NOT NULL,
  `Item_idItem` varchar(10) NOT NULL,
  `Category_idCategory` varchar(10) NOT NULL,
  PRIMARY KEY  (`bookId`,`Item_idItem`),
  KEY `fk_Book_Publisher1_idx` (`Publisher_idPublisher`),
  KEY `fk_Book_Author1_idx` (`Author_idAuthor`),
  KEY `fk_Book_Language1_idx` (`Language_idLanguage`),
  KEY `fk_Book_Category1_idx` (`Category_idCategory`),
  CONSTRAINT `fk_Book_Author1` FOREIGN KEY (`Author_idAuthor`) REFERENCES `author` (`idAuthor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Book_Category1` FOREIGN KEY (`Category_idCategory`) REFERENCES `category` (`idCategory`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Book_Language1` FOREIGN KEY (`Language_idLanguage`) REFERENCES `language` (`idLanguage`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Book_Publisher1` FOREIGN KEY (`Publisher_idPublisher`) REFERENCES `publisher` (`idPublisher`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `book`
--


/*!40000 ALTER TABLE `book` DISABLE KEYS */;
LOCK TABLES `book` WRITE;
INSERT INTO `book` VALUES ('Ape gama','P0001','A0001','L0001','B0001','I0002','CA0001'),('Lorna Doone','P0001','A0001','L0001','B0002','I0003','CA0001'),('Fundamentals in java','P0002','A0002','L0001','B0003','I0005','CA0002'),('Trogonemetry','P0003','A0003','L0002','B0004','I0006','CA0003'),('Poetry','P0003','A0004','L0004','B0005','I0007','CA0004'),('Jane Eyre','P0002','A0002','L0001','B0006','I0008','CA0001'),('Madol duwa','P0002','A0002','L0002','B0007','I0010','CA0001');
UNLOCK TABLES;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `idCategory` varchar(10) NOT NULL,
  `categoryName` varchar(200) NOT NULL,
  PRIMARY KEY  (`idCategory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `category`
--


/*!40000 ALTER TABLE `category` DISABLE KEYS */;
LOCK TABLES `category` WRITE;
INSERT INTO `category` VALUES ('CA0001','Novels'),('CA0002','Java'),('CA0003','Maths'),('CA0004','Literature');
UNLOCK TABLES;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `idCustomer` varchar(10) NOT NULL,
  `custName` varchar(100) NOT NULL,
  `custAddress` varchar(200) NOT NULL,
  `contact` int(11) default NULL,
  `nicNo` varchar(10) NOT NULL,
  `creditLimit` decimal(20,2) default NULL,
  PRIMARY KEY  (`idCustomer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--


/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
LOCK TABLES `customer` WRITE;
INSERT INTO `customer` VALUES ('C0001','Mala','Horana',776543212,'976543231v','987.00'),('C00010','Madhu','horana',754321234,'932345432v','8000.00'),('C0002','Danapala','765432123v',776543212,'horana','987.00'),('C0003','Gunapala','654312345v',776541234,'panadura','765.00'),('C0004','Kamal','horana',776543212,'876543212v','986.00'),('C0005','Namal','123456765v',76543212,'horana','6543.00'),('C0006','Dayani','horana',754321234,'654323123v','2000.00'),('C0007','Jagath','panadura',773243212,'654312345v','3000.00'),('C0008','Seetha','panadura',786541234,'654321234v','4000.00'),('C0009','Palitha','horana',765432345,'876543123v','50000.00'),('C0011','Kamani','horana',776542312,'654321234v','3000.00'),('C0012','Pala','horana',776542312,'987654321v','765.00'),('C0013','vfhgcvf','fvfv',776543212,'vcfgvc','766.00');
UNLOCK TABLES;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

--
-- Table structure for table `discarddetail`
--

DROP TABLE IF EXISTS `discarddetail`;
CREATE TABLE `discarddetail` (
  `idDiscardDetail` varchar(10) NOT NULL,
  `discardQty` int(11) default NULL,
  `Item_idItem` varchar(10) NOT NULL,
  PRIMARY KEY  (`idDiscardDetail`),
  KEY `fk_DiscardDetail_Item1_idx` (`Item_idItem`),
  CONSTRAINT `fk_DiscardDetail_Item1` FOREIGN KEY (`Item_idItem`) REFERENCES `item` (`idItem`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `discarddetail`
--


/*!40000 ALTER TABLE `discarddetail` DISABLE KEYS */;
LOCK TABLES `discarddetail` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `discarddetail` ENABLE KEYS */;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE `invoice` (
  `idInvoice` varchar(10) NOT NULL,
  `invDate` date NOT NULL,
  `invTime` time NOT NULL,
  `totalAmount` decimal(10,2) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  `Customer_idCustomer` varchar(10) NOT NULL,
  PRIMARY KEY  (`idInvoice`),
  KEY `fk_Invoice_Customer1_idx` (`Customer_idCustomer`),
  CONSTRAINT `fk_Invoice_Customer1` FOREIGN KEY (`Customer_idCustomer`) REFERENCES `customer` (`idCustomer`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `invoice`
--


/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
LOCK TABLES `invoice` WRITE;
INSERT INTO `invoice` VALUES ('IN0001','2014-08-01','12:32:34','500.00','500.00','C0001'),('IN0002','2014-08-03','10:00:47','2160.00','2160.00','C0001'),('IN0003','2014-08-05','10:01:24','2700.00','2700.00','C00010'),('IN0004','2014-08-10','10:02:05','670.00','470.00','C0001'),('IN0005','2014-08-25','10:02:35','1860.00','1860.00','C0004'),('IN0006','2014-09-02','10:03:15','2480.00','2480.00','C00010'),('IN0007','2014-09-10','10:03:47','2900.00','2900.00','C0005'),('IN0008','2014-09-20','10:04:18','2340.00','2340.00','C0001'),('IN0009','2014-09-22','10:04:49','1550.00','1550.00','C0003'),('IN0010','2014-09-25','10:05:17','1540.00','1540.00','C0002'),('IN0011','2014-09-28','10:05:45','1530.00','1530.00','C0006'),('IN0012','2014-10-03','10:06:33','1260.00','1260.00','C0002'),('IN0013','2014-10-03','18:26:37','1600.00','1300.00','C0001'),('IN0014','2014-10-04','00:07:03','2400.00','2400.00','C0001'),('IN0015','2014-10-10','23:29:52','500.00','500.00','C0001');
UNLOCK TABLES;
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;

--
-- Table structure for table `invoicepayment`
--

DROP TABLE IF EXISTS `invoicepayment`;
CREATE TABLE `invoicepayment` (
  `idInvoicePayment` varchar(10) NOT NULL,
  `payDate` date NOT NULL,
  `amtRecieved` decimal(10,2) NOT NULL,
  `InvoicePaymentcol` varchar(45) NOT NULL,
  `Invoice_idInvoice` varchar(10) NOT NULL,
  PRIMARY KEY  (`idInvoicePayment`),
  KEY `fk_InvoicePayment_Invoice1_idx` (`Invoice_idInvoice`),
  CONSTRAINT `fk_InvoicePayment_Invoice1` FOREIGN KEY (`Invoice_idInvoice`) REFERENCES `invoice` (`idInvoice`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `invoicepayment`
--


/*!40000 ALTER TABLE `invoicepayment` DISABLE KEYS */;
LOCK TABLES `invoicepayment` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `invoicepayment` ENABLE KEYS */;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `idItem` varchar(10) NOT NULL,
  `description` varchar(200) default NULL,
  `costPrice` decimal(10,2) default NULL,
  `salesPrice` decimal(10,2) default NULL,
  `discount` double default NULL,
  `qtyOnHand` int(11) default NULL,
  `reOrderLevel` int(11) default NULL,
  `supplier_idSupplier` varchar(10) NOT NULL,
  PRIMARY KEY  (`idItem`),
  KEY `fk_Item_supplier1_idx` (`supplier_idSupplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `item`
--


/*!40000 ALTER TABLE `item` DISABLE KEYS */;
LOCK TABLES `item` WRITE;
INSERT INTO `item` VALUES ('I0001','I-Eraser','10.00','15.00',2,137,10,'S0001'),('I0002','book','120.00','150.00',5,93,10,'S0002'),('I0003','book','235.00','300.00',7,22,5,'S0002'),('I0004','I- Exercise book- 80 pg','45.00','50.00',8,50,10,'S0003'),('I0005','book','530.00','600.00',8,18,10,'S0004'),('I0006','book','200.00','250.00',5,13,12,'S0005'),('I0007','book','230.00','270.00',4,25,5,'S0006'),('I0008','book','320.00','370.00',7,27,15,'S0007'),('I0009','I- Exercise book- 120 pg','80.00','88.00',5,50,15,'S0008'),('I0010','book','120.00','150.00',5,35,5,'S0001');
UNLOCK TABLES;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;

--
-- Table structure for table `item_has_invoice`
--

DROP TABLE IF EXISTS `item_has_invoice`;
CREATE TABLE `item_has_invoice` (
  `Item_idItem` varchar(10) NOT NULL,
  `Invoice_idInvoice` varchar(10) NOT NULL,
  `itemQty` int(11) NOT NULL,
  `salesPrice` decimal(10,2) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `description` varchar(100) default NULL,
  PRIMARY KEY  (`Invoice_idInvoice`,`Item_idItem`),
  KEY `fk_Item_has_Invoice_Invoice1_idx` (`Invoice_idInvoice`),
  CONSTRAINT `fk_Item_has_Invoice_Invoice1` FOREIGN KEY (`Invoice_idInvoice`) REFERENCES `invoice` (`idInvoice`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `item_has_invoice`
--


/*!40000 ALTER TABLE `item_has_invoice` DISABLE KEYS */;
LOCK TABLES `item_has_invoice` WRITE;
INSERT INTO `item_has_invoice` VALUES ('I0001','IN0001',2,'15.00','30.00','I-Eraser'),('I0003','IN0002',2,'300.00','600.00','B - Lorna Doone'),('I0006','IN0002',3,'250.00','750.00','B - Trogonemetry'),('I0007','IN0002',3,'270.00','810.00','B - Poetry'),('I0002','IN0003',2,'150.00','300.00','B - Ape gama'),('I0003','IN0003',4,'300.00','1200.00','B - Lorna Doone'),('I0005','IN0003',2,'600.00','1200.00','B - Fundamentals in java'),('I0001','IN0004',2,'15.00','30.00','I-Eraser'),('I0007','IN0004',1,'270.00','270.00','B - Poetry'),('I0008','IN0004',1,'370.00','370.00','B - Jane Eyre'),('I0005','IN0005',1,'600.00','600.00','B - Fundamentals in java'),('I0007','IN0005',3,'270.00','810.00','B - Poetry'),('I0010','IN0005',3,'150.00','450.00','B - Madol duwa'),('I0001','IN0006',2,'15.00','30.00','I-Eraser'),('I0002','IN0006',4,'150.00','600.00','B - Ape gama'),('I0008','IN0006',5,'370.00','1850.00','B - Jane Eyre'),('I0002','IN0007',12,'150.00','1800.00','B - Ape gama'),('I0006','IN0007',2,'250.00','500.00','B - Trogonemetry'),('I0010','IN0007',4,'150.00','600.00','B - Madol duwa'),('I0002','IN0008',4,'150.00','600.00','B - Ape gama'),('I0005','IN0008',2,'600.00','1200.00','B - Fundamentals in java'),('I0007','IN0008',2,'270.00','540.00','B - Poetry'),('I0003','IN0009',2,'300.00','600.00','B - Lorna Doone'),('I0006','IN0009',2,'250.00','500.00','B - Trogonemetry'),('I0010','IN0009',3,'150.00','450.00','B - Madol duwa'),('I0006','IN0010',4,'250.00','1000.00','B - Trogonemetry'),('I0007','IN0010',2,'270.00','540.00','B - Poetry'),('I0001','IN0011',2,'15.00','30.00','I-Eraser'),('I0005','IN0011',2,'600.00','1200.00','B - Fundamentals in java'),('I0010','IN0011',2,'150.00','300.00','B - Madol duwa'),('I0007','IN0012',3,'270.00','810.00','B - Poetry'),('I0010','IN0012',3,'150.00','450.00','B - Madol duwa'),('I0003','IN0013',2,'300.00','600.00','B - Lorna Doone'),('I0006','IN0013',4,'250.00','1000.00','book'),('I0003','IN0014',2,'300.00','600.00','B - Lorna Doone'),('I0006','IN0015',2,'250.00','500.00','B - Trogonemetry');
UNLOCK TABLES;
/*!40000 ALTER TABLE `item_has_invoice` ENABLE KEYS */;

--
-- Table structure for table `item_has_purchaseorder`
--

DROP TABLE IF EXISTS `item_has_purchaseorder`;
CREATE TABLE `item_has_purchaseorder` (
  `itemQty` int(11) NOT NULL,
  `costPrice` decimal(10,2) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `Item_idItem` varchar(10) NOT NULL,
  `supplierId` varchar(10) default NULL,
  `PurchaseOrder_idPurchaseOrder` varchar(10) NOT NULL,
  `description` varchar(45) default NULL,
  `recievedQty` int(11) default NULL,
  PRIMARY KEY  (`Item_idItem`,`PurchaseOrder_idPurchaseOrder`),
  KEY `fk_Item_has_PurchaseOrder_PurchaseOrder1_idx` (`PurchaseOrder_idPurchaseOrder`),
  KEY `fk_Item_has_PurchaseOrder_Item1_idx` (`Item_idItem`),
  CONSTRAINT `fk_Item_has_PurchaseOrder_Item1` FOREIGN KEY (`Item_idItem`) REFERENCES `item` (`idItem`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Item_has_PurchaseOrder_PurchaseOrder1` FOREIGN KEY (`PurchaseOrder_idPurchaseOrder`) REFERENCES `purchaseorder` (`idPurchaseOrder`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `item_has_purchaseorder`
--


/*!40000 ALTER TABLE `item_has_purchaseorder` DISABLE KEYS */;
LOCK TABLES `item_has_purchaseorder` WRITE;
INSERT INTO `item_has_purchaseorder` VALUES (10,'120.00','1200.00','I0001','S0001','PO0001','I-Eraser',10),(15,'10.00','225.00','I0001','S0001','PO0003','I-Eraser',12),(23,'10.00','345.00','I0001','S0001','PO0004','I-Eraser',23),(15,'120.00','2250.00','I0002','S0002','PO0002','book',15),(18,'235.00','5400.00','I0003','S0002','PO0002','book',18),(45,'45.00','2250.00','I0004','S0003','PO0005','I- Exercise book- 80 pg',0),(38,'120.00','5700.00','I0010','S0001','PO0003','book',38),(23,'120.00','3450.00','I0010','S0001','PO0007','book',0);
UNLOCK TABLES;
/*!40000 ALTER TABLE `item_has_purchaseorder` ENABLE KEYS */;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
CREATE TABLE `language` (
  `idLanguage` varchar(10) NOT NULL,
  `languageName` varchar(100) NOT NULL,
  PRIMARY KEY  (`idLanguage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `language`
--


/*!40000 ALTER TABLE `language` DISABLE KEYS */;
LOCK TABLES `language` WRITE;
INSERT INTO `language` VALUES ('L00004','Hindi'),('L0001','English'),('L0002','Sinhala'),('L0003','Tamil'),('L0004','Jaepanes');
UNLOCK TABLES;
/*!40000 ALTER TABLE `language` ENABLE KEYS */;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `idPayment` varchar(10) NOT NULL,
  `payDate` date NOT NULL,
  `payTime` time NOT NULL,
  `amountPaid` decimal(10,2) NOT NULL,
  `PurchaseOrder_idPurchaseOrder` varchar(10) NOT NULL,
  PRIMARY KEY  (`idPayment`),
  KEY `fk_Payment_PurchaseOrder1_idx` (`PurchaseOrder_idPurchaseOrder`),
  CONSTRAINT `fk_Payment_PurchaseOrder1` FOREIGN KEY (`PurchaseOrder_idPurchaseOrder`) REFERENCES `purchaseorder` (`idPurchaseOrder`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `payment`
--


/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
LOCK TABLES `payment` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
CREATE TABLE `publisher` (
  `idPublisher` varchar(10) NOT NULL,
  `publisherName` varchar(100) NOT NULL,
  PRIMARY KEY  (`idPublisher`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `publisher`
--


/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
LOCK TABLES `publisher` WRITE;
INSERT INTO `publisher` VALUES ('P0001','wasana'),('P0002','Mal piyali'),('P0003','Sith mal');
UNLOCK TABLES;
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;

--
-- Table structure for table `purchaseorder`
--

DROP TABLE IF EXISTS `purchaseorder`;
CREATE TABLE `purchaseorder` (
  `idPurchaseOrder` varchar(10) NOT NULL,
  `purchaseDate` date NOT NULL,
  `purchaseTime` time NOT NULL,
  `totAmount` decimal(10,2) NOT NULL,
  `Supplier_idSupplier` varchar(10) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  `recievedDate` date default NULL,
  PRIMARY KEY  (`idPurchaseOrder`),
  KEY `fk_PurchaseOrder_Supplier_idx` (`Supplier_idSupplier`),
  CONSTRAINT `fk_PurchaseOrder_Supplier` FOREIGN KEY (`Supplier_idSupplier`) REFERENCES `supplier` (`idSupplier`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `purchaseorder`
--


/*!40000 ALTER TABLE `purchaseorder` DISABLE KEYS */;
LOCK TABLES `purchaseorder` WRITE;
INSERT INTO `purchaseorder` VALUES ('PO0001','2014-08-01','12:32:24','500.00','S0001','157.00','2014-09-10'),('PO0002','2014-08-03','09:04:52','7650.00','S0002','7650.00','2014-09-18'),('PO0003','2014-10-03','09:06:08','5925.00','S0001','5825.00','2014-10-03'),('PO0004','2014-08-24','09:07:35','345.00','S0001','345.00','2014-09-03'),('PO0005','2014-10-03','09:10:03','2250.00','S0003','2150.00',NULL),('PO0006','2014-10-03','09:30:51','1500.00','S0001','1500.00','2014-10-01'),('PO0007','2014-10-04','00:12:10','3450.00','S0001','3450.00',NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `purchaseorder` ENABLE KEYS */;

--
-- Table structure for table `purchasereturn`
--

DROP TABLE IF EXISTS `purchasereturn`;
CREATE TABLE `purchasereturn` (
  `idPurchaseReturn` varchar(10) NOT NULL,
  `returnDate` date default NULL,
  `supplierId` varchar(45) default NULL,
  `returnAmount` decimal(10,2) default NULL,
  `refundAmount` decimal(10,2) default NULL,
  `orderId` varchar(45) default NULL,
  PRIMARY KEY  (`idPurchaseReturn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `purchasereturn`
--


/*!40000 ALTER TABLE `purchasereturn` DISABLE KEYS */;
LOCK TABLES `purchasereturn` WRITE;
INSERT INTO `purchasereturn` VALUES ('PR0001','2014-08-23','S0001','123.00','0.00','PO0001'),('R0002','2014-08-26','S0001','123.00','123.00','PO0002'),('R0003','2014-09-27','S0001','123.00','123.00','PO0002'),('R0004','2014-09-28','S0001','123.00','123.00','PO0002'),('R0005','2014-10-01','S0002','1638.00','1638.00','PO0011'),('R0006','2014-10-01','S0001','478.00','239.00','PO0012'),('R0007','2014-10-01','S0001','239.00','239.00','PO0012'),('R0008','2014-10-03','S0001','20.00','20.00','PO0003'),('R0009','2014-10-04','S0001','10.00','10.00','PO0003');
UNLOCK TABLES;
/*!40000 ALTER TABLE `purchasereturn` ENABLE KEYS */;

--
-- Table structure for table `purchasereturndetail`
--

DROP TABLE IF EXISTS `purchasereturndetail`;
CREATE TABLE `purchasereturndetail` (
  `itemCode` varchar(45) NOT NULL,
  `qty` int(11) default NULL,
  `returnAmount` decimal(10,2) default NULL,
  `PurchaseReturn_idPurchaseReturn` varchar(10) NOT NULL,
  `purchaseorder_idPurchaseOrder` varchar(10) NOT NULL,
  PRIMARY KEY  (`PurchaseReturn_idPurchaseReturn`,`itemCode`),
  KEY `fk_PurchaseReturnDetail_PurchaseReturn1_idx` (`PurchaseReturn_idPurchaseReturn`),
  KEY `fk_PurchaseReturnDetail_purchaseorder1_idx` (`purchaseorder_idPurchaseOrder`),
  CONSTRAINT `fk_PurchaseReturnDetail_purchaseorder1` FOREIGN KEY (`purchaseorder_idPurchaseOrder`) REFERENCES `purchaseorder` (`idPurchaseOrder`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_PurchaseReturnDetail_PurchaseReturn1` FOREIGN KEY (`PurchaseReturn_idPurchaseReturn`) REFERENCES `purchasereturn` (`idPurchaseReturn`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `purchasereturndetail`
--


/*!40000 ALTER TABLE `purchasereturndetail` DISABLE KEYS */;
LOCK TABLES `purchasereturndetail` WRITE;
INSERT INTO `purchasereturndetail` VALUES ('I0001',2,'20.00','R0008','PO0003'),('I0001',1,'10.00','R0009','PO0003');
UNLOCK TABLES;
/*!40000 ALTER TABLE `purchasereturndetail` ENABLE KEYS */;

--
-- Table structure for table `salesreturndetail`
--

DROP TABLE IF EXISTS `salesreturndetail`;
CREATE TABLE `salesreturndetail` (
  `salesReturn_idSalesReturn` varchar(10) NOT NULL,
  `returnDate` date default NULL,
  `Invoice_idInvoice` varchar(10) NOT NULL,
  `itemCode` varchar(45) default NULL,
  `returnQty` int(11) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  PRIMARY KEY  (`salesReturn_idSalesReturn`,`Invoice_idInvoice`),
  KEY `fk_salesReturnDetail_Invoice1_idx` (`Invoice_idInvoice`),
  CONSTRAINT `fk_salesReturnDetail_Invoice1` FOREIGN KEY (`Invoice_idInvoice`) REFERENCES `invoice` (`idInvoice`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salesreturndetail`
--


/*!40000 ALTER TABLE `salesreturndetail` DISABLE KEYS */;
LOCK TABLES `salesreturndetail` WRITE;
INSERT INTO `salesreturndetail` VALUES ('SR0001','2014-10-03','IN0001','I0001',1,'15.00'),('SR0002','2014-10-03','IN0004','I0002',1,'150.00'),('SR0003','2014-10-04','IN0013','I0002',1,'150.00'),('SR0004','2014-10-04','IN0013','I0002',2,'300.00');
UNLOCK TABLES;
/*!40000 ALTER TABLE `salesreturndetail` ENABLE KEYS */;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `idSupplier` varchar(10) NOT NULL,
  `supplierName` varchar(100) NOT NULL,
  `supAddress` varchar(200) NOT NULL,
  `supContact` int(11) NOT NULL,
  `supFax` varchar(200) default NULL,
  `supEmail` varchar(200) default NULL,
  PRIMARY KEY  (`idSupplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `supplier`
--


/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
LOCK TABLES `supplier` WRITE;
INSERT INTO `supplier` VALUES ('S0001','Dulya','Horana',761234512,'dfg','fgh'),('S0002','Medawi','horana',752344312,'sss','sss'),('S0003','Praboda','horana',765431234,'ddd','ddd'),('S0004','Ruwini','horana',743212345,'ddd','ddddd'),('S0005','Dinuka','Mathara',776542312,'hhh','ddd'),('S0006','Yasith','panadura',765432356,'ddd','ddd'),('S0007','Sanjaya','Panadura',776543423,'ssss','hbchcb'),('S0008','Thimira','Horana',786542312,'dcdece','ccrc'),('S0009','fvhan','horana',786543212,'ddferfgrgf','rtrtryth'),('S0010','namalee','horana',786543212,'cfvc','fvcv');
UNLOCK TABLES;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userName` varchar(100) NOT NULL,
  `password` varchar(10) NOT NULL,
  `priviledge` int(11) default NULL,
  PRIMARY KEY  (`userName`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--


/*!40000 ALTER TABLE `users` DISABLE KEYS */;
LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES ('admin','123',1);
UNLOCK TABLES;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

