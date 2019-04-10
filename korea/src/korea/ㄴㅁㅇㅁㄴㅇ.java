package korea;

import java.util.Scanner;

import nuli.A;

public class ㄴㅁㅇㅁㄴㅇ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//문자열을 입력하세요 : Hello world
		//찾을 문자열을 입력하세요 : He
		//Hello world에는 He가 있습니다.
		//문자열을 입력하세요. : 112233445511
		//교체될 문자열을 입력하세요 : 11
		//교체할 문자열을 입력하세요 : 00
		//교체 결과 : 002233445500
		
		Scanner scan = new Scanner(System.in);
		/*String str = "";
		System.out.print("문자열을 입력하세요.: ");
		str = scan.nextLine();
		System.out.print("찾을 문자열을 입력하세요.: ");
		String search = scan.nextLine();
		if(str.contains(search)){
			System.out.println(str+"에는 "+search +"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search +"가 없습니다.");
		}
		if(str.indexOf(search) >=0){
			System.out.println(str+"에는 "+search +"가 있습니다.");
		}else{	
		System.out.println(str+"에는 "+search +"가 없습니다.");
		}
		scan.close();
		*/
		
		String str1 = "";
		System.out.println("문자열을 입력하세요.: ");
		str1 = scan.nextLine();
		System.out.println("교체될 문자열을 입력하세요.: ");
		String search = scan.nextLine();
		String s = "112233445511";
		String s1 = s.replace("11", "00");
		System.out.println("교체결과:" + s1);
			
		
		
		//다른 예시 
		///문자열을 입력하세요. : 112233445511
		//교체될 문자열을 입력하세요 : 99
		//교체할 문자열을 입력하세요 : 00
		//교체된게 없습니다.
		String str2 = "";
		System.out.println("문자열을 입력하세요.: ");
		str2 = scan.nextLine();
		System.out.println("교체될 문자열을 입력하세요.: ");
		String search1 = scan.nextLine();
		String s3 = "112233445511";
		String s2 = s.replace("99", "00");
		System.out.println("교체결과:" + s2);
		String str4 = "Hello", str3="Hello";
		boolean cmp = str1 == str2;
		System.out.println(cmp);
		cmp = "str1" !=(str2= "Hello ");
		System.out.println(cmp);
		cmp = "str1" !=(str2= "Hello 1");
		System.out.println(cmp);
		System.out.println(str1.equals(str2));
		try {
			
			System.out.println(calc(1,0,'/'));
		} catch (Exception e){
			e.printStackTrace();
			//Exception e = new Exception("0으로 나눌 수 없습니다.")
		}finally{//에러가 발생해도 실행되고 에러가 없어도 실행되는 부분이다.
			System.out.println("예외처리가 끝나면 무조건 실행되는곳");
		}
	}
		public static double calc(int num1, int num2, char op)
		throws Exception{
			double res = 0.0;
			if(op=='/' && num2 == 0){
				throw new Exception("0으로 나눌 수 없습니다.");
				//Exception e = new Exception("0으로 나눌 수 없습니다.")
				//throw e (위의 코드와 같다)
			}
			switch(op){
			case '+' : res = num1 + num2; break;
			case '-' : res = num1 - num2; break;
			case '*' : res = num1 * num2; break;
			case '/' : res = (double)num1 / num2; break;
			case '%' : res = num1 % num2; break;
			}
			return res;
			
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1=1, num2=0;
			int res;
			int arr[] = new int[10];
			try{
				//예외 상황이 발생할 수 있는 코드
				//arr[10]=0;
				//AtrithtmetcException이 발생 할 수 있다.
				res = num1/num2;
				System.out.println(res);
			}
			//try문에서 AtrithmeticExceptoin이 발생하면
			//아래 cath문을 실행하고 다음 코드를 실행해라.
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("연산 예외 발생!!!");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 예외 발생 !!!");
			}catch(Exception e){
				System.out.println("예외 발생 !!!");
			}
			System.out.println("프로그램 종료!!");
			
			print(new A(){
				public void test(){
					System.out.println("test");
				}
			
			});
		}
		public static void print(A a){
			a.test();
		}
	}
	interface A{
		void test();
	}
	class B implements A{
		public void test(){}
		
		
		
}
