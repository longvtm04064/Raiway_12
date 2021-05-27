USE 	sinhvien_DH;


-- Question: thong ke moi trường dai hoc, moi chuyen ngành bao nhiêu sinh viên  
SELECT 		B.universityName, B.universityID,C.majorName    , COUNT(*) AS'SO LUONG SV'  
FROM 		student A 
JOIN 		university B  on A.universityID=B.universityID
JOIN 		major C       on A.majorID=C.majorID
GROUP BY  	A.universityID, C .majorID ; 
-- lay ra thong tin trương có nhieu sinh vien nhat 
SELECT 		B.universityName, B.universityID, COUNT(*) AS'SO LUONG SV'  
FROM 		university B 
JOIN 		student A ON A.universityID=B.universityID
GROUP BY 	A.universityID 	
HAVING 		COUNT(*) = ( SELECT MAX(SOLUONGSV)  
							FROM 	(SELECT COUNT(*) AS  		SOLUONGSV
													FROM 		student 
												
														GROUP BY 	universityID) AS COUNT_SINHVIEN );  	

-- LAY RA THONG TIN NGANH  CO IT  SINH VIEN NHAT 
SELECT  m.majorName, count(*) FROM student s
  JOIN major m on s.majorID = m.majorID
 GROUP BY s.majorID
 HAVING count(*)=
 (SELECT min(SL) FROM (SELECT COUNT(*) AS SL FROM STUDENT GROUP BY majorID) AS  minsl);	





	



