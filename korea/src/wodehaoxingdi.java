import java.util.Scanner;

public class wodehaoxingdi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*   for (int j=1; j<=6; j++){
    	System.out.print("*");
    }
    System.out.println();
    for(int j=1;j<=1;j++){System.out.print("*");}System.out.println();
    for(int j=1;j<=2;j++){System.out.print("*");}System.out.println();
    for(int j=1;j<=3;j++){System.out.print("*");}System.out.println();
    for(int j=1;j<=4;j++){System.out.print("*");}System.out.println();
    for(int j=1;j<=5;j++){System.out.print("*");}System.out.println();
    for(int j=1;j<=6;j++){System.out.print("*");}System.out.println();
	
	
    int num = 0;
    System.out.print("*6.>");
    Scanner scan = new Scanner(System.in);
    String tmp = scan.nextLine();
    num = Integer.parseInt(tmp);    
    
    for(int i=0;i<num;i++){
    	for(int j=0;j<=i;j++){
    		System.out.print("*");
    	}
          System.out.println();   
    }*/
    
    
    
   /* for(int j=1;j<=1;j++){
    	System.out.print(" ");
    	System.out.print("*");}
    System.out.println();
    for(int j=1;j<=2;j++){
    	System.out.print(" ");
    	System.out.print("*");}
    System.out.println();
    for(int j=1;j<=3;j++){
    	System.out.print(" ");
    	System.out.print("*");}
    System.out.println();
    for(int j=1;j<=4;j++){
    	System.out.print(" ");
    	System.out.print("*");}
    System.out.println();
    for(int j=1;j<=5;j++){
    	System.out.print(" ");
    	System.out.print("*");
    	}System.out.println();
    for(int j=1;j<=6;j++)
    {System.out.print(" ");
    	System.out.print("*");
    }System.out.println();
	//
*/   //공백에 대한 갯수를 표현 공=6-i
    
    for(int i=1;i<=6;i++){
    	 for(int j=1;j<=6-i;j++){
    	 System.out.print("");
    	 }
    	 for(int j=1;j<=6;j++){
    		 System.out.println("*");
    	 }
    	System.out.println();
    	 }
    	 
    
    
    
    
    
    
	}

}
