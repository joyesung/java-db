/*게시판에 게시글을 추가하는  */

insert into 
board(board_title, 
board_contents, 
board_category_code, 
board_cafe_name, 
board_writer)
	values('멧돼지 돼지',
    '삼겹살 맛잇다',
    '1',
	'돼지왕',
    '사람');
    select * from board