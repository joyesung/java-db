package day4월18일;



public class UnibersityStudent {
	class Student{//클래스 Student를 만듬
		private Gender gender; //private라는 접근제한자를 통해 Gender gender라는 변수를 생성
		private Major major;//private라는 접근제한자를 통해 major변수를 생성 
		private Grade grade;//private라는 접근제한자를 통해 grade라는 변수를 생성
	
		public Gender getGender() { //멤버변수 Gender를 만듬 //get를 데이터를 가져오는것 위의 변수가 private접근제한자라서 다른 클래스에서 사용하기 위해 서 작성
 			return gender;//리턴값 get에는 리턴값이 있다.(리턴값은 메소드를 호출했을 때 호출 후 해당 메소드의 실행 결과값이다
		}
		public Major getMajor() {//멤버변수 major를 생성
			return major;//리턴값 major
		}
		public Grade getGrade() {//멤버변수 grade를 생성
			return grade;//리턴값 grade를 생성
		}
		}
		public void setGender(Gender gender) {//set은 값을 입력하는 메소드 (기능) set앞에 public이잇어서 다른클래스에서도 사용이 가능하게 하기위함이다
			this.gender = gender;
		}
		public void setMajor(Major major) {//set을 통해 major값을 넣는 기능
			this.major = major;// 지역변수와 멤버 변수를 구분하기 위해서 this를 앞에 써준다
		}
		public void setGrade(Grade grade) {
			this.grade = grade;// 지역변수와 멤버 변수를 구분하기 위해서 this를 앞에 써준다
		}
		

//init는 initialize 의 약어로 많이 사용되며 일반적으로 초기화(또는 기본 설정)를 하는 것으로 쓰입니다.
	public UnibersityStudent(UnibersityStudent s) {
		init(s.gender,s.major,s.grade);//init를 사용하여 gender와 major,grade의 초기화를 해준다
	}
	


	private void init(Gender gender, Major major, Grade grade) {
		// TODO Auto-generated method stub
		 
	}



	public void UniversityStudent(){
		
	}
		Gender gender = Gender.FEMALE;// Gender는 FEMALE이라는 것이다
		Grade grade = Grade.FOUR;
		Major major = Major.ARCHEOLOGY;
		public int setGrade;
		public int setMajor;
		public int setGender;
		
	
	public void UnibersityStudent(Gender gender, Grade grade, 
			Major major ){
		this.gender = gender;
		this.grade = grade;
		this.major = major;
		
	}


//toString은 해당 클래스 타입의 변수명으로 출력을 할 때, 자동으로 호출하기 때문에, 변수명을 가지고 특정 문자열 데이터를 출력하고자 한다면, toString을 오버라이딩해서 사용할 수 있습니다.
	@Override
	public String toString() {
		return "UnibersityStudent [성별=" + gender + ", 학년=" + grade + ", 전공=" + major + "]";
	}
}