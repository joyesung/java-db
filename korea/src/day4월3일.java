
public class day4월3일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=7,  num2 =12;
	    if(isComprime(num1,num2)){
		System.out.println("두 수는 서로소");
	}else{
		System.out.println("두 수는 서로소 아님");
	   }
	}
	
	
	
	
	
		public static int gcd(int num1, int num2){
	    	int gcdNum = 1;
	    	for(int i=1; i<=num1; i++){
	        	if(num1 % i == 0 && num2 % i == 0){
	        		gcdNum = i;
	    
	        	}
	    	}
		
		return gcdNum;
		
	
		}

		public static boolean isComprime(int num1, int num2){
			if(gcd(num1,num2) ==1)         return true;
			else                           return false;
			
		
		
		}
	
	
             // 기능 : 두 정수가 주어지면 서로소인지 아니지를 참 또는 거짓으로 알려주는 메소드
		     // 매개변수 : 두 정수 => int num1, int num2
		     // 라인타입 : 참 또는 거짓 => boolean
		     // 메소드명 : isCoprime
		
	
		
		
		
		
		
		
		
}
