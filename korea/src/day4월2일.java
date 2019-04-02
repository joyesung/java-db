
public class day4월2일 {

	public static void main(String[] args) {
		//sum()메소드가 printSum()메소드보다 재사용성이 높다.
		System.out.println(sum(1,2));
		printSum(1,2);
	}

			public static void printSum(int num1, int num2){
    	System.out.println(num1+num2);
	}

	/*매서드method
	: 하나의 특정 작업을 수행하는 일련의 문장들을 하나로 묶은것 (좋은 매서드 method)
	매서드 : 자판기
	입력   : 매뉴,돈  => 입력과 출력을 정해야한다.
	출력   : 음료수  	
	기능 : 두 정수의  합을 알려주는 메서드
	입력 : 이 기능을 실행할 때 필요한 정보, 두 정수 => int num1,int num2(자료형과 변수명까지 같이 쓴다.)
	출력 : 이 기능을 실행하고 나서 알려주는 정보 => int (자료형만쓴다)
	이름 : sum 

	메소드 선언 방법
	출력 이름(입력){
	             구현;
	}
	리턴타입 메소드명(매개변수또는 인수){
	             구현;
	}
	*/public static int sum(int num1, int num2){
	             int res= num1 + num2;
	             return res;
	}
	
	
	
	/*
	public static int sum(int num1, int num2){
            int res = num1 + num2;
            return res;*/
      
     //기능 : 두 수의 합을 콘솔에 출력하는 기능
     //입력 : 두 정수 => int num1, int num2
     //출력 : 없다 => void(없다라는 의미의 키워드)
     //이름 : printSum 
     // 
    
     

    
    //메소드의 구현위치는 클래스 안에 구현을 한다.
    //다른 메소드 안에서 구현할 수 없다.
    //메소드는 다른메소드안에서 호출되어야한다.
    //메소드를 테스트하기 위해서는 main 메소드에서 호출해야한다.
    //
		      
	        public static int gcd(int num1, int num2){
	        	int gcdNum = 1;
	        	for(int i=1; i<=num1; i++){
	            	if(num1 % i == 0 && num2 % i == 0){
	            		gcdNum = i;
	        
	            	}
	        	}
			
			return gcdNum;
			
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
    
}
