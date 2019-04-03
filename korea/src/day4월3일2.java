import java.util.Scanner;

public class day4월3일2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 구구단 전체를 출력하는 코드를 작성하세요.
		3. 50이하의 소수를 출력하는 코드를 작성핫세요.
		4. 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드를 작성하세요.*/
		
		
		
		
		/*4. 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드를 작성하세요.*/
		
	/*	Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();		
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int [] i ;
		i = new int [3];
		i [0] = num1; 
		i [1] = num2;
		i [2] = num3;
		
		System.out.println(i [0]);
		System.out.println(i [1] );
		System.out.println(i [2] );
		*/
		
		
		
	Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();		
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int[]arr = new int[3];
		
		arr= new int [3];
		arr [0] = num1; 
		arr [1] = num2;
		arr [2] = num3;
		for(int tmp : arr)
			System.out.print(tmp + " ");
		System.out.println();
		
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		for(int tmp : arr)
			System.out.print(tmp + " ");
		System.out.println();
	
		
		for(int i = 0; i<arr.length; i++)
			arr[i] = scan.nextInt();
		for(int tmp : arr)
			System.out.println(tmp+ " ");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
