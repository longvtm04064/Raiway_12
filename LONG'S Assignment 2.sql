DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;

USE Testing_System_Assignment_1;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department (
	DepartmentID		MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName		NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
	PositionID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	PositionName 		ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
    AccountID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email 				NVARCHAR(100) NOT NULL UNIQUE KEY,
    Username 			NVARCHAR(50) NOT NULL UNIQUE KEY,
    FullName 			NVARCHAR(50) NOT NULL,
    DepartmentID 		MEDIUMINT UNSIGNED NOT NULL,
    PositionID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY (DepartmentID)  REFERENCES Department(DepartmentID),
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
    GroupID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName 			NVARCHAR(50) NOT NULL,
    CreatorID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW()
);

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
   GroupID 				MEDIUMINT UNSIGNED,
   AccountID 			MEDIUMINT UNSIGNED,
   JoinDate 			DATETIME,
   PRIMARY KEY (GroupID, AccountID),
   FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
   FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion (
    TypeID 				MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TypeName 			ENUM('Essay', 'Multiple-Choice') NOT NULL
);

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion (
    CategoryID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName 		NVARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS Question;
CREATE TABLE Question (
    QuestionID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 			NVARCHAR(100),
    CategoryID 			MEDIUMINT UNSIGNED NOT NULL,
    TypeID 				MEDIUMINT UNSIGNED NOT NULL,
    CreatorID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (TypeID) REFERENCES  TypeQuestion(TypeID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer (
    AnswerID 			MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 			NVARCHAR(100) NOT NULL ,
    QuestionID 			MEDIUMINT UNSIGNED NOT NULL,
    isCorrect 			BIT,
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam (
    ExamID 				MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` 				CHAR(50) NOT NULL,
    Title 				NVARCHAR(50) NOT NULL,
    CategoryID 			MEDIUMINT UNSIGNED NOT NULL,
    Duration 			TIME NOT NULL,
    CreatorID 			MEDIUMINT UNSIGNED NOT NULL,
    CreateDate 			DATETIME DEFAULT NOW(),
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (CreatorID ) REFERENCES `Account`(AccountID)
);

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion(
	QuestionID 			 MEDIUMINT UNSIGNED NOT NULL,
	ExamID				 MEDIUMINT UNSIGNED NOT NULL,
    PRIMARY KEY (QuestionID, ExamID),
    FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);


-- insert data

INSERT INTO Department(DepartmentName)
VALUES 	('DEV'),
		('Sale'),
		('MKT');

INSERT INTO `Position`(PositionName)
VALUES 	('Dev'),
		('Test'),
		('Scrum Master'),
        ('PM');
        
INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID)
VALUES	('thanhpc@gmail.com', 'thanhvc', 'Vu Cong Thanh', 1, 1),
		('thanhpc2@gmail.com', 'thanhvc2', 'Vu Cong Thanh2', 1, 2),
        ('Lythaito@gmail.com' , 'thaito' , ' Ly Thai To ', 1,3 ),
        ('leloi@gmail.com', 'leloi', 'Le Loi',2,3 ),
        ('NguyenVanCu@gmail.com', 'VanCu',' Nguyen Van Cu',1,2 ),
        ( 'HoangThuNga@gmail.com', 'ThuNga', 'Hoang thu Nga',2,3),
		( 'Vutuanlong@gmail.com', 'tuanlong', 'VuTuanLong', 1,3),
        ( 'Hoangtuyennga@gmail.com', 'tuyetnga', 'Hoang Tuyet Nga', 2,3),
        ('Hoangducchien@gamil.com', 'ducchien', 'Hoang Duc Chien' , 3,1),
        ('Hoangvantan@gmail.com', 'vantan', 'Hoang Van Tan' , 1,4);
	    
        UPDATE Department 
  SET   			DepartmentName = 'MKT66666' 
  WHERE  DepartmentName  = 'SALE' ;
  
  
  DELETE FROM `Account` WHERE Username ='thanhvc2';
        
        