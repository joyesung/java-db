package nuli;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class day4월16일5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new HashSet();
		
		while(set.size()<6){
			int num = (int) (Math.random()*45) + 1;
			set.add(new Integer (num));
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
