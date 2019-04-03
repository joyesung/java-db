import java.util.Scanner;

public class day4월3일3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 50이하의 소수를 출력하는 코드를 작성핫세요.
		
		int num = 4;//숫자 하나에 대해서 소수면 출력 소수가 아니면 출력이 안됨
		int cnt,i;
		for(num=1; num<=50; num++){
			for(i=1,cnt=0; i<=num; i++ ){
				if(num % i == 0){
					cnt++; //약수를 찾으면 약수의 갯수를 증가시켜라
		         }
			}	
			if(cnt == 2){
					
					System.out.print(num+ " ");
		
			}
		}
		
		
		
		
		
	}

}
