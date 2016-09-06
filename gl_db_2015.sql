/*
Navicat MySQL Data Transfer

Source Server         : my_itecs_conn
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : gl_db_2015

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-08-10 08:32:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cliente
-- ----------------------------
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `id_cliente` int(255) NOT NULL AUTO_INCREMENT,
  `razon_social` varchar(255) DEFAULT NULL,
  `ruc` varchar(11) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `departamento` varchar(255) DEFAULT NULL,
  `codigo_cli` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `celular` varchar(255) DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cliente
-- ----------------------------

-- ----------------------------
-- Table structure for usuario
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_usuario` int(255) NOT NULL AUTO_INCREMENT,
  `dni` varchar(8) DEFAULT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `celular` varchar(255) DEFAULT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of usuario
-- ----------------------------
INSERT INTO `usuario` VALUES ('1', '11111111', 'Jose', 'ok', null, null, null, 'admin', '123', null);
INSERT INTO `usuario` VALUES ('2', '22222222', 'koko', 'ok', null, null, null, 'koko', '123', null);
INSERT INTO `usuario` VALUES ('3', '12345678', 'Juan', '12', null, null, null, null, null, null);
