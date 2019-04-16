package nuli;

import java.util.Vector;

public class day4월16일2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);// 배열 5개짜리
		v.add("1");//0번지에 1
		v.add("2");//1번지에 2
		v.add("3");//2번지에 3
		print(v);//v출력
		
		v.trimToSize();//trimtosize의 trim은 공백제거
		System.out.println("=== After trimToSize() ===");//sysout()안에 말은 괄호 안 문자르 쓰고 밑의 v를 출력한다라는 뜻이다
		print(v);//위의 에프터 트림토사이즈 하고 밑에 v를 출력
		
		v.ensureCapacity(6);//capacity는 최대 저장공간//가용공간을 6개로 늘린다라는 뜻임
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
		
	}
public static void print(Vector v){
	System.out.println(v);
	System.out.println("size:"+ v.size());
	System.out.println("capacity : " + v.capacity());
	}
}
