
CREATE DATABASE `turismo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;


CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `promocao` (
  `idPacote` int(11) NOT NULL AUTO_INCREMENT,
  `nomePacote` varchar(50) DEFAULT NULL,
  `percentual` decimal(10,0) DEFAULT NULL,
  `observacao` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idPacote`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `destino` (
  `id_destino` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `nomeHotel` varchar(100) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `qtdDias` int(11) DEFAULT NULL,
  `valor` decimal(10,0) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idPromocao` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_destino`),
  KEY `idCliente` (`idCliente`),
  KEY `idPromocao` (`idPromocao`),
  CONSTRAINT `destino_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `destino_ibfk_2` FOREIGN KEY (`idPromocao`) REFERENCES `promocao` (`idPacote`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
