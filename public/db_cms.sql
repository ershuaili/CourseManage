/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : db_coursemanage

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 26/05/2021 22:33:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `Clno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级号',
  `Cdiscipline` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '班级专业',
  `Cnumber` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级人数',
  PRIMARY KEY (`Clno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `Cno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程号',
  `Cname` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名',
  `Cteacher` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执教老师',
  `Ccredit` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学分',
  INDEX `Cno`(`Cno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc`  (
  `Sno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `Cno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程号',
  `Grader` int NULL DEFAULT NULL COMMENT '成绩',
  INDEX `Sno`(`Sno`) USING BTREE,
  INDEX `Cno`(`Cno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sc
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `Sno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `Sname` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `Ssex` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生性别',
  `Sage` date NULL DEFAULT NULL COMMENT '学生年龄',
  `Clno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级编号',
  PRIMARY KEY (`Sno`) USING BTREE,
  INDEX `Clno`(`Clno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `Tno` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教工号',
  `Tname` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师姓名',
  `Tsex` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师性别',
  `Tage` date NULL DEFAULT NULL COMMENT '教师年龄',
  PRIMARY KEY (`Tno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Username` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `Password` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `Level` int NOT NULL COMMENT '用户类别',
  PRIMARY KEY (`Username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 0);
INSERT INTO `user` VALUES ('2', '123', 1);
INSERT INTO `user` VALUES ('张三', '李', 0);

SET FOREIGN_KEY_CHECKS = 1;
