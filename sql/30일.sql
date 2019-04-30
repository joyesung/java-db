SELECT 
course.course_num,
classdetail.subject_title, 
course.course_student_num,
student.student_name,
course.course_total
FROM 							/* 참조테이블이 두번 검색해야 하는 경우*/
university.course
join
(select 
* 
from
 class 
 join subject 
 on class.class_subject_code=subject.subject_code) /*두테이블은 합친공식*/
 as classdetail 
 on course.course_class_num = classdetail.class_num  
 join student																			/*classdetail은 임시적인 테이블을 생성하고 합쳐진 테이블에서 정보를 가져오는 공식*/
 on student.student_num = course.course_student_num;
