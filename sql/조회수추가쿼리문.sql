/*게시판에 조회수를 추가하는 쿼리문 */
update board
set
board_views = board_views+1
where 
board_num =2;
select * from board;