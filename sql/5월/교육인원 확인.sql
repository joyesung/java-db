use museum;
drop trigger if exists input_re;
delimiter //
create trigger input_re after insert on re
for each row
begin
declare _total int default 0;

if new.re_ed_num >= 1 then
set _total = (select ed_per from ed where new.re_ed_num = ed_num);
set _total = _total - new.re_people;
update
	ed
set
	ed_per = _total
where
	ed_num = new.re_ed_num;
end if;
end //
delimiter ;


