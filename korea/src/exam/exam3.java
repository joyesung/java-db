package exam;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,1); 
		p.print(); 
		Point p1 = new Point(); 
		p1.print(); 
		Point p2 = new Point(p); 
		p2.print(); 
		p2.move(3, 4); 
		p2.print(); 
		
		 
	}

}
