package hi;

public class wqe {

	public static void main(String[] args) {
		// �������� : �޼ҵ� �ȿ� ����Ǿ� �ش� �޼ҵ忡���� �����ϴ�  
				// ������ ��ġ�� ���� ���� ������ �ٸ��� 
				// ���� ��ġ���� ����� �� ������ �ش� ��ġ�� ���Ե� {}�ȿ����� ��밡���ϴ�. 
				int num1;//num1�� ���� ��ġ���� main�޼ҵ� ������ ��� ���� 
				//i�� �ݺ��� ���۽� ���� ������ �Ǿ� �溹�� �ȿ��� ����ϸ� �ݺ����� ����Ǹ� ����� �� ����. 
				for(int i = 0; i<1; i++){ 
					//tmp�� �ݺ��� ���๮ ���۽� ���� ������ �Ǿ� ���๮ ���� �� ����� �� ����. 
					//tmp�� �ݺ����� ����ɶ����� ���� ������ �� ����. 
					//tmp�� ���๮�� ����ɶ����� �ٽ� �����Ѵ�. 
					int tmp; 
					//��������(��ü) : ������ �Ϲ� �ڷ������� ������ ������ �ƴ� Ŭ������ �̿��Ͽ� ������ ���� 
					//         �� ���� ���� ���Ѵ�. �Ϲ� ������ ���� ���������� ���������� �ּҸ� �����Ѵ�. 
					//���������� �Ű������� �ϸ� ������ �ٲ� �� �ִ�.test(Point p)ó�� �ٲ���� ������ 
					//test2(Point p)ó�� �ڵ� ������ ���� �ȹٲ���� �ִ�. 
					Points p = new Points(); 
					Points p1 = new Points();
					int num3 = 10; 
					test(num3); 
					System.out.println(num3); 
					System.out.println(p); 
					test(p); 
					System.out.println(p); 
					test2(p1); 
					System.out.println(p1); 
				} 
			} 
			public static void test(int num){ 
				++num; 
			} 
			public static void test(Points p){ 
				p.move(1, 1); 
			} 
			public static void test2(Points p){ 
				p = new Points(); 
				p.move(2, 2); 
				System.out.println(p);
				System.out.println();
			} 
		} 