package korea;

public class 티비 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		tv.printChannel();
		Tv tv2 = new Tv();
		tv2.printChannel();
		Tv tv3 = tv;// 클래스 객체는 참조변수라서 주소를 저장했기때문에 tv와 같은 주소이다 
		System.out.println(Tv.BRAND);
	}

}
