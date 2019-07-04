package hi;

public class dsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Points p = new Points();
		p.print();
		p.move(3, 4);
		p.print();
		Points p2 = new Points(p);
		p2.print();
	}

}
//public은 클래스이름과 파일명이 같을때 사용가능하다.
/*멤버 변수 : x,y
 * 멤버 함수
 * 생성자
 * getter와 setter
 * 좌표이동
 * 좌표출력
 * */
/*멤버 변수 초기화 순서
 * 각 자료형에 대한 기본값:x의 자료형 int는 기본값이0=>명시적 초기화:x=0
 * => 초기화 블록{x=0}=>생성자
 * 
 * */
class Points{
	private int x=0, y;
	{
		x=0;
	}
	public Points(){}//리턴타입이 없다 클래스명과 같아야한다. => 생성자 특징
	public Points(int x, int y){
		move(x,y);
	}
	public Points(Points p){
		move(p.x,p.y);
	}
	int getX(){return x;}
	int getY(){return y;}
	void setX(int x){this.x = x;}
	void setY(int y){this.y = y;}
	void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	void print(){
		System.out.println("("+x+","+y+")");
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
}








