package nuli;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
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
			
	}
}
