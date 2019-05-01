/*업로드 파일을 추가*/
/*등업된 게시물의 첨부된파일 리스트를 출력하는쿼리문을 작성*/


/*SELECT  board.board_num, board.board_title, board.board_contents, upload.*
from upload
join board
on upload.upload_board_num = board.board_num
where board_num =  1;*/

/*select upload.upload_filename from upload
where upload_board_num = 1;*/
/*'맛없는커피'카페에 가입된 모든 회원들의 이메일을 출력하는 쿼리문을 작성하세요*/
 /*select member.member_cafe_name, member.member_user_id, user.user_email
 from member
 join user
 on member.member_user_id = user.user_id
 where member.member_cafe_name = '행복한커피';*/
 
 /*select user_email from member
 join user
 on user_id = member_user_id
 where member_cafe_name = '맛없는커피';*/
 
 /*게시글에 좋아요 기능을 추가하기 위한 테이블과 속성을 액셀로 정리하고 
 기존 테이블에 수정이 필요한 경우 속성을 추가하세요.*/

 