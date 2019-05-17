drop procedure if exists getno;
delimiter //
/* 현재 날짜를 기준으로 yyyymmdd의 형태의 번호를 생성하는 프로시져 */
create procedure getno(
	out no varchar(30) /*리턴값이 필요없다 => 왜냐하면 no에 저장된 값을 프로시져가 끝난 후 에 자동으로 알려준다.*/
)
begin
	
/*in 또는 out에서 선언한 변수는 declare를 통해 다시 선언하면 안된다.*/
	declare year varchar(4);
    declare month varchar(2);
    declare day varchar(2); 
    /* year() 는 매개변수로 날짜를 넘겨주면 해당 날짜의 년도를 정수로 추출해서 넘겨준다. */
   set year = year(now());
   set month = month(now());
   set day = day(now());
    
    /* 월이 한자리이면 월 앞에 0을 붙이는 작업 */
    
    if month < 10 then
		set month = concat('0',month); /*concat == concatenation의 약자 뜻은 연속*/
        
        end if;
        if day < 10 then
        set day = concat('0',day);
        end if;
        set no =concat(year, month, day);
end //
delimiter ;