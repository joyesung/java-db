
public class day4월2일3 {

	public static void main(String[] args) {
		int num =8 ;
		if(isPrime(num)){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
			
		}// TODO Auto-generated method stub
	}
	//함수는 새로운 메소드를 만들고 내용은 메인에 작성한다.
	/*	int num =7;
		int cnt = 0;
		for(int i=0; i<=num; i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt ==2){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
		 */ 
	// 기능 : 정수가 주어지면 해당 정수가 소수이면 참을 합성수이면 거짓을 알려주는 메소드
	// 매개변수 : 정수 =>  int num 
	// 리턴타입 : 참,거짓=> boolean
	// 메소드명 : isPrime(Prime소수)
		public static boolean isPrime(int num) {
			int cnt = 0;
			for(int i=1; i<=num;i++){
				if(num%i==0){
					cnt++;
				}
		    }
			if(cnt == 2){
				return true;
			}else{
				return false;
			}
			
		}
		
		
		
		/*public static int gcd(int num1, int num2){
	        	int gcdNum = 1;
	        	for(int i=1; i<=num1; i++){
	            	if(num1 % i == 0 && num2 % i == 0){
	            		gcdNum = i;
	        
	            	}
	        	}
			
			return gcdNum;/*/
   
   
	/*	
		int num1 =10; int num2 = 15;
		int gcdNum = 1;
		
		gcdNum = gcd(num1,num2);
		System.out.println(num1+"과"+num2+"의 최대공약수:"+gcdNum);
		System.out.println(num1+"과"+num2+"의 최소공배수:"
		                         +lcm(num1,num2));
		*/
		
	}


