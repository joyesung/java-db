package 연습;

public class exam3 {

	public static void main(String[] args) {
		System.out.println(calculate(1,2,'+'));
		System.out.println(calculate(1,2,'-'));
		System.out.println(calculate(1,2,'*'));
		System.out.println(calculate(1,2,'/'));
		System.out.println(calculate(1,2,'%'));
	}


/* 기능 : 두 정수의 산술 연산 결과를 알려주는 메소드
 * 매개변수 : 두 정수와 산술연산자=>int num1, int num2, char op
 * 리턴타입 : 산술연산결과=>실수=>double
 * 메소드명 : calculate
 */
public static double calculate(int num1, int num2, char op ){
	double res;
	switch(op){
	case '+' : res = num1+num2;  break;
	case '-' : res = num1-num2;  break;
	case '*' : res = num1*num2;  break;
	case '/' : res = num1/(double)num2;  break;
	case '%' : res = num1%num2;  break;
	default:   res = 0.0;
	}
	return res;
	}
	
}