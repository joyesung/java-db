
public class hao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i= 1; int j=1;
		/*for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			 }
			   for(j=1; j<=i; j++){
				System.out.print("*");
			 } for(j=1; j<=6; j++){
		}       System.out.print("*");
		        System.out.println();
		}
		*/
	
for(i=1; i<=7;i++){
	for(j=1; j<=7-i; j++){
		System.out.println(" ");
	}
	for(j=1; j<=i; j++){
		System.out.print("*");
	
	}
}

		
		/*int num = 6;
		for(i=1; i<=num; i++){
			for(j=1; j<=num+1-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		int num = 6;
		for(i=1; i<=num; i++){
			for(j=1; j<=num+6-i; j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		/*******        i=1  *=6
		*****         i=2  *=5
		****          i=3  *=4
		***           i=4  *=3
		**            i=5  *=2
		*             i=6  *=1
		                    *=7 -i=6+1-i=num+1-i
		*/
		
		
	/*	****** i=1 * =6
		 ***** i=2 * = 5
		  ***
		   **
		    *
		
	*/
		
		
		
		for(i=1; i<=num; i++){
			for(j=1; j<=i-1; j++){
				System.out.println(" ");
			}
		}
		
		
		
		
		
		
	}
		

}

   