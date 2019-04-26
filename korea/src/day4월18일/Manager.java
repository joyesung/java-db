package day4월18일;

import java.util.Scanner;

import nuli.Student;

public class Manager {
	
	//학생정보 추가
	//학생정보 입력
	//학생정보 수정
	//학생정보 삭제
	private UnibersityStudent std[];//대학생 배열을 생성
	private int count;//배열의 크기 초기화
	private final int MIN_UNIBERSITYSTUDENT_COUNT = 10;//배열의 크기가 최소 10칸짜리 배열
	

public Manager(){ //매니져 생성자
	
	std = new UnibersityStudent[MIN_UNIBERSITYSTUDENT_COUNT];//std에 오른쪽의 참조변수 배열을 저장
}

public Manager(int UnibersityStudentCnt){
	if(UnibersityStudentCnt>=MIN_UNIBERSITYSTUDENT_COUNT) // 배열의 크기가 최소 10개짜리보다 크거나 같으면 실행
		std = new UnibersityStudent[UnibersityStudentCnt];
	else
		std = new UnibersityStudent[MIN_UNIBERSITYSTUDENT_COUNT];//배열의 크기가 작으면 밑에거로 실행
	
	}


		
	
public void print(){//출력기능 
	for(int i=0; i<count;i++){// i 가 카운트보다 작으면 증감 10보다 작은 9까지 증감한 값을 i에 저장
		System.out.println(std[i]);
		}
	}
private int search(int grade, int major, int gender){//private이라는 값에 전공, 학년, 성별을 검색)
	for(int i=0; i<count;i++){//i가 배열의 수 10이전 9까지 증감하면서 검색한다
		if(std[i].setGrade == grade && // i번지에서 원하는 학년 전공 성별을 찾았을 때 i값을 돌려주고 끝난다
			std[i].setMajor == count &&
			std[i].setGender == count){
			return i;
			}
	}
	return -1;//못찾아서 실행이 안된다
	}

public void modify(UnibersityStudent s){//modify는 수정하는 기능
	//검색했을 때 해당 정보가 있는 번지
	int searchIndex //배열에 저장된 값을 검색한다
	= search(s.setGender,s.setGrade,s.setMajor);
	//if(searchIndex != -1)
	if(searchIndex >= 0){//찾았으면 배열은 0부터 시작하기 때문에// 배열은 0부터 라서 0부터 찾아라
		std[searchIndex] = new UnibersityStudent(s);//배열을 찾으면 std에 new대학생 s 를 저장
		
	}
	
}

public void delete(UnibersityStudent s){//삭제하는 기능
	int searchIndex // 찾는다
	= search(s.setGender,s.setGrade,s.setMajor);//학년, 전공,성별을 찾는다
	if(searchIndex != -1){//찾았으면 
		std[searchIndex] = new UnibersityStudent(s);
		//배열을 밀기 //찾으면 배열의 값이 뒤로 밀리면서 저장을 한다
		for(int i=searchIndex;i<count-1; i++){
			std[i] = std[i+1]; //i에 i+1한 다음번지 값을 저장해라 그래서 원래 주소지는 i+1한주소로 바뀐다.
		} //뒤로 밀리면서 i+1번지 뒷 주소로 한탄씩 바뀐곳에 저장을 한다.
		std[count -1] = null; //못찾으면 -1 없다
		count--;//count배열의 칸을 한칸 줄여라 
		
		}		
	}
public static void printMenu(){//출력하는 메뉴
	System.out.println("-------------");//보기 좋게 칸을 나누는 것
	System.out.println("1. 학생정보추가");// 학생정보 추가 출력
	System.out.println("2. 학생정보수정");// 학생정보 수정 출력
	System.out.println("3. 학생정보삭제");//학생정보 삭제 출
	System.out.println("4. 학생정보출력");//학생정보 출력을 출력
	System.out.println("5. 종료");//종료 출력
	System.out.println("메뉴를 선택하세요: ");//메뉴선택을 출력

}

public Student inputSearchStudent(Scanner scan){ //스캐너를 이용해서 출력
	Student s = new Student();// new Student의 값을 s에 저장
	System.out.println("학년 : ");//Scanner를 이용해서 학년정보를 입력을 받아 출력을 받음
	s.setGrade(scan.nextInt());//문자열로 돌려주는 기능
	System.out.println("성별 : "); // 성별을 입력받아 출력받음
	System.out.println("전공 : ");//전공을 입력받아 출력 받음
	return s;//리턴값 s를 돌려줌=> s의 값을 알려줌
	}




	
	}
