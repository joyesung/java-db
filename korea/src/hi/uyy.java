package hi;

public class uyy {
	//멤버 변수는 클래스가 가지고 있는 변수로 static 여부에 따라
	//일반멤버변수(객체멤버변수)와 클래스 멤버변수로 구분할 수 있다.
	//num1은 객체 멤버변수로 객체가 생성되어야 변수가 할당된다
	//=>객체가 생성되어야 변수를 사용할 수 있다.
	//num1은 객체 멤버 메소드에서만 사용이 가능하다.
	//num1은 객체 멤버 변수이기 때문에
	//다른 클래스에서 해당 클래스의 객체가 선언되며 유효한 범위 내에서 사용가능하다.
	//같은 클래스내에서는 static(클래스멤버메소드) 메소드를 제외한 모든 메소드에서 사용가능하다.
	int num1;
	//num2는 클래스 멤버 변수로 클래스를 통해 사용할 수 있다.
	static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//num1 = 10;//에러발생
		num2 = 10;
	}

}
