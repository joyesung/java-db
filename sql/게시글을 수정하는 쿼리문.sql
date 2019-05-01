update board
set
board_title= '돼지왕',
board_contents='삼겹살 맛있다요'
/*board_category_code = 'board 
카페내에서 게시글 카테고리 변경이 가능한 경우'*/

where 
board_num =6;
select * from board;