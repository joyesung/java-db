
insert into
member( member_cafe_name, member_user_id, member_grade, member_board_count, member_vist_count,member_last_vist)
values 
('행복한커피', 'peace', '1','1','200','2019-01-02' );

update cafe set
	cafe_total = (select  count(*) from member where member_cafe_name = '행복한커피')
    where cafe_name = '행복한커피';

SELECT * FROM website.member

