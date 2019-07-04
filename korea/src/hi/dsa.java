package hi;

public class dsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Points p = new Points();
		p.print();
		p.move(3, 4);
		p.print();
		Points p2 = new Points(p);
		p2.print();
	}

}
//public�� Ŭ�����̸��� ���ϸ��� ������ ��밡���ϴ�.
/*��� ���� : x,y
 * ��� �Լ�
 * ������
 * getter�� setter
 * ��ǥ�̵�
 * ��ǥ���
 * */
/*��� ���� �ʱ�ȭ ����
 * �� �ڷ����� ���� �⺻��:x�� �ڷ��� int�� �⺻����0=>����� �ʱ�ȭ:x=0
 * => �ʱ�ȭ ���{x=0}=>������
 * 
 * */
class Points{
	private int x=0, y;
	{
		x=0;
	}
	public Points(){}//����Ÿ���� ���� Ŭ������� ���ƾ��Ѵ�. => ������ Ư¡
	public Points(int x, int y){
		move(x,y);
	}
	public Points(Points p){
		move(p.x,p.y);
	}
	int getX(){return x;}
	int getY(){return y;}
	void setX(int x){this.x = x;}
	void setY(int y){this.y = y;}
	void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	void print(){
		System.out.println("("+x+","+y+")");
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
}








