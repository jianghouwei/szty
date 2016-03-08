/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50167
Source Host           : localhost:3306
Source Database       : szty_system

Target Server Type    : MYSQL
Target Server Version : 50167
File Encoding         : 65001

Date: 2016-03-08 18:05:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_authority
-- ----------------------------
DROP TABLE IF EXISTS `sys_authority`;
CREATE TABLE `sys_authority` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `resouces_id` int(13) DEFAULT NULL,
  `resouces_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `resouces_auth` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '对应页面权限集合',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_authority
-- ----------------------------

-- ----------------------------
-- Table structure for sys_auth_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_auth_roles`;
CREATE TABLE `sys_auth_roles` (
  `id` int(11) NOT NULL,
  `authority_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_auth_roles
-- ----------------------------

-- ----------------------------
-- Table structure for sys_groups
-- ----------------------------
DROP TABLE IF EXISTS `sys_groups`;
CREATE TABLE `sys_groups` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `group_code` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '组别编码',
  `is_enable` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '是否禁用',
  `is_delete` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_groups
-- ----------------------------
INSERT INTO `sys_groups` VALUES ('2', '123213', '12321321312', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_groups_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_groups_roles`;
CREATE TABLE `sys_groups_roles` (
  `id` int(11) NOT NULL,
  `groups_id` int(11) DEFAULT NULL,
  `roles_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_groups_roles
-- ----------------------------

-- ----------------------------
-- Table structure for sys_groups_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_groups_users`;
CREATE TABLE `sys_groups_users` (
  `id` int(11) NOT NULL,
  `group_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_groups_users
-- ----------------------------

-- ----------------------------
-- Table structure for sys_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_resources`;
CREATE TABLE `sys_resources` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `resources_path` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `resources_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `resources_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adds` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `edits` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `imports` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `exports` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `deletes` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `views` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uploads` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_delete` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_enable` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` datetime DEFAULT NULL,
  `create_user` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_resources
-- ----------------------------
INSERT INTO `sys_resources` VALUES ('1', '123', '123', '123', '1', '1', '1', null, '1', '1', '', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles`;
CREATE TABLE `sys_roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_enable` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_delete` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `update_user` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_roles
-- ----------------------------
INSERT INTO `sys_roles` VALUES ('1', '小江强', '123', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `user_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '员工编码',
  `user_email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_sex` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '性别',
  `user_tel` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系电话',
  `is_enable` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_delete` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `upate_user` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_users
-- ----------------------------
INSERT INTO `sys_users` VALUES ('1', '123123', null, '123123', '123123@qq.com', '1', '1231232', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('2', '11235465', null, '12312', '12312@qq.com', '1', '123123', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('4', 'xiaojj', null, 'xiaojj', '279941737@qq.com', '2', '18818200818', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('6', 'xiaojj', null, 'xiaojj', '279941737@qq.com', '2', '18818200818', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('7', 'xiaojj', null, 'xiaojj', '279941737@qq.com', '2', '18818200818', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('8', '123123', null, '12321', '123123@qq.com', '1', '123123', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('9', 'jianghouwei', null, 'xiaojjianga', '123123@qq.com', '1', '123123', null, null, null, null, null, null);
INSERT INTO `sys_users` VALUES ('17', 'admin', '922ec9531b1f94add983a8ce2ebdc97b', '1w1w', '1@qw.com', '2', '12312312', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_users_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_users_roles`;
CREATE TABLE `sys_users_roles` (
  `id` int(11) NOT NULL,
  `users_id` int(11) DEFAULT NULL,
  `roles_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_users_roles
-- ----------------------------
