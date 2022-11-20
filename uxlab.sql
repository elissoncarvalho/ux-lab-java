--
-- Database: `uxlab`
CREATE database UXLAB;

USE UXLAB;

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `ID_CLIENTE` int(11) NOT NULL,
  `NOME` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `DATA_NASC` date NOT NULL,
  `CPF` varchar(14) COLLATE utf8_unicode_ci NOT NULL,
  `RG` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `SEXO` tinyint(1) NOT NULL,
  `TELEFONE` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ENDERECO` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CEP` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `BAIRRO` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CIDADE` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UF` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DELET` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`ID_CLIENTE`, `NOME`, `DATA_NASC`, `CPF`, `RG`, `SEXO`, `TELEFONE`, `ENDERECO`, `CEP`, `BAIRRO`, `CIDADE`, `UF`, `DELET`) VALUES
(1, 'Marcelina da Silva', '1998-12-09', '122.345.789-83', '78090988', 1, '(37)99909-8787', 'Rua Pedra Azul', '34600-000', 'Dom Joaquim', 'Sabara', 'MG', 0),
(2, 'Miguel Azevedo Costa', '1998-11-08', '099.009.778-54', '78090988', 0, '(37)99980-9454', 'Rua Campos Sales', '35600-000', 'Jardim Alvorada', 'Bom Despacho', 'MG', 0),
(3, 'Maria José dos Santos', '1957-11-10', '546.789.009-12', '12345789', 1, '(35)99178-9654', 'Rua Malaquias', '23595-180', 'São José', 'Campo Grande', 'RJ', 0),
(4, 'Luana Ferreira Campos', '1957-11-10', '966.714.009-12', '12691546', 1, '(35)99178-9654', 'Avenida Flavio Luis', '58000-349', 'Jardim America', 'Copacabana', 'RJ', 0),
(5, 'Rafael Hugo Soares', '1978-01-04', '234.765.980-00', '89764312', 0, '(35)98965-1212', 'Rua Francisco Mendes', '35600-000', 'Aeroporto 2', 'Santarém', 'PA', 0),
(6, 'Paulo José Francisco da Silva', '1989-11-08', '133.098.996-25', '25437689', 0, '(34)99345-0012', 'Rua Esmeralda', '66815-142', 'Operario', 'Belém', 'PA', 0),
(7, 'Cauê Miguel Henry Aragão', '1979-10-06', '666.793.193-23', '12345678', 0, '(23)96543-2145', 'Rua da Macaúba 141', '65370-970', 'Centro', 'Pindaré Mirim', 'MA', 0),
(8, 'Elisa Carolina Gonçalves', '1973-10-06', '503.265.832-46', '89809000', 1, '(23)96543-2145', 'Rua Margaridas 131', '69927-970', 'Centro', 'Porto Acre', 'MG', 0),
(9, 'Luna Alana Martins', '1954-07-09', '329.211.394-64', '98076954', 1, '(34)99256-7654', 'Rua Doutor Miguel Torres 19', '57490-970', '', 'Água Branca', 'AL', 0),
(10, 'Nathan Luís Vicente Viana', '1972-03-07', '930.030.971-48', '98009954', 0, '(31)99200-7687', 'Praça Tiradentes 20', '57490-970', 'Nossa Senhora de Fátima', 'Vila Rica', 'MS', 0),
(11, 'Caio Otávio Benjamin Sales', '1970-07-12', '933.666.159-07', '70089564', 0, '(12)99411-2456', 'Rua Apucarana 148', '86819-970', 'Roseiral', 'Vila Reis', 'PR', 0),
(12, 'Marina Mariane Luiza Bernardes', '1991-11-09', '914.727.523-50', '54378899', 1, '(12)99411-2456', 'Rua Expedito José Sousa Farias 117', '62580-970', 'Vila Mariana', 'Acaraú', 'CE', 0),
(13, 'Andreia Ayla Bernardes', '1990-11-10', '068.029.459-75', '89654321', 1, '(42)98106-2121', 'Rua Principal', '83980-977', 'Vila Zamoura', 'Antônio Olinto', 'PR', 0),
(14, 'Guilherme Isaac Pires', '1990-11-10', '220.992.718-87', '09008765', 0, '(42)98106-2121', 'Rua Vereador Luiz Antonio 360', '13525-970', 'Santa Luzia', 'Águas de São Pedro', 'SP', 0),
(15, 'Emilly Daniela Rafaela Farias', '1983-05-01', '373.484.231-08', '32445789', 1, '(36)97698-0054', 'Praça José Eurico Costa', '77620-970', 'Setor Central', 'Aparecida do Rio Negro', 'TO', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `bioquimica`
--

CREATE TABLE `bioquimica` (
  `ID_BIOQUIMICA` int(11) NOT NULL,
  `ID_PEDIDO_FK` int(11) NOT NULL,
  `GLICOSE` double DEFAULT NULL,
  `ACIDO_URICO` double DEFAULT NULL,
  `UREIA` double DEFAULT NULL,
  `CREATININA` double DEFAULT NULL,
  `COLESTEROL_TOTAL` double DEFAULT NULL,
  `COLESTEROL_HDL` double DEFAULT NULL,
  `COLESTEROL_LDL` double DEFAULT NULL,
  `COLESTEROL_VLDL` double DEFAULT NULL,
  `TRIGLICERIDES` double DEFAULT NULL,
  `TGO` int(11) DEFAULT NULL,
  `TGP` int(11) DEFAULT NULL,
  `GAMA_GT` int(11) DEFAULT NULL,
  `BILIRRUBINA` double DEFAULT NULL,
  `DELET` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `bioquimica`
--

INSERT INTO `bioquimica` (`ID_BIOQUIMICA`, `ID_PEDIDO_FK`, `GLICOSE`, `ACIDO_URICO`, `UREIA`, `CREATININA`, `COLESTEROL_TOTAL`, `COLESTEROL_HDL`, `COLESTEROL_LDL`, `COLESTEROL_VLDL`, `TRIGLICERIDES`, `TGO`, `TGP`, `GAMA_GT`, `BILIRRUBINA`, `DELET`) VALUES
(1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(2, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(3, 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(4, 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(5, 6, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(6, 7, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(7, 8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(8, 9, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(9, 10, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(10, 11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(11, 12, 81, 3.9, 23, 1.07, 180, 70, 110, 21, 120, 28, 21, 18, 0.6, 0),
(12, 13, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(13, 14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(14, 15, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------
--
-- Estrutura da tabela `fezes`
--

CREATE TABLE `fezes` (
  `ID_FEZES` int(11) NOT NULL,
  `ID_PEDIDO_FK` int(11) NOT NULL,
  `Resut_Parasitologico` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Obs_Parasitologico` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SANGUE_OCULTO` tinyint(1) DEFAULT NULL,
  `Obs_SANGUE_OCULTO` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DELET` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `fezes`
