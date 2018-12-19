/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : test3

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-12-19 17:31:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sims
-- ----------------------------
DROP TABLE IF EXISTS `sims`;
CREATE TABLE `sims` (
  `stuno` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthdate` varchar(255) DEFAULT NULL,
  `poutlook` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `dormitory` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stuno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sims
-- ----------------------------
