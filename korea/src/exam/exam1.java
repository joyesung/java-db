package exam;

public class exam1 {

	public static void main(String[] args) {
		//1~6을 배열(컬렉션 프레임워크 사용가능)에 저장하는 코드를 작성하세요.
		int arr[] = new int[6]; 
				//int[]{1,2,3,4,5,6};
		//new int[6]
		for(int i=0; i<arr.length;i++){
				arr[i]= i+1;
				//i=1일경우 arr[i-1] = i;
				
		}
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
