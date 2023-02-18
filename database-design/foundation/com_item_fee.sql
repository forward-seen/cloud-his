/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云-mysql8.0
 Source Server Type    : MySQL
 Source Server Version : 80024
 Source Host           : 49.232.17.105:6033
 Source Schema         : foundation

 Target Server Type    : MySQL
 Target Server Version : 80024
 File Encoding         : 65001

 Date: 05/02/2023 19:25:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for com_item_fee
-- ----------------------------
DROP TABLE IF EXISTS `com_item_fee`;
CREATE TABLE `com_item_fee`  (
  `item_fee_id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `item_fee_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物价项目编码',
  `item_fee_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物价项目名称',
  `country_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家编码',
  `inter_code` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国际编码',
  `specs` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '规格',
  `fee_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '费用类别编码',
  `price` decimal(8, 2) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '价格',
  `child_price` decimal(8, 2) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '儿童价格',
  `unit` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '价格单位',
  `regis_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '注册证编码',
  `regis_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '注册证名称',
  `manufacturer` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生产厂家',
  `nhi_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家医保编码',
  `nhi_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医保类别：甲类、乙类、丙类等',
  `valid_state` tinyint(0) UNSIGNED NULL DEFAULT 1 COMMENT ' 0无效 1有效在用 2删除',
  `oper_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作员',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `compound_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '001' COMMENT '院区编码',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`item_fee_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '物价（非药品）信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
