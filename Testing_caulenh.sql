USE TestingSystem3;
-- Lay ra tat ca phong ban  
SELECT 			* 
FROM 			(department  );

-- Lay ra ID cua phong ban SALE
SELECT			departmentID 
FROM			department
WHERE			departmentName= 'SALE' ;

-- 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
Select			GroupName 
FROM 			`Group`
where 			CreateDate <'20/12/2019'; 

-- Lấy ra ID của question có >= 4 câu trả lời
SELECT			questionID 
FROM			Answer
GROUP BY		questionID 
HAVING COUNT	(QuestionID) >= 4;

-- Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT Code
FROM 			EXAM 
WHERE 			Duration >= 60  AND CreatDate <20/12/2019;

-- Lấy ra 5 group được tạo gần đây nhất
SELECT * 
FROM 			`Group`
ORDER BY 		CreatDate DESC LIMIT 5;

-- Đếm số nhân viên thuộc department có id = 2
SELECT COUNT 	(AccountID) 
AS 				'SO NHAN VIEN' 
FROM 			`Account`
WHERE  			DepartmentID =2; 

-- Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT 			AccountID
FROM 			`Account`
WHERE LIKE 		"D% , %O" 

-- Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM 	EXAM 
WHERE 			CreateDate <20/12/2019;


-- Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE FROM 	question
WHERE 			'câu hỏi%';
 
 -- 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
 UPDATE			accountID 
 SET			Fullname = 'Nguyễn Bá Lộc' , Email='thành loc.nguyenba@vti.com.vn' 
 WHERE 			accountID =5;  
 
 -- update account có id = 5 sẽ thuộc group có id = 4
  UPDATE		groupaccountID 
  SET           accountID =5 
  WHERE			groupID =4;
  
 
 


