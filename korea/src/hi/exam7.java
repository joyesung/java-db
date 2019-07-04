package hi;

public class exam7 {

	public static void main(String[] args) {
		Points3D p = new Points3D();
		p.print();
		p.move(1, 1, 1);
		p.print();

	}

}

class Points3D extends Points{
	//x,y는 Points 클래스에서 상속받아 안보이지만 존재하나 x,y의 접근제한자가 private이어서
	//직접적으로 접근할 수 없다. setter와 getter를 이용하여 접근해야한다.
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//메소드 오버로딩  
	public void move(int x, int y, int z){
		super.move(x, y);//super는 부모를 의미 상속를 쓸때 사용
		this.z = z;
		
	}
	//메소드 오버라이딩
	@Override
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")";
	}
	public Points3D(){}//{super();}이게 자동으로 호출, 단 기본 생성자가 있을 경우에만
	
	public Points3D(int x, int y, int z){
		move(x,y,z);
	}
	public Points3D(Points3D p){
		move(p.getX(),p.getY(),p.z);
	}
}








