-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Maio-2024 às 16:26
-- Versão do servidor: 10.4.32-MariaDB
-- versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `teste2`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE `curso` (
  `idCurso` int(11) NOT NULL,
  `nameCurso` varchar(200) NOT NULL,
  `duracao` int(11) DEFAULT NULL,
  `activeStatus` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`idCurso`, `nameCurso`, `duracao`, `activeStatus`) VALUES
(1, 'software develepor', 1000, 1),
(2, 'datanalyst', 100, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursomodulo`
--

CREATE TABLE `cursomodulo` (
  `idModulo` int(11) NOT NULL,
  `idCurso` int(11) NOT NULL,
  `activeStatus` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cursomodulo`
--

INSERT INTO `cursomodulo` (`idModulo`, `idCurso`, `activeStatus`) VALUES
(1, 1, 1),
(2, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `falta`
--

CREATE TABLE `falta` (
  `idFalta` int(11) NOT NULL,
  `idModulo` int(11) DEFAULT NULL,
  `idUtilizador` int(11) DEFAULT NULL,
  `dataFalta` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `horasFalta` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `formadormodulo`
--

CREATE TABLE `formadormodulo` (
  `idFormadorModulo` int(11) NOT NULL,
  `idModulo` int(11) DEFAULT NULL,
  `idUtilizador` int(11) DEFAULT NULL,
  `idTurma` int(11) DEFAULT NULL,
  `activeStatus` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `formadormodulo`
--

INSERT INTO `formadormodulo` (`idFormadorModulo`, `idModulo`, `idUtilizador`, `idTurma`, `activeStatus`) VALUES
(1, 1, 2, 1, 1),
(2, 2, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `localizacao`
--

CREATE TABLE `localizacao` (
  `idLocalizacao` int(11) NOT NULL,
  `localizacao` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `localizacao`
--

INSERT INTO `localizacao` (`idLocalizacao`, `localizacao`) VALUES
(2, 'lisboa'),
(1, 'porto');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modulo`
--

CREATE TABLE `modulo` (
  `idModulo` int(11) NOT NULL,
  `nameModulo` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `modulo`
--

INSERT INTO `modulo` (`idModulo`, `nameModulo`) VALUES
(1, 'java'),
(2, 'sql');

-- --------------------------------------------------------

--
-- Estrutura da tabela `moduloformando`
--

CREATE TABLE `moduloformando` (
  `id` int(11) NOT NULL,
  `idUtilizador` int(11) DEFAULT NULL,
  `idModulo` int(11) DEFAULT NULL,
  `nota` double DEFAULT NULL,
  `idTurma` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `moduloformando`
--

INSERT INTO `moduloformando` (`id`, `idUtilizador`, `idModulo`, `nota`, `idTurma`) VALUES
(1, 5, 1, NULL, 1),
(2, 4, 1, NULL, 1),
(3, 5, 2, NULL, 1),
(4, 4, 2, NULL, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipoutilizador`
--

CREATE TABLE `tipoutilizador` (
  `idTipoUtilizador` int(11) NOT NULL,
  `tipoUtilizador` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tipoutilizador`
--

INSERT INTO `tipoutilizador` (`idTipoUtilizador`, `tipoUtilizador`) VALUES
(1, 'formador'),
(2, 'formando');

-- --------------------------------------------------------

--
-- Estrutura da tabela `turma`
--

CREATE TABLE `turma` (
  `idTurma` int(11) NOT NULL,
  `idCurso` int(11) DEFAULT NULL,
  `dataInicio` date DEFAULT NULL,
  `dataFim` date DEFAULT NULL,
  `nome` varchar(200) DEFAULT NULL,
  `idLocalizacao` int(11) DEFAULT NULL,
  `activeStatus` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `turma`
--

INSERT INTO `turma` (`idTurma`, `idCurso`, `dataInicio`, `dataFim`, `nome`, `idLocalizacao`, `activeStatus`) VALUES
(1, 1, '2024-05-08', '2024-09-28', 'porto-software-develepor', 1, 1),
(2, 1, '2024-05-13', '2024-09-27', 'lisboa-soft-dev', 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `utilizador`
--

CREATE TABLE `utilizador` (
  `idUtilizador` int(11) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(200) DEFAULT NULL,
  `idTipoUtilizador` int(11) DEFAULT NULL,
  `activeStatus` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `utilizador`
--

INSERT INTO `utilizador` (`idUtilizador`, `name`, `email`, `telefone`, `idTipoUtilizador`, `activeStatus`) VALUES
(1, 'helder', 'helder@', '123123123', 1, 1),
(2, 'vitor', 'vitor@', '123456456', 1, 1),
(3, 'hugo', 'hugo@', '123456789', 2, 1),
(4, 'miguel', 'miguel@123456', '123456789', 2, 1),
(5, 'jessica', 'jessica@', '123456789', 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `utilizadorturma`
--

CREATE TABLE `utilizadorturma` (
  `idUtilizadorTurma` int(11) NOT NULL,
  `idUtilizador` int(11) DEFAULT NULL,
  `idTurma` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `utilizadorturma`
--

INSERT INTO `utilizadorturma` (`idUtilizadorTurma`, `idUtilizador`, `idTurma`) VALUES
(1, 5, 1),
(2, 4, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`idCurso`),
  ADD UNIQUE KEY `nameCurso` (`nameCurso`);

--
-- Índices para tabela `cursomodulo`
--
ALTER TABLE `cursomodulo`
  ADD PRIMARY KEY (`idModulo`,`idCurso`),
  ADD KEY `idCurso` (`idCurso`);

--
-- Índices para tabela `falta`
--
ALTER TABLE `falta`
  ADD PRIMARY KEY (`idFalta`),
  ADD KEY `idModulo` (`idModulo`),
  ADD KEY `idUtilizador` (`idUtilizador`);

--
-- Índices para tabela `formadormodulo`
--
ALTER TABLE `formadormodulo`
  ADD PRIMARY KEY (`idFormadorModulo`),
  ADD KEY `idTurma` (`idTurma`),
  ADD KEY `idModulo` (`idModulo`),
  ADD KEY `idUtilizador` (`idUtilizador`);

--
-- Índices para tabela `localizacao`
--
ALTER TABLE `localizacao`
  ADD PRIMARY KEY (`idLocalizacao`),
  ADD UNIQUE KEY `localizacao` (`localizacao`);

--
-- Índices para tabela `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`idModulo`),
  ADD UNIQUE KEY `nameModulo` (`nameModulo`);

--
-- Índices para tabela `moduloformando`
--
ALTER TABLE `moduloformando`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idModulo` (`idModulo`),
  ADD KEY `idUtilizador` (`idUtilizador`),
  ADD KEY `idTurma` (`idTurma`);

--
-- Índices para tabela `tipoutilizador`
--
ALTER TABLE `tipoutilizador`
  ADD PRIMARY KEY (`idTipoUtilizador`),
  ADD UNIQUE KEY `tipoUtilizador` (`tipoUtilizador`);

--
-- Índices para tabela `turma`
--
ALTER TABLE `turma`
  ADD PRIMARY KEY (`idTurma`),
  ADD KEY `idCurso` (`idCurso`),
  ADD KEY `idLocalizacao` (`idLocalizacao`);

--
-- Índices para tabela `utilizador`
--
ALTER TABLE `utilizador`
  ADD PRIMARY KEY (`idUtilizador`),
  ADD UNIQUE KEY `email` (`email`),
  ADD KEY `idTipoUtilizador` (`idTipoUtilizador`);

--
-- Índices para tabela `utilizadorturma`
--
ALTER TABLE `utilizadorturma`
  ADD PRIMARY KEY (`idUtilizadorTurma`),
  ADD KEY `idUtilizador` (`idUtilizador`),
  ADD KEY `idTurma` (`idTurma`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `curso`
--
ALTER TABLE `curso`
  MODIFY `idCurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `falta`
--
ALTER TABLE `falta`
  MODIFY `idFalta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `formadormodulo`
--
ALTER TABLE `formadormodulo`
  MODIFY `idFormadorModulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `localizacao`
--
ALTER TABLE `localizacao`
  MODIFY `idLocalizacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `modulo`
--
ALTER TABLE `modulo`
  MODIFY `idModulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `moduloformando`
--
ALTER TABLE `moduloformando`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tipoutilizador`
--
ALTER TABLE `tipoutilizador`
  MODIFY `idTipoUtilizador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `turma`
--
ALTER TABLE `turma`
  MODIFY `idTurma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `utilizador`
--
ALTER TABLE `utilizador`
  MODIFY `idUtilizador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `utilizadorturma`
--
ALTER TABLE `utilizadorturma`
  MODIFY `idUtilizadorTurma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `cursomodulo`
--
ALTER TABLE `cursomodulo`
  ADD CONSTRAINT `cursomodulo_ibfk_1` FOREIGN KEY (`idModulo`) REFERENCES `modulo` (`idModulo`),
  ADD CONSTRAINT `cursomodulo_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`);

--
-- Limitadores para a tabela `falta`
--
ALTER TABLE `falta`
  ADD CONSTRAINT `falta_ibfk_1` FOREIGN KEY (`idModulo`) REFERENCES `modulo` (`idModulo`),
  ADD CONSTRAINT `falta_ibfk_2` FOREIGN KEY (`idUtilizador`) REFERENCES `utilizador` (`idUtilizador`);

--
-- Limitadores para a tabela `formadormodulo`
--
ALTER TABLE `formadormodulo`
  ADD CONSTRAINT `formadormodulo_ibfk_1` FOREIGN KEY (`idTurma`) REFERENCES `turma` (`idTurma`),
  ADD CONSTRAINT `formadormodulo_ibfk_2` FOREIGN KEY (`idModulo`) REFERENCES `modulo` (`idModulo`),
  ADD CONSTRAINT `formadormodulo_ibfk_3` FOREIGN KEY (`idUtilizador`) REFERENCES `utilizador` (`idUtilizador`);

--
-- Limitadores para a tabela `moduloformando`
--
ALTER TABLE `moduloformando`
  ADD CONSTRAINT `moduloformando_ibfk_1` FOREIGN KEY (`idModulo`) REFERENCES `modulo` (`idModulo`),
  ADD CONSTRAINT `moduloformando_ibfk_2` FOREIGN KEY (`idUtilizador`) REFERENCES `utilizador` (`idUtilizador`),
  ADD CONSTRAINT `moduloformando_ibfk_3` FOREIGN KEY (`idTurma`) REFERENCES `turma` (`idTurma`);

--
-- Limitadores para a tabela `turma`
--
ALTER TABLE `turma`
  ADD CONSTRAINT `turma_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`),
  ADD CONSTRAINT `turma_ibfk_2` FOREIGN KEY (`idLocalizacao`) REFERENCES `localizacao` (`idLocalizacao`);

--
-- Limitadores para a tabela `utilizador`
--
ALTER TABLE `utilizador`
  ADD CONSTRAINT `utilizador_ibfk_1` FOREIGN KEY (`idTipoUtilizador`) REFERENCES `tipoutilizador` (`idTipoUtilizador`);

--
-- Limitadores para a tabela `utilizadorturma`
--
ALTER TABLE `utilizadorturma`
  ADD CONSTRAINT `utilizadorturma_ibfk_1` FOREIGN KEY (`idUtilizador`) REFERENCES `utilizador` (`idUtilizador`),
  ADD CONSTRAINT `utilizadorturma_ibfk_2` FOREIGN KEY (`idTurma`) REFERENCES `turma` (`idTurma`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
