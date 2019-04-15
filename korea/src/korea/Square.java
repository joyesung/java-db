package korea;

import nuli.Point;

public class Square {
//일반 멤버 변수, 객체 멤버 변수
	private double width;
	private double height;
	private double Point;
	public static int count = 0;
	public static void printCount(){
		System.out.println("총 만들어진 도형: " + count);
	}
	//일반 맴버 메소드, 객체 맴버 메소드
	public double getWidth() {
		return width;
	}
	public double getPoint() {
		return Point;
	}
	public static int getCount() {
		return count;
	}
	public void setPoint(double point) {
		Point = point;
	}
	public static void setCount(int count) {
		Square.count = count;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
		public  void printheight(){
			System.out.println("현재 높이 : +height");
	}
		public  void printwidth(){
			System.out.println("현재 너비 : +width");
			
	}
}