--

INSERT INTO `fezes` (`ID_FEZES`, `ID_PEDIDO_FK`, `Resut_Parasitologico`, `Obs_Parasitologico`, `SANGUE_OCULTO`, `Obs_SANGUE_OCULTO`, `DELET`) VALUES
(1, 1, NULL, NULL, NULL, NULL, 0),
(2, 12, 'Presença de Ascaris lumbricoides', 'Presença de Ascaris lumbricoides', 1, 'Presença de cistos de Giardia lamblia.', 0),
(3, 13, NULL, NULL, NULL, NULL, 0),
(4, 14, NULL, NULL, NULL, NULL, 0),
(5, 15, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `hemograma`
--

CREATE TABLE `hemograma` (
  `ID_HEMOGRAMA` int(11) NOT NULL,
  `ID_PEDIDO_FK` int(11) NOT NULL,
  `HEMACIAS` double DEFAULT NULL,
  `HEMOGLOBINA` double DEFAULT NULL,
  `HEMATOCRITO` double DEFAULT NULL,
  `VCM` double DEFAULT NULL,
  `HCM` double DEFAULT NULL,
  `CHCM` double DEFAULT NULL,
  `RDW` double DEFAULT NULL,
  `LEUCOCITOS` double DEFAULT NULL,
  `LEUCOCITOS1` double DEFAULT NULL,
  `NEUTROFILOS` double DEFAULT NULL,
  `NEUTROFILOS1` double DEFAULT NULL,
  `SEGMENTADOS` double DEFAULT NULL,
  `SEGMENTADOS1` double DEFAULT NULL,
  `BASTONETES` double DEFAULT NULL,
  `BASTONETES1` double DEFAULT NULL,
  `EOSINOFILOS` double DEFAULT NULL,
  `EOSINOFILOS1` double DEFAULT NULL,
  `BASOFILOS` double DEFAULT NULL,
  `BASOFILOS1` double DEFAULT NULL,
  `LINFOCITOS` double DEFAULT NULL,
  `LINFOCITOS1` double DEFAULT NULL,
  `MONOCITOS` double DEFAULT NULL,
  `MONOCITOS1` double DEFAULT NULL,
  `CONTAGEM_PLAQUETAS` double DEFAULT NULL,
  `DELET` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `hemograma`
--

INSERT INTO `hemograma` (`ID_HEMOGRAMA`, `ID_PEDIDO_FK`, `HEMACIAS`, `HEMOGLOBINA`, `HEMATOCRITO`, `VCM`, `HCM`, `CHCM`, `RDW`, `LEUCOCITOS`, `LEUCOCITOS1`, `NEUTROFILOS`, `NEUTROFILOS1`, `SEGMENTADOS`, `SEGMENTADOS1`, `BASTONETES`, `BASTONETES1`, `EOSINOFILOS`, `EOSINOFILOS1`, `BASOFILOS`, `BASOFILOS1`, `LINFOCITOS`, `LINFOCITOS1`, `MONOCITOS`, `MONOCITOS1`, `CONTAGEM_PLAQUETAS`, `DELET`) VALUES
(1, 1, 5.12, 15.2, 47.7, 93.2, 29.7, 31.9, 12, 100, 4370, 56, 6000, 39.1, 0, 1.2, 239, 2, 87, 0.1, 4, 51.2, 2237, 7.6, 332, 198, 0),
(2, 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(3, 5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(4, 6, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(5, 7, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(6, 8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(7, 9, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(8, 10, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(9, 11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(10, 12, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(11, 13, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(12, 14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------
--
-- Estrutura da tabela `urina_rotina`
--

CREATE TABLE `urina_rotina` (
  `ID_URINA_ROTINA` int(11) NOT NULL,
  `ID_PEDIDO_FK` int(11) NOT NULL,
  `COR` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DENSIDADE` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ASPECTO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PH` double DEFAULT NULL,
  `CEL_EPITELIAIS` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LEUCOCITOS` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `HEMACIAS` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CILINDROS` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DELET` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `urina_rotina`
--

INSERT INTO `urina_rotina` (`ID_URINA_ROTINA`, `ID_PEDIDO_FK`, `COR`, `DENSIDADE`, `ASPECTO`, `PH`, `CEL_EPITELIAIS`, `LEUCOCITOS`, `HEMACIAS`, `CILINDROS`, `DELET`) VALUES
(1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(2, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(3, 11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(4, 12, 'Amarelo Citrino', '1.032', 'Limpido', 6, '01', 'Ausente', '0', 'Ausente', 0),
(5, 13, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(6, 14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(7, 15, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `ID_N_PEDIDO` int(11) NOT NULL,
  `COD_CLIENTE_FK` int(11) NOT NULL,
  `DATA_PEDIDO` date NOT NULL,
  `CONVENIO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ACTIVE_HEMOGRAMA` tinyint(1) NOT NULL DEFAULT '0',
  `ACTIVE_BIOQUIMICA` tinyint(1) NOT NULL DEFAULT '0',
  `ACTIVE_FEZES` tinyint(1) NOT NULL DEFAULT '0',
  `ACTIVE_URINAROTINA` tinyint(1) NOT NULL DEFAULT '0',
  `STATUS_HEMOGRAMA` tinyint(1) NOT NULL DEFAULT '0',
  `STATUS_BIOQUIMICA` tinyint(1) NOT NULL DEFAULT '0',
  `STATUS_URINAROTINA` tinyint(1) NOT NULL DEFAULT '0',
  `STATUS_SANGUEOCULTO` tinyint(1) NOT NULL DEFAULT '0',
  `DELET` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`ID_N_PEDIDO`, `COD_CLIENTE_FK`, `DATA_PEDIDO`, `CONVENIO`, `ACTIVE_HEMOGRAMA`, `ACTIVE_BIOQUIMICA`, `ACTIVE_FEZES`, `ACTIVE_URINAROTINA`, `STATUS_HEMOGRAMA`, `STATUS_BIOQUIMICA`, `STATUS_URINAROTINA`, `STATUS_SANGUEOCULTO`, `DELET`) VALUES
(1, 1, '2019-06-11', 'Unimed', 1, 1, 1, 1, 0, 0, 0, 0, 0),
(2, 2, '2019-06-11', 'Unimed', 0, 1, 0, 1, 0, 0, 0, 0, 0),
(3, 3, '2019-06-11', 'SUS', 0, 1, 0, 0, 0, 0, 0, 0, 0),
(4, 4, '2019-06-11', 'SUS', 1, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 5, '2019-06-11', 'SUS', 1, 1, 0, 0, 0, 0, 0, 0, 0),
(6, 6, '2019-06-11', 'HAPVIDA', 1, 1, 0, 0, 0, 0, 0, 0, 0),
(7, 7, '2019-06-11', 'AMIL', 1, 1, 0, 0, 0, 0, 0, 0, 0),
(8, 8, '2019-06-11', 'NOSSA SAUDE', 1, 1, 0, 0, 0, 0, 0, 0, 0),
(9, 9, '2019-06-11', 'SANTA HELENA', 1, 1, 0, 0, 0, 0, 0, 0, 0),
(10, 10, '2019-06-11', 'Omint', 1, 1, 0, 0, 0, 0, 0, 0, 0),
(11, 11, '2019-06-11', 'Unimed', 1, 1, 0, 1, 0, 0, 0, 0, 0),
(12, 12, '2019-06-11', 'SUS', 1, 1, 1, 1, 0, 0, 0, 0, 0),
(13, 13, '2019-06-11', 'SUS', 1, 1, 1, 1, 0, 0, 0, 0, 0),
(14, 14, '2019-06-11', 'Promed', 1, 1, 1, 1, 0, 0, 0, 0, 0),
(15, 15, '2019-06-11', 'Goldencross', 0, 1, 1, 1, 0, 0, 0, 0, 0);

--
-- Acionadores `pedido`
--
DELIMITER $$
CREATE TRIGGER `geraRotina` AFTER INSERT ON `pedido` FOR EACH ROW BEGIN
IF (NEW.ACTIVE_BIOQUIMICA = 1) THEN
	INSERT INTO bioquimica VALUES (NULL, NEW.ID_N_PEDIDO, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,  0);
END IF;
IF (NEW.ACTIVE_HEMOGRAMA = 1) THEN
    INSERT INTO hemograma VALUES (NULL, NEW.ID_N_PEDIDO, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
END IF;
IF (NEW.ACTIVE_URINAROTINA = 1) THEN
    INSERT INTO urina_rotina VALUES (NULL, NEW.ID_N_PEDIDO, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
END IF;
IF (NEW.ACTIVE_FEZES = 1) THEN
    INSERT INTO fezes VALUES (NULL, NEW.ID_N_PEDIDO, NULL, NULL, NULL, NULL, 0);
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `ID_USUARIO` int(11) NOT NULL,
  `NOME_COMPLETO` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USUARIO` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EMAIL` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SENHA` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NIVEL` tinyint(1) DEFAULT '0',
  `DELET` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bioquimica`
--
ALTER TABLE `bioquimica`
  ADD PRIMARY KEY (`ID_BIOQUIMICA`),
  ADD KEY `ID_PEDIDO_FK` (`ID_PEDIDO_FK`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID_CLIENTE`);

--
-- Indexes for table `fezes`
--
ALTER TABLE `fezes`
  ADD PRIMARY KEY (`ID_FEZES`),
  ADD KEY `ID_PEDIDO_FK` (`ID_PEDIDO_FK`);

--
-- Indexes for table `hemograma`
--
ALTER TABLE `hemograma`
  ADD PRIMARY KEY (`ID_HEMOGRAMA`),
  ADD KEY `ID_PEDIDO_FK` (`ID_PEDIDO_FK`);

--
-- Indexes for table `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ID_N_PEDIDO`),
  ADD KEY `COD_CLIENTE_FK` (`COD_CLIENTE_FK`);

--
-- Indexes for table `urina_rotina`
--
ALTER TABLE `urina_rotina`
  ADD PRIMARY KEY (`ID_URINA_ROTINA`),
  ADD KEY `ID_PEDIDO_FK` (`ID_PEDIDO_FK`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_USUARIO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bioquimica`
--
ALTER TABLE `bioquimica`
  MODIFY `ID_BIOQUIMICA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID_CLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `fezes`
--
ALTER TABLE `fezes`
  MODIFY `ID_FEZES` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `hemograma`
--
ALTER TABLE `hemograma`
  MODIFY `ID_HEMOGRAMA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `pedido`
--
ALTER TABLE `pedido`
  MODIFY `ID_N_PEDIDO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `urina_rotina`
--
ALTER TABLE `urina_rotina`
  MODIFY `ID_URINA_ROTINA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_USUARIO` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `bioquimica`
--
ALTER TABLE `bioquimica`
  ADD CONSTRAINT `BIOQUIMICA_ibfk_1` FOREIGN KEY (`ID_PEDIDO_FK`) REFERENCES `pedido` (`ID_N_PEDIDO`);

--
-- Limitadores para a tabela `fezes`
--
ALTER TABLE `fezes`
  ADD CONSTRAINT `FEZES_ibfk_1` FOREIGN KEY (`ID_PEDIDO_FK`) REFERENCES `pedido` (`ID_N_PEDIDO`);

--
-- Limitadores para a tabela `hemograma`
--
ALTER TABLE `hemograma`
  ADD CONSTRAINT `HEMOGRAMA_ibfk_1` FOREIGN KEY (`ID_PEDIDO_FK`) REFERENCES `pedido` (`ID_N_PEDIDO`);

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `PEDIDO_ibfk_1` FOREIGN KEY (`COD_CLIENTE_FK`) REFERENCES `cliente` (`ID_CLIENTE`);

--
-- Limitadores para a tabela `urina_rotina`
--
ALTER TABLE `urina_rotina`
  ADD CONSTRAINT `URINA_ROTINA_ibfk_1` FOREIGN KEY (`ID_PEDIDO_FK`) REFERENCES `pedido` (`ID_N_PEDIDO`);

