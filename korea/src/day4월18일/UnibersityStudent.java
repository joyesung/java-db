package day4월18일;

import nuli.Gender;
import nuli.Grade;
import nuli.Major;

public class UnibersityStudent {
	class Student{
		private Gender gender;
		private Major major;
		private Grade grade;
		private String name;
		private String UniversityName;
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
		public String getUniversityName() {
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
		public void setUniversityName(String universityName) {
			UniversityName = universityName;
		}
		public void setAverage(double average) {
			this.average = average;
		}
		private double average;
	
}



	public void University(){
		
	}
		Gender gender = Gender.FEMALE;
		Grade grade = Grade.FOUR;
		Major major = Major.ARCHEOLOGY;
		 
		
	
	public void University(Gender gender, Grade grade, 
			Major major ){
		this.gender = gender;
		this.grade = grade;
		this.major = major;
		
	}
	
		
}