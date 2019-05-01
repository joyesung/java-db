/*기본키변경은안된다*/
update user
set
user_phone = '010-9912-5480',
user_add = '광역시'

where user_id = 'frog0039';


SELECT * FROM website.user;