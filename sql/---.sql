insert into 
	board(board_title, 
		board_contents, 
        board_category_code, 
        board_cafe_name, 
        board_writer)
	values('멧돼지 돼지', 		/* 게시판 제목*/
		'삼겹살 맛잇다', 	/* 게시판 내용 */
        '1', 				/* 게시판 유형으로 게시판마다 미리 지정된 값을 저장 */
        '돼지왕', 			/* 카페 이름 */
        '사람'); 				/* 로그인한 회원 닉네임*/
update member
	set member_board_count 
		= 
        /* member_board_count = member_board_count + 1 */
        (select count(*) from board 
        where board_writer ='사람' and board_cafe_name='돼지왕')
	where member_num>=1 and member_user_id='사람' and member_cafe_name='돼지왕';
    SELECT * FROM website.board;