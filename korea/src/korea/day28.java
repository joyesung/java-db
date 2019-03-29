package korea;

import java.util.Scanner;

public class day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("수를 입력하세요");
		Scanner san = new Scanner(System.in);
		 int num1=8, num2=12;
	     int i, gcd=1;//gcd는 최대공약수 약어
	   for(i=1; i<=num1; i++){
		   if(num1 % i == 0 && num2 % i ==0){
		     gcd = i;
		   }
	   }
		 System.out.println(num1+"과"+num2+"의최대공약수:" + gcd);
	}

}
