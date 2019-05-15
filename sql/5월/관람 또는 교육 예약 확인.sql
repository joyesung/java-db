/* 2.회원아이디를 매개로한 교육 및 관람 예약확인 */
USE museum;
DROP PROCEDURE IF EXISTS search_visit_list; 
DELIMITER // 
CREATE PROCEDURE search_visit_list(
	IN in_user_id VARCHAR(45)
)
BEGIN 
	
    SELECT * FROM re where re_user_id = in_user_id AND  re_situation ='예약신청' AND re_ed_num is null;
    
END //
DELIMITER ;

