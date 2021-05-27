SELECT		*
FROM 		sinhvien_dh.university;

SELECT		*
FROM 		university 
WHERE		universityID > ALL(
SELECT 		universityID FROM university 
WHERE 		universityID <5 AND universityID !=2 
); 

-- 5 Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

-- làm bài tập lesson 5 
-- 1 Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
USE 		TestingSystem3; 
CREATE OR REPLACE VIEW 	vw_QuesHoNguyen
AS
SELECT 					Q.*, A.FullName
FROM 					Question Q INNER JOIN `Account` A
ON						Q.CreatorID = A.AccountID
WHERE					SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen';

SELECT * FROM 			vw_QuesHoNguyen;
-- Comman Table Expression
WITH 					QuesHoNguyen AS
(
	SELECT 				Q.*, A.FullName
	FROM 				Question Q INNER JOIN `Account` A
	ON					Q.CreatorID = A.AccountID
	WHERE				SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen'
)
SELECT * FROM 			QuesHoNguyen;

CREATE OR REPLACE VIEW 	account_sale AS  
SELECT 					a.* 
FROM  					`Account` a JOIN 
department d ON a.departmentID= d.departmentID
WHERE 					d.departmentName ='SALE' ; 	

-- 2 Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE OR REPLACE VIEW 	account_group  AS  
SELECT 					a.* 
FROM 					`Account` a JOIN department d ON a.departmentID= d.departmentID
WHERE 					d.departmentName ='GROUP ' ; 

-- 3 Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
USE 		TestingSystem3; 
CREATE OR REPLACE VIEW 	vw_ContenTren21Tu
AS
SELECT 					LENGTH(Content)
FROM					Question
WHERE					LENGTH(Content) > 21;
SELECT * FROM 			vw_ContenTren21Tu;
DROP VIEW 				vw_ContenTren21Tu; 



-- 4 Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW 	vw_DepartmentMaxAccount AS
SELECT 					D.*, COUNT(A.DepartmentID)
FROM					Department D INNER JOIN `Account` A
ON						D.DepartmentID = A.DepartmentID
GROUP BY				D.DepartmentID
HAVING					COUNT(A.DepartmentID) = (
									SELECT 		COUNT(A.DepartmentID)
									FROM		Department D INNER JOIN `Account` A
									ON			D.DepartmentID = A.DepartmentID
									GROUP BY	D.DepartmentID
									HAVING		COUNT(A.DepartmentID)
                                    ORDER BY	COUNT(A.DepartmentID) DESC
                                    LIMIT		1
                                    );
SELECT * FROM 			vw_DepartmentMaxAccount;

-- CTE 
WITH 					MAX_COUNT_DEPARTMENTID AS
(
	SELECT 				COUNT(A.DepartmentID)
	FROM				Department D INNER JOIN `Account` A
	ON					D.DepartmentID = A.DepartmentID
	GROUP BY			D.DepartmentID
	HAVING				COUNT(A.DepartmentID)
    ORDER BY			COUNT(A.DepartmentID) DESC
    LIMIT				1
),
COUNT_DEPARTMENTID 		AS
(
	SELECT 				D.*, COUNT(A.DepartmentID) AS COUNT_DEPARTMENT
	FROM				Department D INNER JOIN `Account` A
	ON					D.DepartmentID = A.DepartmentID
	GROUP BY			D.DepartmentID
	HAVING				COUNT(A.DepartmentID)
)
SELECT 					*
FROM					COUNT_DEPARTMENTID
WHERE					COUNT_DEPARTMENT = (SELECT * FROM MAX_COUNT_DEPARTMENTID);
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE OR REPLACE VIEW 	vw_QuesHoNguyen
AS
SELECT 					Q.*, A.FullName
FROM 					Question Q INNER JOIN `Account` A
ON						Q.CreatorID = A.AccountID
WHERE					SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen';

SELECT * FROM 			vw_QuesHoNguyen;
-- Comman Table Expression
WITH 					QuesHoNguyen AS
(
	SELECT 				Q.*, A.FullName
	FROM 				Question Q INNER JOIN `Account` A
	ON					Q.CreatorID = A.AccountID
	WHERE				SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen'
)
SELECT * FROM 			QuesHoNguyen;





