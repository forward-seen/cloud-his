/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云-mysql8.0-opo
 Source Server Type    : MySQL
 Source Server Version : 80024
 Source Host           : 49.232.17.105:6033
 Source Schema         : opo

 Target Server Type    : MySQL
 Target Server Version : 80024
 File Encoding         : 65001

 Date: 18/02/2023 22:18:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for opo_patient_register
-- ----------------------------
DROP TABLE IF EXISTS `opo_patient_register`;
CREATE TABLE `opo_patient_register`  (
  `patient_register_id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `reg_no` int(0) UNSIGNED NULL DEFAULT NULL COMMENT '顺序号',
  `patient_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人档案号',
  `patient_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '病人姓名',
  `age` int(0) UNSIGNED NULL DEFAULT NULL COMMENT '病人年龄',
  `sex_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '人员性别【C】',
  `reg_dept_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '挂号科室',
  `reg_doctor_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '挂号医生',
  `reg_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '挂号时间',
  `oper_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作员',
  `valid_state` tinyint(0) UNSIGNED NULL DEFAULT 1 COMMENT ' 有效性状态 0无效 1有效(在用) 2删除',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `compound_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '001' COMMENT '院区编码',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`patient_register_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '门诊病人挂号表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of opo_patient_register
-- ----------------------------
INSERT INTO `opo_patient_register` VALUES (1, 1, 'PN00000797', '陈家望', 23, '1', '0107', '', '2023-02-18 22:17:07', NULL, 1, NULL, '001', '2023-02-18 22:17:07', '2023-02-18 22:17:07');

SET FOREIGN_KEY_CHECKS = 1;
