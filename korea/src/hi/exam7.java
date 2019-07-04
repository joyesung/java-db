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
	//x,y�� Points Ŭ�������� ��ӹ޾� �Ⱥ������� �����ϳ� x,y�� ���������ڰ� private�̾
	//���������� ������ �� ����. setter�� getter�� �̿��Ͽ� �����ؾ��Ѵ�.
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//�޼ҵ� �����ε�  
	public void move(int x, int y, int z){
		super.move(x, y);//super�� �θ� �ǹ� ��Ӹ� ���� ���
		this.z = z;
		
	}
	//�޼ҵ� �������̵�
	@Override
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")";
	}
	public Points3D(){}//{super();}�̰� �ڵ����� ȣ��, �� �⺻ �����ڰ� ���� ��쿡��
	
	public Points3D(int x, int y, int z){
		move(x,y,z);
	}
	public Points3D(Points3D p){
		move(p.getX(),p.getY(),p.z);
	}
}








