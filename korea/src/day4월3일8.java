
public class day4월3일8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 구구단을 매소드를 이용하여 출력하도록 작성하세요.
		
		int num, i;
		for(num=2; num<=9; num++){
			for( i=1; i<=9; i++){
				System.out.println(num + "x" + i + "=" + num*i);
				
			}
			
		}
		printMul(2,6);
	
		
		//기능 : 두 정수가 주어지면 두 정수의 곱을 출력하고 그 결과를 알려주는 메소드
		//매개변수 : 두 정수 => int num1, int num2
		//리턴타입 : 곱한 결과 => int
		//메소드명 : printMu1
	}
	public static void printMul(int num1, int num2){
		System.out.println(num1 + "x" + num2 + "=" + num1*num2);
		
	 }
	
  

	
	
	
	public static void contian(){
		int num, i;
		for(num=2; num<=9; num++){
			for( i=1; i<=9; i++){
				System.out.println(num + "x" + i + "=" + num*i);
				
		
			}
		}
			
	
	}
	
}
