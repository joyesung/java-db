

public class day4월2일5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calc(1,2,'+'));
		double res = calc(1,2,'/');
		System.out.println(res);
	}
	
	
		
		/*기능 : 두 정수와 산술연산자가 주어졌을 때 연산 결과를 알려주는 메소드를 만드세요.
		매개변수: 두정수와 산술연산자=int num1,int num2,char op
		리턴타입: 계산결과=> double 
		메소드명: calc
		public static double calc(int num1,int num2,char op){
		               return 0.0;
		}
		*/
		
		
		
		
		
	

	public static double calc(int num1, int num2, char op){
		   double res = 0.0;
		   switch (op) {
            case '+':	res = num1+num2;		break;
			case '-':   res = num1-num2;        break;
			case '*':   res = num1*num2;        break;
			case '/':   res = num1/(double)num2;break;
			case '%':   res = num1%num2;        break;
					
			}
		   
			return res;//result
	  }
	
}
