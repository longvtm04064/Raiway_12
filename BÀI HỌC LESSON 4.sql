USE TestingSystem3;

SELECT 	*
FROM 	`Account` a RIGHT JOIN department d ON a.DepartmentID =d.DepartmentID
WHERE 	a.departmentID IS NULL   ; 

-- LAY RA NHUNG ACCOUNT KHÔNG THUỘC PHONG BAN NÀO 
SELECT * 
FROM 	`Account` a LEFT  JOIN department d ON a.DepartmentID =d.DepartmentID
WHERE 	a.departmentID IS NULL   ; 

-- VÍ DỤ CHO UNION 
SELECT 	* 
FROM 	department 
WHERE 	DepartmentID =3
UNION ALL 
SELECT 	* 
FROM 	department 
WHERE 	DepartmentID =3; 
-- -------------------
SELECT 	* 
FROM 	department 
WHERE 	DepartmentID =3
UNION 
SELECT 	* 
FROM 	department 
WHERE 	DepartmentID =3; 

-- CHÚ Ý : SỰ KHÁC BIỆT CỦA UNION ALL VÀ UNION LÀ UNION ALL LẤY HẾT KỂ CẢ KHÔNG TRÙNG NHAU 
-- LÀM BÀI TẬP LESSON 4 
USE 	TestingSystem3;


SELECT 	* 
FROM 	Exam a INNER   JOIN ExamQuestion d ON a.ExamID =d.ExamID ; 

-- 1  Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 		a.FullName,d. DepartmentName
FROM 		`Account` a INNER  JOIN department d ON a.DepartmentID =d.DepartmentID  ; 

-- 2 Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT		*
FROM		`Account`
WHERE		CreateDate < '2020-03-20';

-- 3 Viết lệnh để lấy ra tất cả các developer
SELECT		*
FROM		`Account` A 
INNER JOIN 	Position P ON A.PositionID = P.PositionID
WHERE		P.PositionName = 'Dev';

-- 4 Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT 		D.DepartmentID, D.DepartmentName, COUNT(A.DepartmentID) AS 'SO LUONG'
FROM 		`Account` A 
INNER JOIN 	Department  D ON D.DepartmentID = A.DepartmentID
GROUP BY 	A.DepartmentID
HAVING 		COUNT(A.DepartmentID) > 3;

-- 5 Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT 		q.QuestionID  , q.Content 
FROM		examquestion e 
INNER JOIN 	question q ON e.QuestionID = q.QuestionID 
GROUP BY 	e.QuestionID 
HAVING 		COUNT(e.QuestionID) = 
(SELECT 	max(countQuestion) FROM 
(SELECT 	count(*) as countQuestion 
FROM 		examquestion GROUP BY QuestionID) as maxCount); 



-- 6 Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT		CQ.CategoryID, CQ.CategoryName, COUNT(Q.CategoryID) AS 'SO LUONG'
FROM		CategoryQuestion CQ 
LEFT JOIN 	Question Q ON CQ.CategoryID = Q.CategoryID
GROUP BY	CQ.CategoryID
ORDER BY	CQ.CategoryID ASC;

-- 7 Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT		Q.Content, COUNT(EQ.QuestionID) AS 'SO LUONG'
FROM		Question Q 
LEFT JOIN 	ExamQuestion EQ ON EQ.QuestionID = Q.QuestionID
GROUP BY	Q.QuestionID
ORDER BY 	EQ.ExamID ASC; 

-- 8 Lấy ra Question có nhiều câu trả lời nhất
SELECT 		Q.QuestionID, Q.Content, COUNT(A.QuestionID) AS 'SO LUONG'
FROM		Question Q 
INNER JOIN 	Answer A ON	Q.QuestionID = A.QuestionID
GROUP BY	A.QuestionID
HAVING		COUNT(A.QuestionID) =	(SELECT 	MAX(CountQ)
									 FROM		(SELECT 		COUNT(A.QuestionID) AS CountQ
												FROM			Answer A 
												RIGHT JOIN  Question Q ON A.QuestionID = Q.QuestionID 
												GROUP BY		A.QuestionID) AS MaxCountQ);
                                                
                                                
 -- 9 Thống kê số lượng account trong mỗi group
 SELECT		G.GroupID, COUNT(GA.AccountID) AS 'SO LUONG'
