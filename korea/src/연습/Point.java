package 연습;

public class Point {
	//1. 필요한 멤버변수
	//x좌표의 점, y좌표의 점
	private int x;
	private int y;
	
	//2. 생성자
	//멤버변수 초기화=> 기본생성자, 복사 생성자
	public Point(){
			move(0,0);
	}
	public Point(int x, int y){
			move(x,y);
	}
	public Point(Point p){
			move(p.x,p.y);
	}
	//3. 필요한 멤버메소드
		//getter, setter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	//x,y의 값이 주어졌을 때 멤버변수의 값 변경
	public void move(int x, int y){
		setX(x);//this.x = x;
		setY(y);//this.y = y;
	}
	//현재 좌표 출력
	public void print(){
		//(1,2)
		System.out.println("("+x+","+y+")");
	}
	//다른 점과의 거리 계산
	public double distance(Point p){
			return distance(p.x,p.y);
	}
	public double distance(int x, int y){
		int dx = x - this.x;
		int dy = y - this.y;
		
		return Math.sqrt(Math.pow(dx, 2.0)) + Math.pow(dy, 2.0);//공식 sqrt는 루트 pow는 제곱
	}
	public void moveUp() {y--;}
	public void moveDown(){y++;}
	public void moveLeft(){x--;}
	public void moveRight(){x++;}
}
