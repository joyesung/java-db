use university; DROP TRIGGER IF EXISTS insert_student; 
DELIMITER // 
CREATE TRIGGER insert_student 
AFTER INSERT ON student
 FOR EACH ROW
 BEGIN 
	insert graduation(graduation_student_num)
    values(new.student_num);
 END// 
 DELIMITER ;


