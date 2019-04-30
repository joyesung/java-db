/*website 데이터베이스에서 frog0039 회원이 양고기왕 카페에 등록한 글의 갯수를 쿼리문으로 작성해라*/
update member
set
member.member_board_count = (select 
		count(*) 
        from 
        board
        where 
     board_writer = '멧돼지왕' and board_cafe_name = '양고기왕')
where member_num >=1 and
  member_user_id = 'wildbow' and member_cafe_name = '양고기왕';

 
select 
* 
from member;