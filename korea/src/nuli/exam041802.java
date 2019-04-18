package nuli;

import java.util.Scanner;

public class exam041802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1= scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0);
		double res = calc(num1, num2,op);
		System.out.println(""+ num1+op+num2+"="+ res);
		
	}
	public static  double calc(int num1, int num2, char op){
		double res = 0.0;
		
		switch(op){
		case '+': res = num1+num2; break;
		case '-': res = num1-num2; break;
		case '*': res = num1*num2; break;
		case '/': res = num1/(double)num2; break;
		case '%': res = num1%num2; break;
		default:
			break;
		}
		
		return res;
		
	}
	
		
}

	

