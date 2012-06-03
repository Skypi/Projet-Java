-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le : Dim 03 Juin 2012 à 14:05
-- Version du serveur: 5.5.16
-- Version de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `myfriendsjava`
--

-- --------------------------------------------------------

--
-- Structure de la table `contacts`
--

CREATE TABLE IF NOT EXISTS `contacts` (
  `idcontact` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(60) DEFAULT NULL,
  `prenom` varchar(60) DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `cdp` varchar(10) DEFAULT NULL,
  `ville` varchar(80) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `entreprise` varchar(60) DEFAULT NULL,
  `loisirs` text,
  PRIMARY KEY (`idcontact`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=38 ;

--
-- Contenu de la table `contacts`
--

INSERT INTO `contacts` (`idcontact`, `nom`, `prenom`, `adresse`, `cdp`, `ville`, `email`, `entreprise`, `loisirs`) VALUES
(1, 'CROZE', 'Nicolas', '21 rue des lilas', '28230', 'Epernon', 'n.croze@insta.fr', 'Alstom', 'Hand wesh !'),
(3, 'TRAN NGUYEN', 'Enji', '71 rue de Normandie', '92400', 'Courbevoie', 'e.tran-nguyen@insta.fr', 'Alstom', 'Sport'),
(24, 'AZAIEZ', 'Ines', '54 rue des pommes', '75006', 'Paris', 'i.azaiez@insta.fr', 'CNRS', 'Informatique'),
(26, 'AUVRAY', 'Matthieu', '13 rue des cerises', '92354', 'Boulogne', 'm.auvray@insta.fr', 'LYV2', 'Musée'),
(27, 'RODINGER', 'Kevin', '56 bd Capuccine', '75002', 'Paris', 'k.rodinger@insta.fr', 'none', 'Sport'),
(28, 'LAGIN', 'Yoann', '24 rue des poulets', '87654', 'Nancy', 'y.lagin@insta.fr', 'none', 'Développement de site internet'),
(29, 'BELLILI', 'Khaled', '54 rue du Gle De Gaulle', '92675', 'Levallois', 'k.bellili@insta.fr', 'none', 'Balade au soleil'),
(30, 'DEROSE', 'Anthony', '87 rue des Pommes', '90876', 'Colombes', 'a.derose@insta.fr', 'none', 'Rugby'),
(31, 'PASQUIERS', 'Benjamin', '21 rue des lilas', '92600', 'Asnières', 'bpasquiers@insta.fr', 'none', 'Jogging'),
(32, 'DELOINCE', 'Guillaume', '21 avenue Gambetta', '92600', 'Asnières', 'g.deloince@insta.fr', 'E-Commerce', 'Promenades'),
(33, 'SOUPAMA', 'Jenny', '89 avenue des Beaux Regards', '92500', 'Puteaux', 'j.soupama@insta.fr', 'none', 'Dance'),
(34, 'JUGGLET', 'Matthieu', '89 bd Saint-Denis', '56789', 'Orléans', 'm.juglet@insta.fr', 'none', 'Cheval'),
(35, 'ZENOU', 'Steve', '89 bd Gaultier', '92400', 'Courbevoie', 's.zenou@insta.fr', 'Total', 'Cheval'),
(36, 'MANIAKIS', 'Vassylis', '89 bd Emile Deschanel', '92400', 'Courbevoie', 'v.maniakis@insta.fr', 'SNCF', 'Bieres'),
(37, 'WAJDI', 'Najim', '72 rue de la Poire ', '92890', 'La Garenne', 'n.wajdi@insta.fr', 'none', 'La chasse');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
