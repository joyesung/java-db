package nuli;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class day4월17일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		int[] [] board = new int [6] [6];
		
		for(int i = 0; set.size() < 36; i++){
			set.add((int)(Math.random() *45) + 1+"");
			
			
		}
		//검색해서 등수 매기기 필요 contain
		
		Iterator it = set.iterator();
		
	for(int i =0; i< board.length; i++){
		for(int j = 0; j < board[i].length; j++){
			board[i][j] = Integer.parseInt((String) it.next());
			System.out.print((board[i][j]< 10 ? " " : " ") + board[i][j]);
		}
		System.out.println();
		
		}
	}

}
