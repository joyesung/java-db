
SELECT 
class.class_num,
subject.subject_title,
professor.professor_name

FROM 
university.class

join
subject on class.class_code = subject.subject_code
join
professor on class.class_professor_num=professor.professor_num
where professor.professor_name='안중근';/*클래스 테이블에서 과목코드, 교수번호를 과목이름,교수이름으로 바꾸는 쿼리문*/