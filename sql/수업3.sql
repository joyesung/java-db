update course
set
course.course_total
= course_mid*0.4+course_end*0.4+course_attendance*0.1+course_report*0.1/*total를 구하는 공식*/
where course_num >=1;/*모든 학생들을 업데이트를 하기위해서*/
select * from course;

