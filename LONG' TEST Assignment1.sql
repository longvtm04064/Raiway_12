DROP DATABASE IF EXISTS Testing_System_Assigment_1;
CREATE DATABASE Testing_System_Assigment_1;

USE Testing_System_Assigment_1;

CREATE TABLE Department (
DepartmentID INT,
DepartmentName VARCHAR(50)
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position`(
PositionID INT, 
PositionName VARCHAR(50)
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
 AccountID INT,
 Email VARCHAR(100),
 Username VARCHAR(50),
 FullName VARCHAR(50),
 DepartmentID INT,
 PositionID INT,
 CreateDate DATE
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`( 
 GroupID INT,
 GroupName VARCHAR(100),
 CreatorID INT,
 CreateDate DATE
);

DROP TABLE IF EXISTS `GroupAccount`;
CREATE TABLE `GroupAccount`(
GroupID INT,
 AccountID INT,
 JoinDate DATE
);

DROP TABLE IF EXISTS`TypeQuestion`;
CREATE TABLE `TypeQuestion`(
TypeID INT,
TypeName VARCHAR(50)
);

DROP TABLE IF EXISTS `CategoryQuestion`;
CREATE TABLE `CategoryQuestion`(
CategoryID INT,
CategoryName VARCHAR(50)
);

DROP TABLE IF EXISTS `Question`;
CREATE TABLE `Question`(
QuestionID INT,
 Content VARCHAR(50),
 CategoryID INT,
 TypeID INT,
 CreatorID INT,
 CreateDate DATE 
 );
 
 DROP TABLE IF EXISTS `Answer`;
CREATE TABLE `Answer`(
AnswerID INT,
Content VARCHAR(50), 
 QuestionID INT,
 isCorrect VARCHAR(100)
);

DROP TABLE IF EXISTS  `Exam`;
 CREATE TABLE `Exam`(
 ExamID INT,
 Code VARCHAR(100),
 Title INT,
 CategoryID INT,
 Duration VARCHAR(100),
 CreatorID INT,
 CreateDate DATE
);

DROP TABLE IF EXISTS `ExamQuestion`;
CREATE TABLE `ExamQuestion`(
ExamID INT,
QuestionID INT
);
