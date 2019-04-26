package nuli;

import java.util.Scanner;

public class StudentManager {
	private Student std[];//학생들의 정보를 담을 배열
	private int count;    //현재 저장된 학생수
	private final int MIN_STUDENT_COUNT = 300;//final를 통해 배열의 최솟값을 300으로 저장한다
	
	public StudentManager(){//Student 매니져의 생성자(생성자란 무엇일까요? 생성자는 객체를 초기화해주는 메소드입니다. 
		//생성자를 사용하면 객체가 생성될 때 실행되어야 할 행동들을 정의해놓을 수 있습니다. 또한 객체가 생성될 때 입력받을 변수도 정해놓을 수 있습니다. 
		//생성자는 사용될 객체의 기능을 정의해 놓은것이다.
		
		std = new Student[MIN_STUDENT_COUNT];//std라는 학생정보 배열이 min 300짜리 라는 배열이다
	}
	public StudentManager(int studentCnt){//생성자 조건문을 통해 기능을 추가 
		if(studentCnt>=MIN_STUDENT_COUNT)
			std = new Student[studentCnt];
		else
			std = new Student[MIN_STUDENT_COUNT];//값이 작으면 참이고 값이 크면 배열은 자동으로 공간이 커지고 새로운 주소가 생김 
	}
	//기능 : 학생정보를 배열에 추가
	//매개변수 : 학생정보=>Student s(1번째 방법)
	// => String name, int grade,,,(2번째 방법)
	//리턴타입 : void 
	//메소드명 : insert
	
	public void insert (Student s){//insert는 기능을 추가 끼어넣기 삽입
		//std[??] : Student 클래스의 객체는 초기에 선언만 되어 잇음
		//insert 기능에서 객체 정보를 추가하려면 객체를 생성한 후
		//매개변수의 값을 복사해야함.
		//x : 문법적으로 틀린 부분은 없으나 하나의 객체를 매개변수 s와
		//std[count]가 같이 사용하기 때문에 매개변수 s가 바뀌면
		//std[count]도 같이 바뀔수 있다.
		//std[count++] = s;
		//학년,반,번호로 검색해서 해당 학생 정보가 없으면(조건식) 학생정보 추가(실행문)
		//있으면 아무것도 안함
		
		
		if(search(s.getGrade(),s.getClassNum(),s.getNum())//조건문 매개변수 s에 입력된 정보를 찾아서 못찾으면 
				== -1){//중복되는게 없으면 -1
			std[count++] = new Student(s);
		}
		
		//count++;=[count] 
		//+ ++;(증감연산자 추가 밑에다)
		
	}
	//기능 : 학생정보 전체 출력
	//매개변수 : 없다
	//리턴타입:  없다//=>void왜냐하면 알려줄필요가 없다 내부에서알고있기때문에
	//메소드명 : print
	public void print(){
		for(int i=0; i<count;i++){//cont는 배열이기 때문에 배열은 0번지 부터이기 대문에 100ㅇ이면 100-99까지 갯수만 100 그래서 i가 같지않고 전단계 까지 증감하고 입력한다. 
			System.out.println(std[i]);//증감된i를 계속 출력 즉=> 배열에 저장된 정보를 모두 출력함
		}
	}
	//기능 : 학생정보 검색 =>(학생정보를 수정 또는 삭제하기 위해서는 학생의 정보가 있는지를 알아야 하기 때문
	//학생정보 검색해서 없으면 -1을 해주고 있으면 배열에 위치한 번지를 알려주는 기능
	//매개변수 : 학년, 반, 번호 => int grade, int classNum, int num
	//리턴타입 : -1 또는 번지 =>int
	//메소드명 : search
	
	private int search(int grade, int classNum, int num){
		for(int i=0; i<count;i++){
			if(std[i].getGrade() == grade && 
				std[i].getClassNum() == classNum &&
				std[i].getNum() == num){
				return i;//찾는정보가 3개다 맞아야 학생이 있는것 그래서 &&논리연산자를 써도 3개다 참이면 i값을 알려준다
				}
		}
		return -1;// 배열은 0번지 부터 시작하기 때문에 0<=배열 이렇기 때문에 없으면 -1 즉 주소를 못찾았다 없다는 뜻이다. 그래서 return -1;를 입력하는것이다.
	}
	
	//학생정보 수정
	// 기능 : 학생정보를 배열에서 수정
	//매개변수 : 학생정보 = > Student s
	//리턴타입 : 없다
	//메소드명 : modify=>수정
	public void modify(Student s){
		//검색했을 때 해당 정보가 있는 번지
		int searchIndex 
		= search(s.getGrade(),s.getClassNum(),s.getNum());
		//if(searchIndex != -1)
		if(searchIndex >= 0){//찾았으면 배열은 0부터 시작하기 때문에
			std[searchIndex] = new Student(s);//오른쪽의 new Student(s)의 값을 왼쪽 std배열에 저장
			
		}
		
	}
	//학생정보 삭제
	//매개변수 : 학생정보 => Student s
	//리턴타입 : 없다 => void
	//메소드명 : delete=>삭제 기능
	public void delete(Student s){
		int searchIndex//찾기 기능
		= search(s.getGrade(),s.getClassNum(),s.getNum());
		if(searchIndex != -1){//찾았으면 
			std[searchIndex] = new Student(s);//오른쪽 참조변수 주소에 있는 값을 왼쪽에 저장
			//배열을 밀기                0,1,2,3,4,5,6,7,8,9
			for(int i=searchIndex;i<count-1; i++){
				std[i] = std[i+1]; //i에 i+1한 다음번지 값을 저장해라 그래서 원래 주소지는 i+1한주소로 바뀐다.
			}
			std[count -1] = null;//값이 존재 하지 않는다 null
			count--;//count배열의 칸을 한칸 줄여라 
			
			//현재 저장된 갯수를 하나 감소
			
			
		}
	
	}
	public static void printMenu(){//출력메뉴
		System.out.println("-------------");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.println("메뉴를 선택하세요: ");
	
	}
	
	public Student inputSearchStudent(Scanner scan){//값을 Scanner에저장하여 출력
		Student s = new Student();// 오른쪽 주소의 값을 왼쪽에저장
		System.out.println("학년 : ");//학년을 출력
		s.setGrade(scan.nextInt());//문자열로 돌려주는 기능		
		System.out.println("반 : ");//반을 출력하는기능
		s.setClassNum(scan.nextInt());
		System.out.println("번호 : ");//번호를 출력
		s.setNum(scan.nextInt()); 
		return s;
	}
	
	
	
	public Student inputStudent(Scanner scan){
		Student s = inputSearchStudent(scan);
		System.out.println("이름 : ");
		s.setName(scan.next());//문자열로 돌려주는 기능
		System.out.println("국어 : ");
		s.setKor(scan.nextInt());
		System.out.println("영어 : ");
		s.setEng(scan.nextInt());
		System.out.println("수학 : ");
		s.setMath(scan.nextInt());
		return s;
	}
	
	
		
		
	
	
}
