package hi;

import java.util.ArrayList;
import java.util.Iterator;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Points> pointsPath = new ArrayList<>();
		Points p = new Points();
		pointsPath.add(new Points(p));
		p.move(4, 4);
		pointsPath.add(new Points(p));
		p.move(10, 10);
		pointsPath.add(new Points(p));
		Iterator<Points> it = pointsPath.iterator();
		while(it.hasNext()){
			System.out.println(
					 it.next());
		}
		
	}

}
