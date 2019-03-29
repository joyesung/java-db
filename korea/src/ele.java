
public class ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//두 수의 공약수를 출력하는 코드를 작성하세요.
		
		int num1=10, num2=20;
		int i, gcd=1;
		System.out.print(num1+"과"+num2+"의공약수:");
		for(i=1; i<=20; i++){
			if(num1 % i== 0 && num2 % i == 0){
			  gcd= i;	
			  System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(num1+"과"+num2+"의 공약수:" +gcd);
	}

}
