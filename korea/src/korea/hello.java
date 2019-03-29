package korea;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
	    // 주석입니다.
		/* 
		 * 
		 * println("문자열") 내가 원하는 문자열을 콘솔에 출력한 후 엔터를 입력
		 * print("문자열") 내가 원하는 문자열을 콘솔에 출력
		 * */
		/*int num1 = 10;
		long num2 = 10l;
		float num3 = 1.123f;
		Scanner scan = new Scanner(System.in);
		int num = 0;
		num = scan.nextInt();
		System.out.println(num);	
		String input = scan.nextLine();
		System.out.println(input);
		num = Integer.parseInt(input);
		double num2 = scan.nextDouble();
		System.out.println(num2);
		char op = scan.next().charAt(0);
		System.out.println(op);*/
		/*int num = 'a';
		double num2 = 1.23f;
		float num3 = (float)1.23d;
		num = (int)num3;
		System.out.println(num);*/
		//대입 연산자 =
		//대입연산자를 기준으로 좌측에는 무조건 변수명 1개가 와야한다.
		// 나중에 조건문에서 비교연산자와 대입연산자를 혼동
		/*int num = 0;
		num = 3;
		//3 = num;// 에러발생
		int num1 = 1 + 2;
		int num2 = 1 - 2;
		int num3 = 1 * 2;
		double num4 = 1 / (double)2;//double명시적형변환해서 값을 실수로 만들기
		System.out.println(num1); // 3
		System.out.println(num2); //-1
		System.out.println(num3); //2
		System.out.println(num4); //0.5
		System.out.println((char)('A'+1));
		char ch = 'A'+1;
		System.out.println(ch);
		char ch2 = (char)(ch + 1);
		System.out.println(ch2);*/
		/*System.out.println( 1<2 );
		System.out.println( 1>2 );
		System.out.println( 1<=2);
		System.out.println( 1>=2);
		System.out.println( 1==2);
		System.out.println( 1!=2);
		
		*/
		/*&&(AND연산자) ||,(OR연산자), !(NOT연산자)	
		참 && 거짓 = >
		거짓 && 참 = >
		거짓 && 거짓
		
		
		int num1 = 7;
		int num2 = 9;
		System.out.println(num1 ^ num2);*/
		/*int num2 = 10;
		num2 += 1; // num2 = num2 +1;
		num2 *= 2; // num2 = num2 *2;
		num2 = -num2 +1;*/
		//int num1 10/3 = num1;
		/*int num1;
		num1 = 10/3;
		System.out.println(num1);*/
		/*int num1 = 10, num2 = 3;
		double res;
		res = num1 / (double)num2;
		System.out.println(res);
		*/
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("입력한 수 :" + num);
		scan.close();*/
		/*Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		double = 1 <= num && num <= 100;
		System.out.println(double);
		System.out.println(1 <= num && num <= 100);*/
	/*	boolean isScore = false;
		isScore = 1 <= num && num <= 100;
		System.out.println(isScore);
		*/
		/*int num = 10 + 3;
		System.out.println(num);
		int num1 = 10 % 3;
		System.out.println(num1);
		System.out.println(10*3);
		System.out.println(10-3);
		System.out.println(10/3);
		System.out.println(10%3);
		*/
		/*
		System.out.println((3000 * 3) * 365 * 28+"원" ); 
		
				
		
		Scanner scan =new Scanner(System.in);
		
		*/
		/*Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		
		// 짝수 : num 2로 (나누었을 때 나머지)가 0과 (같다)
		boolean isEven = num % 2 == 0;
		System.out.println(isEven);*/
		/*
		int num = 11;
		if(num % 2 == 0){
			System.out.println("짝수");
		}
		//num가 홀수라면 콘솔에 홀수라고 출력
		
		if(num % 2 == 1){
			System.out.println("홀수");
		}
		*/
		
		
			
		/*int num = 10;
		if(num % 2 == 0){
			System.out.println("짝수");
		}
		//위의 조건식이 거짓이면
		
		else{
			System.out.println("홀수");
		}// if else를 사용하면 코드의 효율이 좋아진다.
		
		*/
      //나이가 20이상이라면 성인이라고 출력하고 아니면  청소년이라고 출력하는 코드를 작성하세요
      
		/*int num = 20;
		if(num >=20){
			System.out.println("성인");
		}
	      //위의 조건식이 거짓이면
		
		else{
			System.out.println("청소년");
		}
		*/
	
	/*int age = 20;
    if(age>=20){
    	System.out.println("성인");
    }else{
	    	System.out.println("청소년");
    }
 
		
		
		*/
		// num가 2의 배쉬면 2의 배수라고 출력하는 예제
		
	
		
		
	/*	int num = 4;
		if(num % 2 == 0){
			System.out.println(num+"는 2의 배수");
		}
		*/
		//num가 2의 배수이면 2의 배수라고 출력하고
		//num가 3의 배수이면 3의 배수라고 출력하고
		//num가 6의 배수이면 6의 배수라고 출력하고
		//num가 2,3,6의 배수가 아ㅣ면 2,3,6,의 배수가 아닙니다
		//라고 출력하는예제
		//num = 6 = >6의 배수입니다만 출력해야한다

		/*int num = 6;
		if(num % 2 == 0 && num % 3 != 0){
			System.out.println(num+"는 2의배수");
		}else if(num % 3 ==0){
			System.out.println(num+"는 3의 배수");
		}else if(num % 6== 0){ 
			System.out.println(num+"는6의배수");
		}else{
			System.out.println(num+"는2,3,6의배수가 아님");
	
	*/
	
		int score = 0;
		char grade = 'a'; 
		if(score>=90){
			System.out.println(grade='a');
		}else if(score<=90){
			System.out.println(grade='b');
		}else if(score<=80){
			System.out.println(grade='c');
		}else if(score<=70){
			System.out.println(grade='d');
		}else if(score<=60){
			System.out.println(grade='f');
		}
		
		int num = 6;
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num+"는6의배수");
		}
		
		
		
	
		// TODO Auto-generated method stub

	}

}
