package nuli;

import java.util.HashMap;
import java.util.Scanner;

public class day4월16일8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		//map에서 put메소드는 두개의  매개변수를 거치는데 
		map.put("myId", "1234");
		map.put("asdf", "1111");
		//key값이 중복됬을 때 value를 어떻게 처리할 것인가??
		//key값이 중복되면 value의 값을 덮어 쓴다.
		map.put("asdf", "1234");
		Scanner scan = new Scanner(System.in);
		
		while (true){
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = scan.nextLine().trim();
			// 문자열의 모든 공백을 제가 : trim();이다
			// 아이디는 공백이 없어야하기 때문에 공백제거인 trim이 사용된다.
			
			
			System.out.println("password");
			String password = scan.nextLine().trim();
			System.out.println();
			
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다." + " 다시입력해주세요. ");
				continue;
				//id가 입력받은 id와 일치하는  value를 입력받은 pw와 비교하여
				//같지 않으면  ==> 입력받은 비밀번호와 id의 비밀번호가 같지 않으면
			}else{
				if(!(map.get(id)).equals(password) ) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
					//일치하면 반복문을 종료 후 프로그램을 종료
				}else{
					System.out.println("id와 비밀번호가 일치합니다.");
					break; 
				}
			
			}
		
		}
		
	}

}
