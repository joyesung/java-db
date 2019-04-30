/*1.신입생들의 학생수를출력하는쿼리문을 작성해라*/

select 

	count(*)

from
	student
    /*student_num가 int형일때*/
	where  student_num >=2019000000; 
    
    /*student_num가 varchar일때*/
    /*where student_num like '2019%; %뒤에는 모든 문자열이 올 수 있다*/