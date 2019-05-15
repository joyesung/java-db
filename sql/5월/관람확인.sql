/* 2.회원아이디를 매개로한 교육 및 관람 예약확인 */
use museum;
drop procedure if exists search_vist_list;
delimiter //
create procedure  search_vist_list(
in in_user_id varchar(45)

)
begin
select * from re where re_user_id = in_user_id and re_situation = '예약신청' and re_ed_num is null;
end//
delimiter ;