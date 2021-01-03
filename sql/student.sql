/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50649
Source Host           : localhost:3306
Source Database       : goods_db

Target Server Type    : MYSQL
Target Server Version : 50649
File Encoding         : 65001

Date: 2021-01-03 22:18:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'alex', 'swimming', 'english');
INSERT INTO `student` VALUES ('2', 'tom', null, null);
INSERT INTO `student` VALUES ('3', 'tom', null, null);
INSERT INTO `student` VALUES ('4', 'tom', 'play', 'chinese');
