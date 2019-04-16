package nuli;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class day4월16일3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		//Queue : 인터페이스
		// 인터페이스는 자체로 객체를 만들 수 없다
		//인터페이스는 생성자가 없다
		// Queue라는 인터페이스를 구현한 클래스를 (Linked List)이용하여
		// Queue 인터페이스의 객체를 생성할 수 있다.
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
