DROP DATABASE IF EXISTS fresher;
CREATE DATABASE fresher;
USE fresher;
DROP TABLE IF EXISTS Trainee;
CREATE TABLE  Trainee(
TraineeID 				INT UNSIGNED PRIMARY KEY  ,
Full_Name 				NVARCHAR(50) NOT NULL,
Birth_Date 				DATE,
 Gender 				VARCHAR(50),
 ET_IQ 					INT, -- NHON  HƠN 20
 ET_Gmath 				INT,-- NHO HƠN 20
ET_English 				INt, -- NHO HƠN 50
Training_Class 			NVARCHAR(50) ,
Evaluation_Notes 		NVARCHAR (50) NOT NULL 
);
       INSERT INTO Trainee(TraineeID ,Full_Name,Birth_Date, Gender, ET_IQ,ET_Gmath,ET_English , Training_Class,Evaluation_Notes)
VALUES( 1,'NGUYENDUCANH', '1996-06-01','MALE',10,10,40,'VT3','DHTN'),
       (2, 'NGUYENHOANGANHMINH', '1996-03-01','`UNKNOWN`', 19,18,30,'VT6','DHTN'),
       (3, 'PHAMTHULAN', '1998-01-02','MALE',16,16,29, 'VT5','DHTN'),
       (4, 'PHAMDUCTAN','1999-03-07','MALE',7,5,27,'VT6','DHTN'),
       (5,'TRANDUCANH','2000-03-05','FEMALE',11,17,28,'VT1','DHTN'),
       (6,'TRANCONGANH','2001-03-01','MALE',16,14,30,'VT1','DHTN'),
       (7, 'PHAMTHIHUONG','1996-01-02','FEMELE',15,14,13,'VT4','DHTN'),
       (8, 'NGUYENMINHDUC','1995-03-01', 'MALE',15,14,20,'VT5','DHTN'),
       (9, 'NGUYENHOANGANH','1992-12-10','MALE',20,20,30,'VT1','DHTN'),
       (10, 'NGUYENDUCTRI','1993-05-10','FEMALE',19,19,40,'VT1','DHTN'),
       (11, 'VuTuanLONG', '1999-11-10','MALE', 18, 19,30,' VT3', 'FPT');
       
-- 4  Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,và sắp xếp theo ngày sinh. Điểm ET_IQ >=12, ET_Gmath>=12, ET_English>=20

   
   SELECT * FROM   Trainee WHERE   ET_IQ>=12 AND  ( ET_IQ>=12 AND ET_English>=20) order by Birth_Date ;
   

 
-- 5 Viết lệnh để lấy ra thông tin thực tập sinh có tên bắt đầu bằng chữ N và kết thúc bằng chữ C
SELECT 	*
FROM    Trainee
WHERE   Full_Name LIKE 'N%C' ;

-- 6 Viết lệnh để lấy ra thông tin thực tập sinh mà tên có ký thự thứ 2 là chữ G
SELECT  *
FROM 	Trainee
WHERE   Full_Name LIKE '_G%';
--  7 Viết lệnh để lấy ra thông tin thực tập sinh mà tên có 10 ký tự và ký tự cuối cùng là C
SELECT 	*
FROM 	Trainee
WHERE 	length  (Full_Name)=10 AND  Full_Name LIKE '%C';

-- 8 Viết lệnh để lấy ra Fullname của các thực tập sinh trong lớp, lọc bỏ các tên trùng nhau.
SELECT 	*
FROM  	Trainee 
DISTINCT  Full_Name ;

-- 9 Viết lệnh để lấy ra Fullname của các thực tập sinh trong lớp, sắp xếp các tên này theo thứ tự từ A-Z.
SELECT	*
FROM    Trainee 
ORDER BY   Full_Name  DESC ;

-- 10: Viết lệnh để lấy ra thông tin thực tập sinh có tên dài nhất 
SELECT 	*
FROM 	Trainee 
WHERE 	length(Full_Name)= (SELECT MAX(length(Full_Name)) FROM Trainee);

-- 11: Viết lệnh để lấy ra ID, Fullname và Ngày sinh thực tập sinh có tên dài nhấT
SELECT 	TraineeID, Fullname, Birth_Date
FROM 	Trainee 
WHERE 	length(Full_Name) =( SELECT MAX(length(Full_Name)) FROM Trainee);

-- 12: Viết lệnh để lấy ra Tên, và điểm IQ, Gmath, English thực tập sinh có tên dài
SELECT   Fullname,ET_IQ,ET_Gmath,ET_English
FROM 	Trainee 
WHERE 	length(Full_Name) =( SELECT MAX(length(Full_Name)) FROM Trainee);










SELECT 	 *
FROM 	 Trainee 
ORDER BY Birth_Date DESC LIMIT 5 


       

