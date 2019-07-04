package hi;

public class exam8 {

	public static void main(String[] args) {
		
		
	}

}
//인터페이스는 기능명세서다.
//추상메소드로 구성된 메소드가 인터페이스다.
//장점: 기능등을 일목요연하게 볼 수 있다.
//통일성을 갖출 수 있다.
interface Draw{
	public void resize(int width, int height);
	public void move(int x, int y);
	
}
class Rect implements Draw{

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
