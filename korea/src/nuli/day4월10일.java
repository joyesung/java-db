package nuli;



public class day4월10일 {
	
	public static int MAX_STUDENT_COUNT=300;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생 관리 프로그램을 만든가면??
		StudentManager stdMng
		= new StudentManager(MAX_STUDENT_COUNT);
		stdMng.insert(new Student("곽소함", 1,1,1,100,90,80));//이름이 없는 객체라서 익명개체라 한다
		stdMng.insert(new Student("조예성", 1,1,1,100,100,100));
		stdMng.print();
		stdMng.modify(new Student("곽효함",1,1,1,100,100,100));
		System.out.println("---------------------------");
		stdMng.print();
		stdMng.delete(new Student("",1,1,1,0,0,0));
		System.out.println("---------------");
		stdMng.print();
	}
	public static void prinMenu(){
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.println("메뉴를 선택하세요: ");
		
	}
}

