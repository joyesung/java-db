import java.util.Scanner;

public class day4월일2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiTable(2);
		printMultiTable1(2,9);
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
	}

	
	
	
	
	/*기능 : 단(구구단)을 출력하는 기능
	 * 매개변수 : 단=> 정수 => int num
	 * 리턴타입 : 없다 => void
	 * 매소드명:  printMultiTable
	
	**/
	
	public static void  printMultiTable(int num){
		
		for(int i=1; i<=9; i++){
			System.out.println(num + "*" + i + "=" +num*i);
		}
		
	}
	
	/*기능: 2단에서 9단을 출력하는 기능
	 *매개변수:시작 int star 끝 int end
	 *리턴타입: void
	 *매소드명:printMultiTable
		
			*/
	
	
	/*public static void  printMultiTable1(int start, int end){
		if(start < 0 )return;
		for(int i=start; i<=end; i++){
			printMultiTable(i);
		}
		
		
	}
		*/
	
	/*
	public static void printMultiTable1(int start, int end){
		for(int i=start; i<=end;i++){
			printMultiTable(i);
		}
		
		
	} */
	//메소드에서 리턴값이  있을때 유의사항
	// 조건문이나 본복문을 통해 리턴할 경우 리턴되지 않을 경우를 항상 생각해야한다.
	//반복문안에서리턴할 경우 조심해야한다.
	// 조건문을통해 리턴을 할 경우 조건문이 거짓인지 경우를 고려해야한다.
	// 반복문안에서 리턴을 할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 고려해야한다.
	/*public static static int tese1(){
		int r =0;
		for(int i=1; i<=9; i++){
			r+= i;
			return r;
		}
		// 반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 자바 컴파일러는  세세한 내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리턴도 설정해주어야한다.
	}
	*/
			
	
}
