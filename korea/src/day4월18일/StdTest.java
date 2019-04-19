package day4월18일;
import java.util.*;
public class StdTest {

	public static void main(String[] args) {
		StdManager  sMng = new StdManager();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		do{
			
			sMng.printMenu();
			menu = scan.nextInt();
			switch(menu){
			case 1:
				Std s = sMng.inputStd(scan);
				if(sMng.insert(s))
					System.out.println("학생 정보를 추가했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2:
				Std s2 = sMng.inputStd(scan);
				if(sMng.update(s2))
					System.out.println("해당 학생 정보를확인 했습니다.");
				else 
					System.out.println("없는 학번입니다.");
				break;
			case 3:
				Std s3 = sMng.inputId(scan);
				if(sMng.delete(s3))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
				
			case 4:
				sMng.print();
				break;
			case 5: break;
			default:
				System.out.println("------------------");
				System.out.println("잘못된 메뉴를 선택했습니다.");
				System.out.println("-------------------");
				
			}
		}while(menu!=5);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		
		
	}

}
