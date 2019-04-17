package nuli;

import java.util.Scanner;

public class exam0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 정수와 연자를 입력받아 출력하는 예제
/*		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0);

		
		double res = 0.0;
		
		switch (op) {
		case  '+': res = num1 + num2 ;
		break;
		case  '-': res = num1 - num2;
		break;
		case  '*': res = num1 * num2;
		break;
		case  '/': res = num1 / (double)num2;
		break;
		case  '%': res =  num1 % num2;
		break;

		default:
			break;
		
		}
		System.out.println("op" + res);
		System.out.println(""+num1+op+num2+"="+res);
	*/	
			
		/*Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		System.out.println(str);
		*/
		int num1 = 1;
		int num2 =10;
		int sum=0;
		for(int i=1; i<=num2; i++){
			sum += i;
			//sum = sum + i;
		
			
		}
		System.out.println(sum);
			
	
		
	}
	
}


