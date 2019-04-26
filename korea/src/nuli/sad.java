package nuli;

public class sad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10; int num2 = 20;//int num1,num2변수 생성
		System.out.println(num1+ ","+num2);//num1,num2의 값을출력
		swap(num1,num2);//num1의 값을 num2의 값으로 서로 바꿔준다
		System.out.println(num1+","+num2);//바꾼값을 출력?
			
	}

	public static void swap(int num1, int num2){//swap이라는 사무실이라는 메소드를 생성
		int tmp = num1; //tmp에 num1값을 저장
		num1 = num2;//num1에 num2의 값을 저장
		num2 = tmp;//num2에 tmp값을 저장
	}
}
