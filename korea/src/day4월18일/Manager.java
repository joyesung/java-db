package day4월18일;



public class Manager {
	
	//학생정보 추가
	//학생정보 입력
	//학생정보 수정
	//학생정보 삭제
	private UnibersityStudent std[];
	private int count;
	private final int MIN_UNIBERSITYSTUDENT_COUNT = 10;
	

public Manager(){
	
	std = new UnibersityStudent[MIN_UNIBERSITYSTUDENT_COUNT];
}

public Manager(int UnibersityStudentCnt){
	if(UnibersityStudentCnt>=MIN_UNIBERSITYSTUDENT_COUNT)
		std = new UnibersityStudent[UnibersityStudentCnt];
	else
		std = new UnibersityStudent[MIN_UNIBERSITYSTUDENT_COUNT];
	
	}


		
	}
	


