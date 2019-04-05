import java.util.Scanner;
// 다른 패키지에 있는 public 클래스를 사용하려면
//import 패키지. 클래스명;
//을 선언해야 해당 클래스를 사용할 수 있다.

public class day4월5일1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//(Scanner는 클래스 scan은 객체에 해당)
		Scanner scan = new Scanner(System.in);//멤버 메소드
		//nextint()는 Scanner클래스의 맴버 메소드
		int num = scan.nextInt();
		//next()는 Scanner클래스의 멤버 메소드
		//charAt()는 String 클래스의 멤버 메소드
		char ch = scan.next().charAt(0);//. 은 객체에서 사용한다 일반 자료형은 .을 사용하지 못한다.
		//같은 패키지에서 동일한 클래스명을 가지는 클래스를 선언할 수 없다.
		
	}

}
