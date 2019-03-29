import java.util.Scanner;

public class hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num = 4;
		switch(num%2){
		case 0 ://if(num%2== 0)
			System.out.println("娄荐");;
			break;
		//..
		//.. case1: default:
		case 1:
			System.out.println("圈荐");
			break;
		}
		System.out.println("3");
	   Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month){
		case 1:
		System.out.println("31老");
		break;
		case 2:
		System.out.println("28老");
		break;
		case 3:
	    System.out.println("31老");
		break;
		case 4:
		System.out.println("30老");
		break;
		case 5:
		System.out.println("31老");
		break;
		case 6:
		System.out.println("30老");
		break;
		case 7:
		System.out.println("31老");
		break;
		case 8:
		System.out.println("31老");
		break;
		case 9:
		System.out.println("30老");
		
		
		}
		
		
	}

}

   