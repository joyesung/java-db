package nuli;

public class 허수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*허수
		1+2i+3+4i= 4+6i
		//출력예시
		허수1의 실수부 : 1
		허수1의 허수부 : 2
		허수2의 실수부 : 3
		허수2의 허수부 : 4
		(1+2i) + (3+4i) = (4+6i)
		(1+2i) -  (3+4i) =(-2-2i)*/
		int i=1;//허수1의 실수부
		int j=2;//허수 1의 허수부
		int k=3;//허수2의실수부
		int h=4;//허수2의 허수부
				
		int num1 = i+k;
		int num2 = j+h;
		int num3 = i-k;
		int num4 = j-h;
				
		//(1+2i) + (3+4i) = (4+6i)
		//(i+ji) + (k+hi) = (num1 + num2i) 
		System.out.println("("+i+"+"+j+"i) + ("+k+"+"+h+"i) = ("+num1 +" + "+num2+"i)");
		System.out.println("("+i+"+"+j+"i) - ("+k+"+"+h+"i) = ("+num3 +" + "+num4+"i)");
	}

}
