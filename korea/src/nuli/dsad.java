package nuli;

public class dsad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect();
		r.width = 10;
		r.height = 5;
		r.centerx= 0;
		r.centery= 0;
		r.print();
		r.move(5, 5);
		r.print();
		r.resize(10, 10);
		r.print();
	}

}
class Rect{
public	int width;
public	int height;
public int centerx;
public int centery;


public void print(){
	System.out.println("중심점 : " + centerx + "," + centery);
	System.out.println("가로: " + width);
	System.out.println("세로: "+ height);
	System.out.println("넓이: " + width*height);
}
public void move(int x, int y){
	this.centerx =x;
	this.centery =y;
}

public void resize(int width, int height){
	
	this.width = width;
	this.height = height;
}
}
