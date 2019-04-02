
public class day4월2일1 {

	public static void main(String[] args){
		int num1 =10; int num2 = 15;
			int gcdNum = 1;
			
			gcdNum = gcd(num1,num2);
			System.out.println(num1+"과"+num2+"의 최대공약수:"+gcdNum);
			System.out.println(num1+"과"+num2+"의 최소공배수:"
			                         +lcm(num1,num2));

			
			
			
			
			
		// TODO Auto-generated method stub
	}
/*int num1 = 8, num2 = 12;
        int gcdNum = 1;
        int i = 1;
        for(i=1; i<=num1; i++){
        	if(num1 % i == 0&& num2 % i == 0){
        		gcdNum = i;
        	}
        }
        System.out.println(gcdNum);
		*/
        //기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드
        //리턴타입(출력): 최대공약수 => 정수=> int 
        //매개변수 (입력): 두 정수=> int num1, int num2
        //매소드명: gcd
	    
	//기능 : 두 수의 최소 공배수를 구하는 매소드 최소 공배수는 두수의 곱에 최대공약수로 나눈 값이다.
	    //매개변수 두 정수 => int num1, num2//매소드명: lcm
	//최소공부새수
	public static int gcd(int num1, int num2){
    	int gcdNum = 1;
    	for(int i=1; i<=num1; i++){
        	if(num1 % i == 0 && num2 % i == 0){
        		gcdNum = i;
    
        	}
    	}
	
	return gcdNum;
	
	}
	
	
        public static int lcm(int num1, int num2){
        	return num1*num2/gcd(num1,num2);//공식 최소 공배수는 두수의 곱을 최대공약수로 나눈값.
        
        
		
	
       
		
		
		
        }
        
}
