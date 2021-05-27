DROP DATABASE IF EXISTS quanlynhanvien;
CREATE DATABASE quanlynhanvien;
USE quanlynhanvien;
DROP TABLE IF EXISTS department;
CREATE TABLE department(
Department_Number INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Department_Name ENUM('SALE','MKT','DEV','PM')NOT NULL UNIQUE KEY);  
DROP TABLE IF EXISTS Employee_Table;
CREATE  TABLE Employee_Table(
Employee_Number INT UNSIGNED  UNIQUE,
Employee_Name VARCHAR(50)  ,
Department_Number INT UNSIGNED NOT NULL ,
FOREIGN KEY (Department_Number)  REFERENCES department(Department_Number));
DROP TABLE IF EXISTS   Skill_Table;
CREATE TABLE Skill_Table (
Skill_Number INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
Skill_Name ENUM('JAVA','C++','C#','PHP') NOT NULL UNIQUE KEY);
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
Employee_Number INT UNSIGNED NOT NULL UNIQUE ,
Skill_Number INT UNSIGNED NOT NULL,
Date_Registered DATE,
FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number),
FOREIGN KEY (Skill_Number) REFERENCES Skill_Table(Skill_Number) );
INSERT INTO department(Department_Name) 
VALUES ('SALE'),('MKT'),('DEV'),('PM');

INSERT INTO  Employee_Table(Employee_Number,Employee_Name,Department_Number)
   VALUES  (1,'NGUYENTHANHAN',1),(2,'NGUYENHUYHOANG',2),(3,'NGUYENMANHAN',3),(4,'PHAMDUCANH',4),
        (5,'PHAMHUONGLAN',3),(6,'PHANVANNGOC',4),(7,'NGUYENTRIANH',1),(8,'PHAMHONGNGOC',2),
        (9,'PHANMINHDUC',4),(10,'NGUYENHUONGLAN',3); 
INSERT INTO Skill_Table(Skill_Name)
VALUES ('JAVA'),('C++'),('C#'),('PHP');
INSERT INTO Employee_Skill_Table(Employee_Number,Skill_Number,Date_Registered )
VALUES (1,1,'2019-05-01'),(2,2,'2018-03-01'),(3,3,'2020-06-07'),(4,4,'2020-07-02'),
(5,4,'2021-03-04'),(6,2,'2020-03-01'),
(7,2,'2020-04-04'),(8,3,'03-03-01'),(9,1,'2020-01-02'),(10,2,'2020-12-11');

DROP DATABASE IF EXISTS quanlynhanvien;
CREATE DATABASE quanlynhanvien;
USE quanlynhanvien;
DROP TABLE IF EXISTS department;
CREATE TABLE department(
Department_Number INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Department_Name ENUM('SALE','MKT','DEV','PM')NOT NULL UNIQUE KEY);  
DROP TABLE IF EXISTS Employee_Table;
CREATE  TABLE Employee_Table(
Employee_Number INT UNSIGNED  UNIQUE,
Employee_Name VARCHAR(50)  ,
Department_Number INT UNSIGNED NOT NULL ,
FOREIGN KEY (Department_Number)  REFERENCES department(Department_Number));
DROP TABLE IF EXISTS   Skill_Table;
CREATE TABLE Skill_Table (
Skill_Number INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
Skill_Name ENUM('JAVA','C++','C#','PHP') NOT NULL UNIQUE KEY);
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
Employee_Number INT UNSIGNED NOT NULL UNIQUE ,
Skill_Number INT UNSIGNED NOT NULL,
Date_Registered DATE,
FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number),
FOREIGN KEY (Skill_Number) REFERENCES Skill_Table(Skill_Number) );
INSERT INTO department(Department_Name) 
VALUES ('SALE'),('MKT'),('DEV'),('PM');

INSERT INTO  Employee_Table(Employee_Number,Employee_Name,Department_Number)
   VALUES  (1,'NGUYENTHANHAN',1),(2,'NGUYENHUYHOANG',2),(3,'NGUYENMANHAN',3),(4,'PHAMDUCANH',4),
        (5,'PHAMHUONGLAN',3),(6,'PHANVANNGOC',4),(7,'NGUYENTRIANH',1),(8,'PHAMHONGNGOC',2),
        (9,'PHANMINHDUC',4),(10,'NGUYENHUONGLAN',3); 
INSERT INTO Skill_Table(Skill_Name)
VALUES ('JAVA'),('C++'),('C#'),('PHP');
INSERT INTO Employee_Skill_Table(Employee_Number,Skill_Number,Date_Registered )
VALUES (1,1,'2019-05-01'),(2,2,'2018-03-01'),(3,3,'2020-06-07'),(4,4,'2020-07-02'),
(5,4,'2021-03-04'),(6,2,'2020-03-01'),
(7,2,'2020-04-04'),(8,3,'03-03-01'),(9,1,'2020-01-02'),(10,2,'2020-12-11');


-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
-- Hướng dẫn: sử dụng UNION
SELECT ET.Employee_Name FROM Employee_Table ET  
INNER JOIN Employee_Skill_Table ES
ON ET.Employee_Number = ES.Employee_Number 
WHERE ES.Skill_Number IN
(SELECT ES.Skill_Number FROM Employee_Skill_Table ES INNER JOIN Skill_Table ST
ON ES.Skill_Number = ST.Skill_Number
WHERE ST.Skill_Name = 'JAVA');
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT D.Department_Name,count(*) AS SL FROM Employee_Table ET 
INNER JOIN department D ON 
ET.Department_Number = D.Department_Number
GROUP BY D.Department_Name
HAVING SL >= 3;
-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
-- Hướng dẫn: sử dụng GROUP BY
SELECT ET.Employee_Name,D.Department_Name FROM  Employee_Table ET LEFT JOIN department D
ON ET.Department_Number .Department_Number
ORDER BY (D.Department_Name);
-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT ET.Employee_Name ,COUNT(ES.Skill_Number) AS SL FROM Employee_Table ET  
INNER JOIN Employee_Skill_Table ES
ON  ET.Employee_Number = ES.Employee_Number
GROUP BY ES.Skill_Number
HAVING SL >3;