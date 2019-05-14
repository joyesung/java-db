select
app_num,
app_user_id,
app_contents,
app_day,
user_phone,
user_name,
user_email

from app
join user
on app_user_id = user_id
where app_user_id = 'frog0039' and app_num='1'