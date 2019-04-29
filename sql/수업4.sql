SELECT 
advise.advise_num,
professor.professor_name,/* 속성명이 중복이 되면 앞에 테이블명.을 쓰고 중복이 안되면 속성명만 작성해도 된다*/
student.student_name
 FROM 
 university.advise
 join
 professor on advise.advise_professor_num= professor.professor_num
 join
 student on advise.advise_student_num=student.student_num;  
 