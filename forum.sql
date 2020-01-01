/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : forum

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/01/2020 13:25:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admininformation
-- ----------------------------
DROP TABLE IF EXISTS `admininformation`;
CREATE TABLE `admininformation`  (
  `adminID` int(8) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `adminGrade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '2' COMMENT '管理员等级',
  `adminPassword` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '管理员密码',
  `adminAccount` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员账号',
  PRIMARY KEY (`adminID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbsadmin
-- ----------------------------
DROP TABLE IF EXISTS `bbsadmin`;
CREATE TABLE `bbsadmin`  (
  `disposeID` int(11) NOT NULL COMMENT '处理的帖子ID',
  `disposeTime` datetime(0) NOT NULL COMMENT '处理的时间',
  `disposeMethod` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '处理措施',
  `diposeAdminID` int(11) NOT NULL COMMENT '处理的管理员ID',
  PRIMARY KEY (`disposeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbsreply
-- ----------------------------
DROP TABLE IF EXISTS `bbsreply`;
CREATE TABLE `bbsreply`  (
  `RID` int(255) NOT NULL AUTO_INCREMENT COMMENT '跟贴表，自增长',
  `RTID` int(255) NOT NULL COMMENT '外键（BBStopic的SID）回复主贴ID',
  `RSID` int(255) NOT NULL COMMENT '外键（BBStopic的TSID）所在版块ID',
  `RUID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '外键（BBStopic的UID）发帖人ID',
  `RContent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '回帖内容',
  `RTime` datetime(0) NOT NULL COMMENT '回帖时间',
  `Rjisu` int(255) NOT NULL DEFAULT 0 COMMENT '回复级数',
  `RRid` int(11) NULL DEFAULT -1 COMMENT '接回复的ID',
  PRIMARY KEY (`RID`) USING BTREE,
  INDEX `IDforeignkey`(`RTID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbstopic
-- ----------------------------
DROP TABLE IF EXISTS `bbstopic`;
CREATE TABLE `bbstopic`  (
  `TID` int(255) NOT NULL AUTO_INCREMENT COMMENT '发帖表ID',
  `TSID` int(255) NOT NULL COMMENT '所在版块',
  `TUID` int(255) NOT NULL COMMENT '发帖人',
  `TReplyCount` int(255) NULL DEFAULT NULL COMMENT '回复数',
  `TTopic` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标题',
  `TContents` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '正文',
  `TTime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发帖时间',
  `TLastReplyUseID` int(11) NULL DEFAULT NULL COMMENT '最后回复用户ID',
  `TLastReplyTime` datetime(0) NULL DEFAULT NULL COMMENT '最后回复时间',
  PRIMARY KEY (`TID`) USING BTREE,
  INDEX `TSID`(`TSID`) USING BTREE,
  INDEX `TUID`(`TUID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbsuser
-- ----------------------------
DROP TABLE IF EXISTS `bbsuser`;
CREATE TABLE `bbsuser`  (
  `userID` int(8) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户昵称',
  `userBirthday` datetime(6) NULL DEFAULT NULL COMMENT '出生日期',
  `userAge` int(3) NULL DEFAULT NULL COMMENT '年龄',
  `userBlood` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '血型',
  `userLocal` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '居住地',
  `userSchool` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学校',
  `userPassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `userEmail` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '邮箱',
  `userPhone` int(11) NOT NULL COMMENT '电话号码',
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sendreply
-- ----------------------------
DROP TABLE IF EXISTS `sendreply`;
CREATE TABLE `sendreply`  (
  `SendUserID` int(11) NOT NULL COMMENT '用户被回复的ID',
  `SendReplyID` int(11) NULL DEFAULT NULL COMMENT '回复的ID',
  PRIMARY KEY (`SendUserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tzissue
-- ----------------------------
DROP TABLE IF EXISTS `tzissue`;
CREATE TABLE `tzissue`  (
  `TZID` int(11) NOT NULL COMMENT '帖子发布的ID',
  `TZUserID` int(11) NULL DEFAULT NULL COMMENT '帖子用户的ID',
  PRIMARY KEY (`TZID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tzreply
-- ----------------------------
DROP TABLE IF EXISTS `tzreply`;
CREATE TABLE `tzreply`  (
  `ReplyUserID` int(11) NOT NULL COMMENT '回复帖子的ID',
  `ReplyID` int(11) NULL DEFAULT NULL COMMENT '回复的ID',
  PRIMARY KEY (`ReplyUserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for updatereply
-- ----------------------------
DROP TABLE IF EXISTS `updatereply`;
CREATE TABLE `updatereply`  (
  `UpdateReplyTime` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `UpdateType` datetime(0) NULL DEFAULT NULL COMMENT '修改的类型',
  `UpdateAdminID` int(11) NULL DEFAULT NULL COMMENT '修改管理员的ID'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for updateuser
-- ----------------------------
DROP TABLE IF EXISTS `updateuser`;
CREATE TABLE `updateuser`  (
  `UpdateTime` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `UpdateType` datetime(0) NULL DEFAULT NULL COMMENT '修改类型',
  `UpdateAdmin` datetime(0) NULL DEFAULT NULL COMMENT '修改的管理员ID',
  `UpdateUserID` int(11) NULL DEFAULT NULL COMMENT '修改用户的ID'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
