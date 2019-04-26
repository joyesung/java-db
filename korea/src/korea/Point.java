package korea;



public class Point {
	private int x;   //x좌표
	private int y;   //y좌표
	
	public void move(Point p){
		
	}

	public Point(){
		move(0,0);
	}
	public 	Point(int x, int y){
		move(x,y);
	}

	public Point(Point p){
		move(p.x, p.y);
	}

public int getX() { // get,set은 private 멤버 변수에 값을 대입하고, 값을 얻어오는것을 말한다.
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
//x,y의 값이 주어졌을 때 멤버변수의 값 변경
public void move(int x, int y){
	setX(x); // this. x=x;랑 같은 코드
	setY(y); // this. y=y;랑 같은 코드 
}
//현재 좌표 출력
public void print(){
	//(1,2)를 기준으로 입력
	System.out.println("("+x+","+y+")");
}
// 다른 점과의 거리 계산
public double distance(Point p){
	return distance(p.x,p.y);
}

public double distance(int x, int y){
	int dx = x - this.x;
	int dy = y - this.y;
	return Math.sqrt(Math.pow(dx, 2.0) // 공식이다. 외우자
			+ Math.pow(dy, 2.0));
}


public void moveLeft(){ x--; }
public void moveRight(){ x++; }
}
