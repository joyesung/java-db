
public class day4월4일1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calculate(1,2,'+'));
		System.out.println(calculate(1,2,'-'));
		System.out.println(calculate(1,2,'*'));
		System.out.println(calculate(1,2,'/'));
		System.out.println(calculate(1,2,'%'));
	}

	
	
	//기능 : 두 정수의 산술 연산 결과를 알려주는 메소드
	//매개변수:두 정수와 산술연산자 int num1, num2, char op
	//리터타입 :산술연산자결과 =>실수=>double
	//메소드명 :calculate
	
	
	public static double calculate(int num1, int num2, char op){
		double res = 0.0;
		switch(op){
		case '+': res = num1 + num2; break;
		// case '+' : return num1 + num2; 
		case '-': res = num1 - num2; break;
		// case '-' : return num1 - num2;
		case '*': res = num1 * num2; break;
		// case '*' : return num1 * num2;
		case '/': res = (double)num1 / num2; break;
		// case '/' : return num1 / num2;
		case '%': res = num1 % num2; break;
		// case '%' : return num1 % num2;
		//default: res = 0.0(생략된것 왜냐하면 위의 double res = 0.0으로 초기화해서 이의 초기값이 없으면 밑에쓴다 위에 잇으면 아래는 생략
		
		}
		
		return res;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
