import java.util.Scanner;

public class corea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* int min = 1;
         int max = 3;
         //min ~ max 사이의 정수를 랜덤으로 생성하는 코드
         //com이 가위(1), 바위(2), 보(3)중에서 랜덤으로 하나 선택
         int com =  (int)(Math.random()*(max-min+1) + min);
         int user = 0;
         Scanner scan = new Scanner(System.in);
		 System.out.println("가위(1),바위(2),보(3) 중 하나를 입력");
		 user = scan.nextInt();
		 
		 switch(user-com){
		 case 0 :
		 System.out.println("무승부입니다");
		 break;
		 case -1: case 2:
			 System.out.println("컴퓨터 승입니다");
		 break;
		 case 1: case -2: // default:
		 System.out.println("사용자승자입니다");
		 break;
		 //switch문은 값이 제한적일 때 사용한다. if문보다 더 효율적으로 사용할 수 있다.
*/		  /*int i = 0; //반복문에서 사용할 변수
		  for(i=1; i<=5; i++){
			  System.out.println("Hello world!");
		  }*/
		 /*
		  int i = 0;
		  int sum = 0;
		  for(i=1, sum=0; i<=10; i+=1){  
			  sum= sum+i;
			  // sum = sum+i;
            System.out.println("1부터 10까지의 합:"+sum);
		  }*/
		  
		 /*int i = 0;
		 int num = 7;
		 for(i=1; i<=9; i++){
			System.out.println(num+"x"+i+ "="+num*i);
		 }*/
		 
		 /*int i =0;
		 int num = 2;
		 for(i=1; i<=2; i++){
			System.out.println(num/i); 
		 }
		 int a =0;
		 int num2 = 121;
		 for(a=1; a<=121; a++){
			 System.out.println(num2/a);
		 }
		 */// 반복 횟수: 1부터 num보다 작거나같을 때 가지 1씩증가한다
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for(i=1, cnt=0; i<=num; i++){
			// i가 num의 약수이면 약수의 갯수를 하나 증가
			//num를 i로 나누었을 때 나머지가 0과 같다=>i가 num의 약수
			if(num % i == 0){
				cnt++; //cnt +=1;// cnt= cnt+1;// ++cnt;
			}
		}
		//약수의  갯수가 2개이면 소수라고 출력
		if(cnt == 2){
			System.out.println(num+"는 소수");
		}
		//2개가 아니면소수가 아님이라고 출력
		else{
			System.out.println(num+"는 소수가 아님");
		}
		
		
		
		
		
		
	}

}
