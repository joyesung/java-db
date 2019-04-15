package korea;

public class Shape {
	private double width;
	private double height;
	public static int count = 0;
	//클래스 멤버 변수 count의 값을 출력하는 클래스 멤버 메소드
	public static void printCount(){
		System.out.println("총 만들어진 도형: " + count);
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public static int getCount() {
		return count;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public static void setCount(int count) {
		Shape.count = count;
	}
}
