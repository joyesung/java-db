package hi;

public class exam4 {
/*Ŭ���� ��� �޼ҵ�ȿ� �ִ� �޼ҵ���� �ٸ� Ŭ������
 * ��ü �޼ҵ��̰ų� ���� Ŭ������ Ŭ���� �޼ҵ带
 * ����� �� �ִ�. ���� Ŭ������ ��ü �޼ҵ嵵
 * ��ü�� �����ϸ� ����� �� �ִ�.
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ϴ� �Լ��� �����Ͽ� �׽�Ʈ�ϴ� �ڵ带 �ۼ��ϼ���.
	int num1 = 1; int num2 = 3;
	char op = '/';
	double res = 0.0;
	try{
		res = cal(num1,num2,op);
		System.out.println(""+num1+op+num2+"="+res
				);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}

	}
	public static double cal(int num1, int num2, char op) throws Exception{
		double res = 0.0;
		switch(op){
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': 
			if(num2==0)throw new ArithmeticException("0���� ���� �� �����ϴ�.");
			res = num1 / (double)num2; break;
		case '%':
			if(num2==0)throw new ArithmeticException("0���� ���� �� �����ϴ�.");
			res = num1 % num2; break;
			default:
				throw new Exception("�߸��� ������ �Դϴ�.");
		}
		return res;
	}
}
