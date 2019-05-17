/*select * from course;*/
/*

a테이블의 외래기키가 b테이블과 연결된 상태
select *from a join b on a.외래기 = b.기본키;


*/
/*학번이2019135133인 학생이 수강한 목록돠 학생 이름과 총점과 강의번호를 출력하는 쿼리를 join이용하여 작성하세요.*/

/*select
course_class_num, 
course_total,
student_name
from
course
join
student
on course_student_num = student_num
where student_num = '2019135133';*/


/*학번이2019135133인 학생이 수강한 목록돠 학생 이름과 강의명 총점을 출력하는 쿼리를 join이용하여 작성하세요.*/


 
 select
 student_name,
 course_total,
 detail.professor_name,
 detail.subject_title
 from
 course
 join
 (select * from class 
 join subject on class.class_subject_code=subject.subject_code 
 join professor on class.class_professor_num = professor_num)
 as detail
 on course.course_class_num = detail.class_num  
 join student																			
 on student.student_num = course.course_student_num
 where course_student_num = '2019135135';
   


