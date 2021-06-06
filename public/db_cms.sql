/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : db_cms

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 05/06/2021 21:52:33
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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '班级表' ROW_FORMAT = DYNAMIC;

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('101', '计算机基础', '计算机基础老师', '5');
INSERT INTO `course` VALUES ('102', '程序设计与语言', '程序设计与语言老师', '4');
INSERT INTO `course` VALUES ('206', '离散数学', '离散数学老师', '4');
INSERT INTO `course` VALUES ('208', '数据结构', '数据结构老师', '4');
INSERT INTO `course` VALUES ('209', '操作系统', '操作系统老师', '4');
INSERT INTO `course` VALUES ('210', '计算机原理', '计算机原理老师', '5');
INSERT INTO `course` VALUES ('212', '数据库原理', '数据库原理老师', '4');
INSERT INTO `course` VALUES ('301', '计算机网络', '计算机网络老师', '3');
INSERT INTO `course` VALUES ('302', '软件工程', '软件工程老师', '3');

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '成绩表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('081101', '101', 80);
INSERT INTO `sc` VALUES ('081101', '102', 78);
INSERT INTO `sc` VALUES ('081101', '206', 76);
INSERT INTO `sc` VALUES ('081102', '102', 78);
INSERT INTO `sc` VALUES ('081102', '206', 78);
INSERT INTO `sc` VALUES ('081103', '101', 62);
INSERT INTO `sc` VALUES ('081103', '102', 70);
INSERT INTO `sc` VALUES ('081103', '206', 81);
INSERT INTO `sc` VALUES ('081104', '101', 90);
INSERT INTO `sc` VALUES ('081104', '102', 84);
INSERT INTO `sc` VALUES ('081104', '206', 65);
INSERT INTO `sc` VALUES ('081106', '101', 65);
INSERT INTO `sc` VALUES ('081106', '102', 71);
INSERT INTO `sc` VALUES ('081106', '206', 80);
INSERT INTO `sc` VALUES ('081107', '101', 78);
INSERT INTO `sc` VALUES ('081107', '102', 80);
INSERT INTO `sc` VALUES ('081107', '206', 68);
INSERT INTO `sc` VALUES ('081108', '101', 85);
INSERT INTO `sc` VALUES ('081108', '102', 64);
INSERT INTO `sc` VALUES ('081108', '206', 87);
INSERT INTO `sc` VALUES ('081109', '101', 66);
INSERT INTO `sc` VALUES ('081109', '102', 83);
INSERT INTO `sc` VALUES ('081109', '206', 70);
INSERT INTO `sc` VALUES ('081110', '101', 95);
INSERT INTO `sc` VALUES ('081110', '102', 90);
INSERT INTO `sc` VALUES ('081110', '206', 89);
INSERT INTO `sc` VALUES ('081111', '101', 91);
INSERT INTO `sc` VALUES ('081111', '102', 70);
INSERT INTO `sc` VALUES ('081111', '206', 76);
INSERT INTO `sc` VALUES ('081113', '101', 63);
INSERT INTO `sc` VALUES ('081113', '102', 79);
INSERT INTO `sc` VALUES ('081113', '206', 60);
INSERT INTO `sc` VALUES ('081201', '101', 80);
INSERT INTO `sc` VALUES ('081202', '101', 65);
INSERT INTO `sc` VALUES ('081203', '101', 87);
INSERT INTO `sc` VALUES ('081204', '101', 91);
INSERT INTO `sc` VALUES ('081210', '101', 76);
INSERT INTO `sc` VALUES ('081216', '101', 81);
INSERT INTO `sc` VALUES ('081218', '101', 70);
INSERT INTO `sc` VALUES ('081220', '101', 82);
INSERT INTO `sc` VALUES ('081221', '101', 76);
INSERT INTO `sc` VALUES ('081241', '101', 90);

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
  `Acredit` int NULL DEFAULT NULL COMMENT '总学分',
  PRIMARY KEY (`Sno`) USING BTREE,
  INDEX `Clno`(`Clno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('081101', '王林', '1', '1990-02-10', '9', 50);
INSERT INTO `student` VALUES ('081102', '程明', '1', '1991-02-01', '9', 50);
INSERT INTO `student` VALUES ('081103', '王燕', '0', '1989-10-06', '9', 50);
INSERT INTO `student` VALUES ('081104', '韦严平', '1', '1990-08-26', '9', 50);
INSERT INTO `student` VALUES ('081106', '李方方', '1', '1990-11-20', '9', 50);
INSERT INTO `student` VALUES ('081107', '李明', '1', '1990-05-01', '9', 54);
INSERT INTO `student` VALUES ('081108', '林一帆', '1', '1989-08-05', '9', 52);
INSERT INTO `student` VALUES ('081109', '张强民', '1', '1989-08-11', '9', 50);
INSERT INTO `student` VALUES ('081110', '张蔚', '0', '1991-07-22', '9', 50);
INSERT INTO `student` VALUES ('081111', '赵琳', '0', '1990-03-18', '9', 50);
INSERT INTO `student` VALUES ('081113', '严红', '0', '1989-08-11', '9', 48);
INSERT INTO `student` VALUES ('081201', '王敏', '1', '1989-06-10', '10', 42);
INSERT INTO `student` VALUES ('081203', '王玉民', '1', '1990-03-26', '10', 42);
INSERT INTO `student` VALUES ('081204', '马琳琳', '0', '1989-02-10', '10', 42);
INSERT INTO `student` VALUES ('081206', '李计', '1', '1989-09-20', '10', 42);
INSERT INTO `student` VALUES ('081210', '李红庆', '1', '1989-05-01', '10', 44);
INSERT INTO `student` VALUES ('081216', '孙祥欣', '1', '1989-03-19', '10', 42);
INSERT INTO `student` VALUES ('081218', '孙妍', '1', '1990-10-09', '10', 42);
INSERT INTO `student` VALUES ('081220', '吴薇华', '0', '1990-03-18', '10', 42);
INSERT INTO `student` VALUES ('081221', '刘燕敏', '0', '1989-11-12', '10', 42);
INSERT INTO `student` VALUES ('081241', '罗琳琳', '0', '1990-01-30', '10', 50);
INSERT INTO `student` VALUES ('1', '张三', '1', '2021-06-04', '8', 60);

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('T01', '老师', '1', '2021-06-01');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Username` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `Password` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `Level` int NOT NULL DEFAULT 0 COMMENT '用户类别1为教师0为学生',
  PRIMARY KEY (`Username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 0);
INSERT INTO `user` VALUES ('2', '123', 0);
INSERT INTO `user` VALUES ('3', '3', 0);
INSERT INTO `user` VALUES ('T01', '1', 1);

-- ----------------------------
-- View structure for scg
-- ----------------------------
DROP VIEW IF EXISTS `scg`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `scg` AS select `student`.`Sno` AS `Sno`,`student`.`Sname` AS `Sname`,`course`.`Cname` AS `Cname`,`sc`.`Grader` AS `Grader` from ((`sc` join `course`) join `student`) where ((`sc`.`Sno` = `student`.`Sno`) and (`sc`.`Cno` = `course`.`Cno`));

SET FOREIGN_KEY_CHECKS = 1;
