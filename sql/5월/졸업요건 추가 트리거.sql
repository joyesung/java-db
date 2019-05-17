use university; DROP TRIGGER IF EXISTS insert_student; 
DELIMITER // 
CREATE TRIGGER insert_student 
AFTER INSERT ON student
 FOR EACH ROW
 BEGIN 
	declare r_num int;
    declare r_year int;
    /*졸업 요건 정보는 입학년도와 전공을 통해 결정된다는 전제조건*/
    set r_year = new.student_num / 1000000; /*졸업 연도 계산*/
    if new.student_major is not null then
		set r_num = (select requirment_num from requirment where
        new.student_major = requirment_major and requirment_emtance_year = r_year);
    end if;
    
    insert graduation(graduation_student_num,graduation_requirment_num)
    values(new.student_num,r_num);
 END// 
 DELIMITER ;

