-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Maio-2024 às 10:22
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
-- Banco de dados: `test`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE `curso` (
  `idCurso` int(11) NOT NULL,
  `nameCurso` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`idCurso`, `nameCurso`) VALUES
(1, 'software develepor'),
(2, 'datanalyst'),
(3, 'aws');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursomodulo`
--

CREATE TABLE `cursomodulo` (
  `idCursoModulo` int(11) NOT NULL,
  `idModulo` int(11) DEFAULT NULL,
  `idCurso` int(11) DEFAULT NULL,
  `notaModulo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `cursomodulo`
--

INSERT INTO `cursomodulo` (`idCursoModulo`, `idModulo`, `idCurso`, `notaModulo`) VALUES
(1, 3, 2, NULL),
(2, 3, 1, NULL),
(3, 5, 3, NULL),
(4, 1, 1, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursoturma`
--

CREATE TABLE `cursoturma` (
  `idCursoTurma` int(11) NOT NULL,
  `idCurso` int(11) DEFAULT NULL,
  `idTurma` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `cursoturma`
--

INSERT INTO `cursoturma` (`idCursoTurma`, `idCurso`, `idTurma`) VALUES
(1, 1, 3),
(2, 2, 2),
(3, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `falta`
--

CREATE TABLE `falta` (
  `idFalta` int(11) NOT NULL,
  `idCursoModulo` int(11) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `formador`
--

CREATE TABLE `formador` (
  `idFormador` int(11) NOT NULL,
  `idUtilizador` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `formador`
--

INSERT INTO `formador` (`idFormador`, `idUtilizador`) VALUES
(1, 1),
(2, 9),
(3, 13);

-- --------------------------------------------------------

--
-- Estrutura da tabela `formadormodulo`
--

CREATE TABLE `formadormodulo` (
  `idFormadorModulo` int(11) NOT NULL,
  `idModulo` int(11) DEFAULT NULL,
  `idFormador` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `formadormodulo`
--

INSERT INTO `formadormodulo` (`idFormadorModulo`, `idModulo`, `idFormador`) VALUES
(1, 3, 1),
(3, 2, 2),
(4, 2, 2),
(5, 1, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `formando`
--

CREATE TABLE `formando` (
  `idFormando` int(11) NOT NULL,
  `idTurma` int(11) DEFAULT NULL,
  `idUtilizador` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `formando`
--

INSERT INTO `formando` (`idFormando`, `idTurma`, `idUtilizador`) VALUES
(3, 1, 10),
(4, 1, 5),
(9, 1, 10),
(10, 1, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `modulo`
--

CREATE TABLE `modulo` (
  `idModulo` int(11) NOT NULL,
  `nameModulo` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `modulo`
--

INSERT INTO `modulo` (`idModulo`, `nameModulo`) VALUES
(1, 'sql'),
(2, 'uml'),
(3, 'java'),
(4, 'power bi'),
(5, 'python');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipoutilizador`
--

CREATE TABLE `tipoutilizador` (
  `idTipoUtilizador` int(11) NOT NULL,
  `tipoUtilizador` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `tipoutilizador`
--

INSERT INTO `tipoutilizador` (`idTipoUtilizador`, `tipoUtilizador`) VALUES
(1, 'admin'),
(2, 'formador'),
(3, 'formando');

-- --------------------------------------------------------

--
-- Estrutura da tabela `turma`
--

CREATE TABLE `turma` (
  `idTurma` int(11) NOT NULL,
  `nameTurma` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `turma`
--

INSERT INTO `turma` (`idTurma`, `nameTurma`) VALUES
(1, 'turma software 1'),
(2, 'turma data 1'),
(3, 'turma aws 1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `utilizador`
--

CREATE TABLE `utilizador` (
  `idUtilizador` int(11) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(200) DEFAULT NULL,
  `idTipoUtilizador` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `utilizador`
--

INSERT INTO `utilizador` (`idUtilizador`, `name`, `email`, `telefone`, `idTipoUtilizador`) VALUES
(1, 'vitor', 'vitor@', '311654987', 2),
(2, 'bruno', 'bruno@', '321564987', 1),
(5, 'hugo', 'hugo@', '3321654987', 3),
(6, 'miguel', 'miguel@', '321654987', 3),
(9, 'sara', 'sara@', '3216546545', 2),
(10, 'jessica', 'jsessica', '321654987', 3),
(13, 'helder', 'helder@', '123456789', 2);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`idCurso`);

--
-- Índices para tabela `cursomodulo`
--
ALTER TABLE `cursomodulo`
  ADD PRIMARY KEY (`idCursoModulo`),
  ADD KEY `idModulo` (`idModulo`),
  ADD KEY `idCurso` (`idCurso`);

--
-- Índices para tabela `cursoturma`
--
ALTER TABLE `cursoturma`
  ADD PRIMARY KEY (`idCursoTurma`),
  ADD KEY `idCurso` (`idCurso`),
  ADD KEY `idTurma` (`idTurma`);

--
-- Índices para tabela `falta`
--
ALTER TABLE `falta`
  ADD PRIMARY KEY (`idFalta`),
  ADD KEY `idCursoModulo` (`idCursoModulo`);

--
-- Índices para tabela `formador`
--
ALTER TABLE `formador`
  ADD PRIMARY KEY (`idFormador`),
  ADD KEY `idUtilizador` (`idUtilizador`);

--
-- Índices para tabela `formadormodulo`
--
ALTER TABLE `formadormodulo`
  ADD PRIMARY KEY (`idFormadorModulo`),
  ADD KEY `idModulo` (`idModulo`),
  ADD KEY `idFormador` (`idFormador`);

--
-- Índices para tabela `formando`
--
ALTER TABLE `formando`
  ADD PRIMARY KEY (`idFormando`),
  ADD KEY `idTurma` (`idTurma`),
  ADD KEY `idUtilizador` (`idUtilizador`);

--
-- Índices para tabela `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`idModulo`);

--
-- Índices para tabela `tipoutilizador`
--
ALTER TABLE `tipoutilizador`
  ADD PRIMARY KEY (`idTipoUtilizador`);

--
-- Índices para tabela `turma`
--
ALTER TABLE `turma`
  ADD PRIMARY KEY (`idTurma`);

--
-- Índices para tabela `utilizador`
--
ALTER TABLE `utilizador`
  ADD PRIMARY KEY (`idUtilizador`),
  ADD KEY `idTipoUtilizador` (`idTipoUtilizador`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `curso`
--
ALTER TABLE `curso`
  MODIFY `idCurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `cursomodulo`
--
ALTER TABLE `cursomodulo`
  MODIFY `idCursoModulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `cursoturma`
--
ALTER TABLE `cursoturma`
  MODIFY `idCursoTurma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `falta`
--
ALTER TABLE `falta`
  MODIFY `idFalta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `formador`
--
ALTER TABLE `formador`
  MODIFY `idFormador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `formadormodulo`
--
ALTER TABLE `formadormodulo`
  MODIFY `idFormadorModulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `formando`
--
ALTER TABLE `formando`
  MODIFY `idFormando` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `modulo`
--
ALTER TABLE `modulo`
  MODIFY `idModulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `tipoutilizador`
--
ALTER TABLE `tipoutilizador`
  MODIFY `idTipoUtilizador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `turma`
--
ALTER TABLE `turma`
  MODIFY `idTurma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `utilizador`
--
ALTER TABLE `utilizador`
  MODIFY `idUtilizador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

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
-- Limitadores para a tabela `cursoturma`
--
ALTER TABLE `cursoturma`
  ADD CONSTRAINT `cursoturma_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`),
  ADD CONSTRAINT `cursoturma_ibfk_2` FOREIGN KEY (`idTurma`) REFERENCES `turma` (`idTurma`);

--
-- Limitadores para a tabela `falta`
--
ALTER TABLE `falta`
  ADD CONSTRAINT `falta_ibfk_1` FOREIGN KEY (`idCursoModulo`) REFERENCES `cursomodulo` (`idCursoModulo`);

--
-- Limitadores para a tabela `formador`
--
ALTER TABLE `formador`
  ADD CONSTRAINT `formador_ibfk_1` FOREIGN KEY (`idUtilizador`) REFERENCES `utilizador` (`idUtilizador`);

--
-- Limitadores para a tabela `formadormodulo`
--
ALTER TABLE `formadormodulo`
  ADD CONSTRAINT `formadormodulo_ibfk_1` FOREIGN KEY (`idModulo`) REFERENCES `modulo` (`idModulo`),
  ADD CONSTRAINT `formadormodulo_ibfk_2` FOREIGN KEY (`idFormador`) REFERENCES `formador` (`idFormador`);

--
-- Limitadores para a tabela `formando`
--
ALTER TABLE `formando`
  ADD CONSTRAINT `formando_ibfk_1` FOREIGN KEY (`idTurma`) REFERENCES `turma` (`idTurma`),
  ADD CONSTRAINT `formando_ibfk_2` FOREIGN KEY (`idUtilizador`) REFERENCES `utilizador` (`idUtilizador`);

--
-- Limitadores para a tabela `utilizador`
--
ALTER TABLE `utilizador`
  ADD CONSTRAINT `utilizador_ibfk_1` FOREIGN KEY (`idTipoUtilizador`) REFERENCES `tipoutilizador` (`idTipoUtilizador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
