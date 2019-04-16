package nuli;

import java.util.HashSet;
import java.util.Set;

public class day4월16일4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();//HaSet는 중복을 저장하지 않는다 그래서 1,2,3,4,만나온다
		
		for(int i=0; i< objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set);
	}

}
