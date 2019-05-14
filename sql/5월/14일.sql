/* 
graduation 테이블에서 학생 정보가 주어졌을 때 graudation_ok에 값을 설정하는 프로시저를
작성하세요.
*/
USE university;
DROP PROCEDURE IF EXISTS update_graduation;
DELIMITER //
CREATE PROCEDURE update_graduation(
	IN in_student_num INT,
    In in_requirment_num Int
)
BEGIN
	DECLARE s_english, r_english INT; -- 변수이름을 지어서 선언 
    DECLARE s_project, r_project VARCHAR(1);
    DECLARE s_paper, r_paper VARCHAR(1);
    DECLARE s_test, r_test VARCHAR(1); -- declare는 선언하다
    DECLARE s_certificate, r_certificate VARCHAR(1);
	SET s_english = (SELECT graduation_english FROM graduation WHERE graduation_num = in_student_num);
	SET s_project = (SELECT graduation_project FROM graduation WHERE graduation_num = in_student_num);	
    SET s_paper = (SELECT graduation_paper FROM graduation WHERE graduation_num = in_student_num);	
    SET s_test = (SELECT graduation_test FROM graduation WHERE graduation_num = in_student_num);	
    SET s_certificate = (SELECT graduation_certificate FROM graduation WHERE graduation_num = in_student_num);	
    SET r_english = (SELECT requirment_english FROM requirment WHERE requirment_num = in_requirment_num);
	SET r_project = (SELECT requirment_project FROM requirment WHERE requirment_num = in_requirment_num);	
    SET r_paper = (SELECT requirment_paper FROM requirment WHERE requirment_num = in_requirment_num);	
    SET r_test = (SELECT requirment_test FROM requirment WHERE requirment_num = in_requirment_num);	
    SET r_certificate = (SELECT requirment_certificate FROM requirment WHERE requirment_num = in_requirment_num);	
    IF r_english <= s_english 
		AND ( r_paper = 'N' or (r_paper = 'Y' AND s_paper='Y') )
        AND ( r_test = 'N' or (r_test = 'Y' AND s_test='Y') )
        AND ( r_project = 'N' or (r_project = 'Y' AND s_project='Y') )
        AND ( r_certificate = 'N' or (r_certificate = 'Y' AND s_certificate='Y') ) THEN
        UPDATE 	graduation
        SET		graduation_ok = 'Y'
		WHERE	graduation_num = in_student_num;
	ELSE
		UPDATE 	graduation
        SET		graduation_ok = 'N'
		WHERE	graduation_num = in_student_num;
	END IF;
END //
DELIMITER ;
