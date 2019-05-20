package exam;

public class Point {

	public Point(){
		move(0,0);
	}
	public Point(int x, int y){
		move(x,y);
	}
	public Point(Point p){
		move(p.x,p.y);
	}
	private int x;
	private int y;
	
	
	
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
	
	public void move(int x, int y){
		setX(x);
		setY(y);
		//this.x = x;
		//this.y = y;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	
}


	
