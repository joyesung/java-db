import java.util.Scanner;

public class day4월4일5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiTables(1,9);
		Scanner scan= new Scanner(System.in);
		scan.next();
	}
	
public static void  printMultiTables(int start, int end){
	for(int i=start; i<=end; i++){
		printMultiTable(i);
	}
		
 }

public static void  printMultiTable(int num){
	for(int i=1; i<=9; i++){
		System.out.println(num + "*" + i + "=" +num*i);
	}
	
 }
	//기능 : 구구단 전체(2단~9단)이 출력되는 기능
public static void  printMultiTables(){
	printMultiTables(2,9);
			
		
	
	}
	
	
	
	
	

}
