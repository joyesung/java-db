package korea;

public class DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 10까지의 짝수의 합
		int i;
		int sum =0;
		// 1부터 10까지 하나씩 증가하면서 짝수이면 더하고 홀수이면 무시한다.
		for(i=1 ; i<=10 ;i++ ){
		if(i% 2 == 0){
			sum+=i;
		}
		}
		System.out.println("1부터 10까지의 짝수의합:" + sum);
		
	}

}
