package nuli;

import java.util.Scanner;

public class ㅎㅎㅎ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = new String();
		String searchStr = "";
		String replaceStr = "";
		System.out.println("문자열을 입력하세요.: ");
		str = scan.nextLine();
		System.out.println("교체할 문자열: ");
		searchStr = scan.nextLine();
		System.out.println("교체될 문자열을 입력하세요.: ");
		replaceStr = scan.nextLine();
		
		String newStr = "";
		newStr = str.replaceAll(searchStr, replaceStr);
		if(newStr == str){
			System.out.println("교체될 문자열이 없습니다.");
		}else{
			System.out.println("교체될 문자열 : "+newStr);
		}
		
	}

}