FROM		GroupAccount GA 
RIGHT JOIN 	`Group` G ON	GA.GroupID = G.GroupID
GROUP BY	G.GroupID
ORDER BY	G.GroupID ASC;


-- 10  Tìm chức vụ có ít người nhất
SELECT 		 p.PositionName 
FROM 		`Account` a INNER JOIN `position` p ON  a.positionID = p. positionID
GROUP BY   	a.positionID HAVING COUNT(*) = 
(SELECT 	min(countPositionID) FROM 
(SELECT		count(*) as countPositionID
FROM 		`Account` GROUP BY  PositionID ) as minCount); 

-- 11 Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT 		d.DepartmentID, d.DepartmentName,p.PositionName, count(p.PositionID) as SL 
FROM 		`Account` a 
INNER JOIN 	department d 	ON a.DepartmentID = d.DepartmentID 
INNER JOIN	position p 		ON a.PositionID = P.PositionID 
GROUP BY 	a.DepartmentID , a.PositionID; 



-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT 		T.TypeName AS 'LOAI CAU HOI', Q.CreatorID AS 'ID NGUOI TAO', Q.Content AS 'CAU HOI', A.Content AS 'CAU TRA LOI', Q.CreateDate AS 'NGAY TAO'
FROM		Question Q 
INNER JOIN 	Answer A ON	Q.QuestionID = A.QuestionID
INNER JOIN	TypeQuestion T ON Q.TypeID = T.TypeID;

-- Question 13: lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT		T.TypeName AS 'LOAI CAU HOI', COUNT(Q.TypeID) AS 'SO LUONG'
FROM		Question Q 
INNER JOIN 	TypeQuestion T ON Q.TypeID = T.TypeID
GROUP BY	Q.TypeID;

-- Question 14: lấy ra group không có account nào
SELECT 		DISTINCT G.GroupName
FROM 		`Group` G
LEFT JOIN 	GroupAccount GA ON G.GroupID = GA.GroupID
WHERE 		GA.AccountID IS NULL;

-- Question 15: lấy ra group không có account nào
SELECT		*
FROM		`Group` 
WHERE		GroupID  NOT IN	(SELECT		GroupID
							 FROM		GroupAccount);
                    
-- Question 16: lấy ra question không có answer nào 
SELECT		*
FROM		Question
WHERE		QuestionID NOT IN (SELECT	QuestionID
							   From		Answer);
                        
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT 		A.FullName
FROM 		`Account` A
JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
WHERE 		GA.GroupID = 1;

-- b) Lấy các account thuộc nhóm thứ 3
SELECT 		A.FullName
FROM 		`Account` A
JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
WHERE 		GA.GroupID = 3;

-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT 		A.FullName
FROM 		`Account` A
JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
WHERE 		GA.GroupID = 1
UNION
SELECT 		A.FullName
FROM 		`Account` A
JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
WHERE 		GA.GroupID = 3;

-- Question 18: 
-- a) Lấy các group có lớn hơn bằng 3 thành viên 
SELECT 		G.GroupName, COUNT(1) AS so_luong
FROM 		`Group` G
JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING 		so_luong >= 3;

-- b) Lấy các group có nhỏ hơn 7 thành viên 
SELECT 		G.GroupName, COUNT(1) AS so_luong
FROM 		`Group` G
JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING 		so_luong <= 7;

-- c) Ghép 2 kết quả từ câu a) và câu b) 
SELECT 		G.GroupName, COUNT(1) AS so_luong
FROM 		`Group` G
JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING 		so_luong >= 3
UNION
SELECT 		G.GroupName, COUNT(1) AS so_luong
FROM 		`Group` G
JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING 		so_luong <= 7;




-- BÀI LÀM THÊM: thống kê mõi bài kiểm tra mỗi loại câu hỏi có bao nhiêu câu 
SELECT 		e.ExamID, e.Title, COUNT(q.QuestionID) as SLCH 
FROM 		examquestion eq INNER JOIN question q 
ON 			eq.QuestionID = q.QuestionID 
INNER JOIN 	exam e ON eq.ExamID= e.ExamID 
GROUP BY 	e.ExamID, questionID; 

-- 











