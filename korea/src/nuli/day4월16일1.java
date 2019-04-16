package nuli;

import java.util.ArrayList;
import java.util.Collections;

public class day4월16일1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		ArrayList list1 = new ArrayList(10);//배열10개짜리 만듬
		list1.add(new Integer(5));//list1에 정수값 5를저장
		list1.add(new Integer(4));//list1에 정수값 4를저장
		list1.add(new Integer(2));//list1에 정수값 2를저장
		list1.add(new Integer(0));//list1에 정수값 0를저장
		list1.add(new Integer(1));//list1에 정수값 1를저장
		list1.add(new Integer(3));//list1에 정수값 3를저장
		
		//생성자 오버로딩을 사용 : 매개변수가 List인 경우 
		ArrayList list2  = new ArrayList(list1.subList(1, 4)); //sublist는 일부분을 보내주는것 sub는 부분적인 1번지부터 4번지 전까지
		print(list1, list2);// list1,list2를 출력
		
		Collections.sort(list1);//콜렉션에서 list1를 불러오기
		Collections.sort(list2);//콜렉션에서 list2를 불러오기
		print(list1, list2);//list1,list2를 출력
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");//insert삽입 밀어서 집어넣기 해당 번지에 넣기 전에 값이 있으면 밀고 난 뒤 추가
		print(list1, list2);
		
		list2.set(3, "AA");//update추가 덮어쓰기 기능 
		print(list1, list2);
		//겹치지 않은 내용이 있어서 삭제가 되면 true, 삭제가 안되면 false
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		
		
		
		print(list1, list2);
		//remove 배열의 끝 부분부터 확인하여 삭제한다. //0번지부터 시작하면  remove()에 의해 삭제가 되면 번지가 변경이 되어 확인하지 않은
		//있는 번지가 변깅이 되어 확인하지않은 원소가 생길 수 있기 때문에 거꾸로 확인해서 작업해야한다 
		for(int i= list2.size()-1; i>=0; i--){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
	}

	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1:" + list1);
		System.out.println("list2:"+ list2);
		System.out.println();
	}
}