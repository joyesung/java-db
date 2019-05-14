package 연습;

import java.util.Scanner;

public class exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//nextInt()는 Scanner클래스의 멤버 메소드
				//int num = scan.nextInt();
				//next()는 Scanner클래스의 멤버 메소드
				//charAt()는 String클래스의 멤버 메소드
				//char ch = scan.next().charAt(0);
		scan.close();
		
		SamsungTv tv = new SamsungTv();
		tv.printChannel();
		SamsungTv tv2 = new SamsungTv();
		tv2.printChannel();
		SamsungTv tv3 = tv;
		System.out.println(SamsungTv.BRAND);
		//Tv.BRAND = "삼성";
		System.out.println(tv.BRAND);
		System.out.println(tv2.BRAND);
		SamsungTv.prinBrand();
	}
	//같은 패키지에서 동일한 클래스명을 가지는 클래스를 선언할 수 없다		
	/*class Tv{  */
		
}
