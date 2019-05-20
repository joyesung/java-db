package exam;

public class Point3D  extends Point {
	
	private int z;
	
	public Point3D(){}//여기서 void쓰면 메소드로 인식하기때문에 void를 쓰지 않는다.
	
	public Point3D(int x, int y, int z){move(x,y,z);}

	public Point3D(Point3D p){move(p.getX(),p.getY(),p.z);}
	//x,y는 부모의 멤버 변수를 상속받았고, 접근제한자가 private이기 때문에
	//직접 접근할 수 없다. 따라서 getter를 이용하여 접근한다.
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}


	//메소드 오버라이딩 
	public void print(){//선언부가 이름같고 매개변수가 같으면 라이딩 틀리면 로딩
		System.out.println("("+getX()+","+getY()+","+z+")");
	}
	//메소드 오버로딩
	public void move(int x, int y, int z){
		move(x,y);//point 클래스에 잇는 move메소드 호출
		this.z =z;
		/*setX(x);
		setY(y);
		setZ(z);*/
	}
	
	
	
}
