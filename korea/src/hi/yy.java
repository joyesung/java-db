package hi;

public class yy {

	public static void main(String[] args) {
		/*
		******
		******
		******
		******
		******
		******
		*/
		int i = 0, j=0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6; j++){
				System.out.println("*");	
			}
			System.out.println();
		}
		
		/*
		*
		**
		***
		****
		*****
		******
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
	     * i=1 ��=5 *=1
	    ** i=2 ��=4 *=2
	   *** i=3 ��=3 *=3
	  **** i=4 ��=2 *=4
	 ***** i=5 ��=1 *=5
	****** i=6 ��=0 *=6
	                    ��=6-i *=i
	*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
}
