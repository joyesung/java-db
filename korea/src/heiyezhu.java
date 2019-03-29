
public class heiyezhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* int num1 = 10,  num2 = 15;
    int i, lcm = 1;
    for(i=1; i<=num1*num2; i+=num1){
    	if(i % num1 == 0 && i % num2 == 0 ){
    		lcm = i;
    		break;
    	}
    }  System.out.println(num1+"과"+num2+"의최소공배수:" + lcm);*/
	
	
    
    
    int num4 = 10000,  num3 = 20000;
    int i, lcm1 = 1;
    int tmp;
    if(num3> num4){
    	tmp = num4;
    	num4 = num3;
    	num4= tmp;
    }
    for(i=1; i<=num4*num3; i+=num4){
    	if(i % num4 == 0){
    		lcm1 = i;
    		break;
    	}
    }  System.out.println(num4+"과"+num3+"의최소공배수:" + lcm1);
	
    
    
    
    
    
    
    
	
	}

}
