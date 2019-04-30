/*홍길동 학생의 2019년도 1학기 수강 과목들을 출력하는 쿼리문을 작성해보세요.*/
select course_student_num,
student.student_name,
subject.subject_title,
class.class_year,
class.class_semester 
from course
	join student
    on student.student_num = course.course_student_num
    join class
    on course.course_class_num = class.class_num
    join subject
    on subject.subject_code = class.class_subject_code
    where student.student_name = '장길산' 
    and class_year = 2017 
    and class_semester = 1;