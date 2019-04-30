SELECT
course.course_num,
subject_title, 
course.course_student_num,
student.student_name,
course.course_total

FROM 
university.course
join /*select* from과 student부터 시작하는 공식이 같다 하지만 불필요한정보들까지 딸려온다*/
student on student.student_num = course.course_student_num
join
class on course.course_class_num = class.class_num
join
subject on subject.subject_code = class.class_subject_code;