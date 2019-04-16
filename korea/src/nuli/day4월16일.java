package nuli;

import java.util.ArrayList;
import java.util.Scanner;

public class day4월16일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =  new ArrayList<Integer>();//인티저클래스의 객체를 사용한다 즉 숫자만 들어갈 수 있다.
		list.add(10);
		list.add(5);
		list.add(1);
	/*	for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
			
		}*/
		ArrayList<Point> PList = new ArrayList<Point>();
		Point pt = new Point ();
		char mode = 'y';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("이동할 좌표를 입력하세요(예: 1 2) : ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			pt.move(x, y);
			System.out.println("이동할 현재 좌표 : " + pt);
			PList.add(new Point(pt));
			System.out.println("더 하시겠습니가??(y or n)");
			mode = scan.next().charAt(0);
		}while(mode!= 'n');
	
		
		for(int i=0; i<PList.size();i++){
			System.out.println(PList.get(i));
			
		}
	}

}
class Point{
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
	public Point(){}
	public Point(int x, int y){
		this.x = x; this.y=y;
	}
	public Point(Point p){
		this(p.x,p.y);
	}
	public void move(int x, int y){
		this.x= x; this.y=y;
	}
	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
	//객체가 어느 그룹에 속해 있는지 알려주는 메소드로
	//Point클래스에서는 x,y의 값이 같다면 다른 객체이더라도
	//같은 그룹에 속하기 때문에 검색을 빠르게 할 수 있다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	//두 객체가 같은 객체로 판별할것인지를 결정하는 메소드
	@Override
	public boolean equals(Object obj) {
		// 주소가 같은 경우이면 당연히 본인이기 때문에 같은 객체
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		//Point 클래스에서 같은 객체는 x와 y가 같은 경우이다로 설정함
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}









