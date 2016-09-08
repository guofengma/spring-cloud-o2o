/*
Navicat MySQL Data Transfer

Source Server         : cloud
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : cloud

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-09-05 10:25:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_mp_supplier
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_mp_supplier`;
CREATE TABLE `t_merchants_mp_supplier` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `merchants_id` int(10) DEFAULT NULL,
  `mp_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_mp
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_mp`;
CREATE TABLE `t_merchants_mp` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `wx_gh` varchar(50) DEFAULT NULL,
  `wx_app_id` varchar(50) DEFAULT NULL,
  `wx_app_secret` varchar(50) DEFAULT NULL,
  `wx_merchants_no` varchar(50) DEFAULT NULL,
  `wx_merchants_key` varchar(50) DEFAULT NULL,
  `wx_name` varchar(50) DEFAULT NULL,
  `use_status` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_message
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_message`;
CREATE TABLE `t_merchants_message` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `msg_content` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `read_state` varchar(2) DEFAULT NULL,
  `merchants_id` int(15) DEFAULT NULL,
  `send_user` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_supplier
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_supplier`;
CREATE TABLE `t_merchants_supplier` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `merchants_name` varchar(30) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `area` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `longitude` varchar(50) DEFAULT NULL,
  `latitude` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `audit_status` varchar(2) DEFAULT NULL,
  `id_card` varchar(50) DEFAULT NULL,
  `id_card_url` varchar(50) DEFAULT NULL,
  `business_license` varchar(50) DEFAULT NULL,
  `parent_id` varchar(15) DEFAULT NULL,
  `payment_channel` varchar(50) DEFAULT NULL,
  `supllier_type` varchar(2) DEFAULT NULL,
  `store_state` varchar(5) DEFAULT NULL,
  `service_radius` varchar(50) DEFAULT NULL,
  `merchants_logo_url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_account
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_account`;
CREATE TABLE `t_merchants_account` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `use_status` varchar(2) DEFAULT NULL,
  `allow_count` int(2) DEFAULT NULL,
  `pass_keyword` varchar(10) DEFAULT NULL,
  `account_type` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;




SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_account_mp
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_account_mp`;
CREATE TABLE `t_merchants_account_mp` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account_id` int(20) DEFAULT NULL,
  `mp_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_merchants_account_mp
-- ----------------------------
DROP TABLE IF EXISTS `t_merchants_account_supplier`;
CREATE TABLE `t_merchants_account_supplier` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `merchants` int(20) DEFAULT NULL,
  `account_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

