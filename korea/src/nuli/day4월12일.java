package nuli;

public class day4월12일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		try{
		num = 1/0;
		}catch(ArithmeticException e){
		  System.out.println("계산 관련 예외가 발생했습니다.");
		  e.printStackTrace();
		}catch(Exception e){
		  e.printStackTrace(); //Exception은 else처럼 마지막에 써준다.
		}
		System.out.println();
	}
	public static double calc(double num1, double num2, char op) throws Exception{
		double res = 0.0;
		if((op == '/'|| op == '%') && num2 == 0.0) 
			//throw가 있으면 밑의 실행문을 실행안하고 예외처리를한다.
			throw new ArithmeticException("0으로 나눌 수 없습니다."); 
		switch(op){
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		default : 
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	
	}

}
