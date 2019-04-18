package nuli;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("abc", "1234");
		map.put("def", "1111");
		map.put("ypzf", "1234");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id:");
			String id = scan.nextLine().trim();
			
			System.out.print("password:");
			String password = scan.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다."+ "다시입력해주세요.");
				continue;
			}else{
				if(!(map.get(id)).equals(password)){
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요.");
				}else{
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}

}
