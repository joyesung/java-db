drop trigger if exists update_course;
DELIMITER //
 CREATE  TRIGGER  update_course after update on course
FOR EACH ROW
BEGIN
/*update 트리거에서 old를 이용하는 예제*/
/*수강 신청했다가 수강 포기를 하는 경우 => giveuo_state가 n이었다가 y로 바뀌는 경우*/
	if old.giveup_state = 'n' and new.giveup_state = 'y' then
    update 
		class 
    set 
		total = total-1
	where
        no = new.class_no;
        end if;
	/*수강포기를 했다가 수강포기를 철회하는 경우 -> giveup_state가 y었다가 n으로 바뀌는 경우*/
    if old.giveup_state = 'y' and new.giveup_state = 'n' then
    update
		class
	set
        total = total+1
	where
    no = new.no;
    end if;
 END // 
 DELIMITER ;

