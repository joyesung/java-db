/*장길산 학생이 수강한 전공 필수 과목들을 출력하는 쿼리문을 작성해라*/
select 
course_student_num,
student.student_name,
subject.subject_title,
class.class_year,
class.class_semester,
subject_type
from course
	join student
    on student.student_num = course.course_student_num
    join class
    on course.course_class_num = class.class_num
    join subject
    on subject.subject_code = class.class_subject_code
    where student.student_name = '장길산' 
    and  subject_type = '전필'
  