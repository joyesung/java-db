import java.util.Scanner;

public class congming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//두 정수와 산술 연산자를 입력받아 연산 결과를 출력하는 코듣 작성하세요
		
		/*int num1, num2;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1 + "과" + num2 + "의값 :" + (num1 + num2) );
		char op = scan.next().charAt(0);
        num1 = 1; num2 = 2;
	      System.out.printf(num1 + "과" + num2+ "의값" +(num1*num2) );
	      if(num1==1) System.out.println(num1=1);
		  if(num2==2) System.out.println(num2=2);*/
			
		  int num1, num2;
		  char op ;
		  Scanner scan = new Scanner(System.in);
		  num1 = scan.nextInt();
	      num2 = scan.nextInt();
	      op = scan.next().charAt(0);
		  
	      switch (op) {
		case '+':
			System.out.println(""+ num1 + op + num2 +"=" + (num1+num2));
			
			break;
		case '-':
			System.out.println(""+ num1 + op + num2 +"=" + (num1-num2));
			
			break;
		case '*':
			System.out.println(""+ num1 + op + num2 +"=" + (num1*num2));
			
			break;
		case '/':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다");
				break;
				default:
				System.out.println(""+ num1 + op + num2 +"=" + ((double)num1/num2));
				
			}
			
			
			break;
		case '%':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다");
				break;
				default:
				System.out.println(""+ num1 + op + num2 +"=" + ((double)num1%num2));
			}
				default:
					System.out.println(op+"는 잘못된 산술 연산자 입니다.");
			break;
			
		}
		
	}

}
