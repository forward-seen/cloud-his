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

 Date: 24/01/2023 13:49:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for com_user
-- ----------------------------
DROP TABLE IF EXISTS `com_patient_identify_type`;
CREATE TABLE `com_patient_identify_type`  (
  `patient_identify_type_id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型编码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型名称',
  `valid_state` tinyint(0) UNSIGNED NULL DEFAULT 1 COMMENT ' 0无效 1有效在用 2删除',
  `oper_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作员',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `compound_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '001' COMMENT '院区编码',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`patient_identify_type_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '患者身份类型' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
