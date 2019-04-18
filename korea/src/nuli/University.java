package nuli;

public class University {
 private Gender gender;
 private Major major;
 private Grade grade;
 private String name;
 private Integer id;
 private String UniversityName;
 private double average;
public Gender getGender() {
	return gender;
}
public Major getMajor() {
	return major;
}
public Grade getGrade() {
	return grade;
}
public String getName() {
	return name;
}
public Integer getId() {
	return id;
}
public String getUniversitName() {
	return UniversityName;
}
public double getAverage() {
	return average;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public void setMajor(Major major) {
	this.major = major;
}
public void setGrade(Grade grade) {
	this.grade = grade;
}
public void setName(String name) {
	this.name = name;
}
public void setId(Integer id) {
	this.id = id;
}
public void setUniversitName(String universityName) {
	UniversityName = universityName;
}
public void setAverage(double average) {
	this.average = average;
}
public University(){
	gender = Gender.MALE;
	grade = Grade.FOUR;
	major = Major.ARCHEOLOGY;
	
	
}
public University(Gender gender, Grade grade, 
		Major major, String name, Integer id){
	this.gender = gender;
	this.grade = grade;
	this.major = major;
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "대학생 [성별=" + gender + ", 전공=" + major + ", 학년=" + grade + ", 이름=" + name + ", 학번=" + id
			+ ", 대학교이름=" + UniversityName + ", 평점=" + average + "]";
}

}
