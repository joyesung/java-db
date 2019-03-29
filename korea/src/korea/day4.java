package korea;

import java.util.Scanner;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*//두 수의 공약수를 출력하는 코드를 작성하세요. gcd:공약수
				//8과 12의 공약수 : 1 2 4 
				int num1=8, num2=12; 
				int i, gcd=1; 
				System.out.print(num1+"과 "+num2+"의 공약수 : "); 
				for(i=1; i<=num1; i++){ 
					if(num1 % i == 0 && num2 % i == 0){ 
						gcd = i; 
						System.out.print(i+" "); 
					} 
				} 
				System.out.println(); 
				System.out.println(num1+"과 "+num2+"의 최대 공약수 : "  + gcd); */
		 
			/*	int i; 
				for(i=2; i<=100; i+=2){ 
					System.out.println(i); 
				} 
				for(i=1; i<=100; i++){ 
					if(i%2==0){ 
						System.out.println(i); 
					} 
				} 
				for(i=1; i<=100; i++){ 
					if(i%2==1){ 
						continue; 
					} 
					System.out.println(i); 
				} 
				for(i=1; i<=50; i++){ 
					System.out.println(i*2); 
				} 
				*/
		
		
		
		
	/*	int num1, num2; 
		char op; 
		Scanner scan = new Scanner(System.in); 
		num1 = scan.nextInt(); 
		num2 = scan.nextInt(); 
		op = scan.next().charAt(0); 
		 
		switch (op) { 
		case '+': 
			System.out.println("" + num1  
					+ op + num2 +"=" + (num1 + num2)); 
			break; 
		case '-': 
			System.out.println("" + num1  
					+ op + num2 +"=" + (num1 - num2)); 
			break; 
		case '*': 
			System.out.println("" + num1  
					+ op + num2 +"=" + (num1 * num2)); 
			break; 
		case '/': 
			switch(num2){ 
			case 0: 
				System.out.println("0으로 나눌 수 없습니다"); 
				break; 
			default: 
				System.out.println("" + num1  
						+ op + num2 +"=" + ((double)num1 / num2)); 
			} 
			break; 
		case '%': 
			switch(num2){ 
			case 0: 
				System.out.println("0으로 나눌 수 없습니다"); 
				break; 
			default: 
				System.out.println("" + num1  
						+ op + num2 +"=" + ((double)num1 % num2)); 
			} 
			break; 
		default: 
			System.out.println(op+"는 잘못된 산술 연사자입니다."); 
			break; 
		} 
		*/
	/*	int num1, num2; 
		Scanner scan = new Scanner(System.in); 
		num1 = scan.nextInt(); 
		num2 = scan.nextInt(); 
		System.out.println(num1+"과 " + num2+"의 합 : " + (num1 + num2)); 
		System.out.println(num1 + num2); 
		scan.close(); 
		*/
		/*int num = 5; 
		int i, j; 
		
		for(i=1; i<=num; i++){                
			for(j=1;j<=i-1 ;j++){ 
			System.out.print(" "); 
			} 
			for(j=1;j<=2*(num-i)+1 ;j++){ 
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		//i-1*=10-i=9+1-i=num+1-i

		*//********** 9  0
 *******   7  1          i=1 공= 0 *= 9  5//공백
  *****   5   2           2 1 7   4
   ***    3    3           325    3
    *     1    4*//*         433  2
                           541    1
                                              공=i-1 *=2*()-1
		// 공 i-1 *=(5-1-i)-1
		
		*/
		
		
		//100이하의 소수를 모두 출력하는 코드를 작성하세요.//
		/*int i=1;

		for( i=1;  i<=100;i++){
			if(i/100==0) {
				System.out.println("i/100="+i);
			}
		}
		*/
		
		int num = 6;
		int i, cnt=0;
		for(num=1; num<=100; num++){
			
		}
		    for(i=1, cnt=0; 1<=num; i++){
			   if(num % i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.print(num+" ");
		}

		System.out.println();
			
		
		
		/*int i,  cnt;
		int num= 100;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for(i=1, cnt=0; i<=num; i++){
			if(num % i == 0){
				cnt++; 
			}
		}
		if(cnt == 2){
			System.out.println(num+"는 소수");
		}
		//2개가 아니면소수가 아님이라고 출력
		else{
			System.out.println(num+"는 소수가 아님");
		}*/
		
		//cnt +=1;// cnt= cnt+1;// ++cnt;
		// i가 num의 약수이면 약수의 갯수를 하나 증가
					//num를 i로 나누었을 때 나머지가 0과 같다=>i가 num의 약수
		//약수의  갯수가 2개이면 소수라고 출력
		//cnt는 약수의 갯수
		//소수는 약수가 2개뿐인 수를 소수라한다.
		
		
		
				
	}

}
