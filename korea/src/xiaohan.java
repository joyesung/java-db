
public class xiaohan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*  int num1=3;
      int num2=7;
      int i,gcd=1;
      for(i=1; i<=num1; i++){
    	  if(num1 %i == 0 && num2 %i ==0){
    		  gcd=i;
    	  }
      }
      System.out.println(num1+"과"+num2+"서로소"+gcd);
	
	*/
	// 3과 7의 서로소가 1인지 확인해라
		 int num1=3;
	      int num2=7;
	      int i,gcd=1;
	      for(i=1; i<=num1; i++){
	    	  if(num1 %i == 0 && num2 %i ==0){
	    		  gcd=i;
	    	  }
	      }if(gcd == 1){
    	 System.out.println(num1+"과"+num2+"는 서로소 관계");
     }else{
    	 System.out.println(num1+"과"+num2+"는 서로소 관계가 아님");
     }
	
	
	
	}

}
