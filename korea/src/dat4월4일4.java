
public class dat4월4일4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메소드 오버로딩의 조건
		//1. 매개변수의 갯수가 다르다
		//2. 매개변소의 갯수가 같지만 자료형이 다르다.
		//
		System.out.println(sum(1,1));
		System.out.println(sum(1.2,1.2));
		System.out.println(sum(1,2,3));
		
	
		}
	
	
	
	public static int sum(int num1, int num2){
		return num1+num2;
	}

	
	
	
	public static double sum(double num1, double num2){
		 return num1+num2;
	}  
	
	
	
	
	
	public static int sum(int num1, int num2, int num3){
		  return num1+num2+num3;
	}
	
	
	public static void  printMultiTables(int start, int end){
		if(start < 0 )return;
		for(int i=start; i<=end; i++){
			printMultiTable(i);
		
	
			
			public static void  printMultiTable(int num){
				
				for(int i=1; i<=9; i++){
					System.out.println(num + "*" + i + "=" +num*i);
				}
				
			}
	////기능: 두 정수의 합을 알려주는 기능
	//매개변수: int num1 ,int num2 int num3
	//리턴타입 : int
	//매소드명 : sum
	
	
	
	//기능: 두 정수의 합을 알려주는 기능
	//매개변수: int num1 ,int num2
	//리턴타입 : int
	//매소드명 : sum
	
	
	
	//기능: 두 실수의 합을 알려주는 기능
	//매개변수: double num1 ,double num2
	//리턴타입 : int
	//매소드명 : sum
    }