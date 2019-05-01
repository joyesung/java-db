/*검색 결과 값이 0이면 비회원이므로 회원가입가능, 1이면 회원이므로 다른 아이디를 입력해야함*/
select count(*) fROM website.user
where user_id = 'frog0039';