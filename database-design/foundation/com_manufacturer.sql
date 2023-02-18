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
DROP TABLE IF EXISTS `com_manufacturer`;
CREATE TABLE `com_manufacturer`  (
  `manufacturer_id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `manufacturer_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '药品生产厂家编码',
  `manufacturer_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '药品生产厂家名称',
  `address` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `valid_state` tinyint(0) UNSIGNED NULL DEFAULT 1 COMMENT ' 0无效 1有效在用 2删除',
  `oper_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作员',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `compound_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '001' COMMENT '院区编码',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`manufacturer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '药品生产厂家信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
