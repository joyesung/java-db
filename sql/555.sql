/* website 데이터 베이스에서 카페 회우너수를 구하시오*/
update cafe
set
cafe.cafe_total = (select 
		count(*) 
        from 
        member 
        where 
        member_cafe_name = '돼지왕' )
where 
cafe_name = '돼지왕';


select 
* 
from cafe;
