/*course 테이블의 정보가 삭제 됐을 때 처리하는 트리거를 작성하세요.*/
use green;
drop trigger if exists delete_course;
delimiter //
create trigger  delete_course  after delete on course
for each row 
begin
if old.giveup_state = 'n'   then
update
class
set
total = total-1
where old.class_no = no;
end if;
end //
delimiter ;
