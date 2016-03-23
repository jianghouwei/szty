/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50167
Source Host           : localhost:3306
Source Database       : wxyd

Target Server Type    : MYSQL
Target Server Version : 50167
File Encoding         : 65001

Date: 2016-01-13 18:06:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_mac
-- ----------------------------
DROP TABLE IF EXISTS `user_mac`;
CREATE TABLE `user_mac` (
  `id` bigint(20) NOT NULL,
  `mac` varchar(255) DEFAULT NULL COMMENT '物理地址',
  `connect_protocol` varchar(255) DEFAULT NULL COMMENT '支持以下四种连接协议：\r\nandroid classic bluetooth – 1\r\nios classic bluetooth – 2\r\nble – 3\r\nwifi -- 4\r\n一个设备可以支持多种连接类型，用符号"|"做分割，客户端优先选择靠前的连接方式（优先级按|关系的排序依次降低），举例：\r\n1：表示设备仅支持andiod classic bluetooth 1|2：表示设备支持andiod 和ios 两种classic bluetooth，但是客户端优先选择andriod classic bl',
  `auth_key` varchar(255) DEFAULT NULL COMMENT 'auth及通信的加密key，第三方需要将key烧制在设备上（128bit），格式采用16进制串的方式（长度为32字节），不需要0X前缀，如： 1234567890ABCDEF1234567890ABCDEF ',
  `close_strategy` varchar(255) DEFAULT NULL COMMENT '断开策略，目前支持： 1：退出公众号页面时即断开连接 2：退出公众号之后保持连接不断开 ',
  `conn_strategy` varchar(255) DEFAULT NULL COMMENT '连接策略，32位整型，按bit位置位，目前仅第1bit和第3bit位有效（bit置0为无效，1为有效；第2bit已被废弃），且bit位可以按或置位（如1|4=5），各bit置位含义说明如下：\r\n1：（第1bit置位）在公众号对话页面，不停的尝试连接设备\r\n4：（第3bit置位）处于非公众号页面（如主界面等），微信自动连接。当用户切换微信到前台时，可能尝试去连接设备，连上后一定时间会断开 ',
  `crypt_method` varchar(255) DEFAULT NULL COMMENT 'auth加密方法，目前支持两种取值： 0：不加密 1：AES加密（CBC模式，PKCS7填充方式） ',
  `auth_ver` varchar(255) DEFAULT NULL COMMENT 'auth version，设备和微信进行auth时，会根据该版本号来确认auth buf和auth key的格式（各version对应的auth buf及key的具体格式可以参看“客户端蓝牙外设协议”），该字段目前支持取值： 0：不加密的version 1：version 1 ',
  `manu_mac_pos` varchar(255) DEFAULT NULL COMMENT '表示mac地址在厂商广播manufature data里含有mac地址的偏移，取值如下： -1：在尾部、 -2：表示不包含mac地址 其他：非法偏移 ',
  `ser_mac_pos` varchar(255) DEFAULT NULL COMMENT '表示mac地址在厂商serial number里含有mac地址的偏移，取值如下： -1：表示在尾部 -2：表示不包含mac地址 其他：非法偏移 ',
  `ble_simple_protocol` varchar(255) DEFAULT NULL COMMENT '精简协议类型，取值如下：计步设备精简协议：1 （若该字段填1，connect_protocol 必须包括3。非精简协议设备切勿填写该字段）',
  `state` varchar(255) DEFAULT NULL COMMENT '是否有效1:有效2无效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wx_device
-- ----------------------------
DROP TABLE IF EXISTS `wx_device`;
CREATE TABLE `wx_device` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `deviceid` varchar(255) NOT NULL COMMENT '设备编号，微信分配',
  `mac` varchar(255) DEFAULT NULL COMMENT '物理地址',
  `state` varchar(255) NOT NULL COMMENT '是否授权1已授权2：未授权',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wx_user
-- ----------------------------
DROP TABLE IF EXISTS `wx_user`;
CREATE TABLE `wx_user` (
  `id` bigint(20) NOT NULL,
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信用户Id',
  `mac` varchar(255) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL COMMENT '是否绑定1已绑定2未绑定',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
