package korea;

public class SDASD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//멤버 메소드는 원하는 시점에서 호출이 가능하지만
		//생성자는 객체를 생성할 때에만 호출한다.
		//객체 멤버 변수를 초기화
	    //생성자가 없을 때 기본생성자가 컴파일러에 의해 자동으로 추가된다. 
		//기본 생성자 없이 다른 생성자를 만들고 기본생성자를 호출하면 에러가 난다.
		
			
		Tv t1 = new Tv();
		t1.printChannel();
		t1.printVolunm();
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		Tv t2 = new Tv();
		t1.printChannel();
		t1.printVolunm();
		
	} 
	 
}
