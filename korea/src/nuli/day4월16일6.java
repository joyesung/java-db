package nuli;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class day4월16일6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		//Set set = new LinkedHashSet();
		int [] [] board = new int [5] [5];
		
		for(int i=0; set.size()<25; i++){
			set.add((int) (Math.random()*50)+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; set.size() <25; i++){
			for(int j=0; j<board[i].length;j++){
				board[i] [j] = Integer.parseInt((String) it.next());
				System.out.println((board[i] [j] < 10? " " :  " ") + board[i] [j]);
			}
			System.out.println();
		}
	}

}
