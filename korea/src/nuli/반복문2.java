package nuli;

public class 반복문2 {

	public static void main(String[] args) {
		// 다음 배열의 모든 값을 출력하는 코드를 작성하세요
		int arr[] = new int[]{1,3,5,7,9,2,4,6,8};
		for(int i=0; i< 9;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		//향상된 for문 이 향상된 for문은 배열에서만 사용 가능하다.
		//향상된 for 사용조건
		//1.배열이나 컬렉션프레임워크 일 때 사용
		//2.배열의 값을 확인할 때 사용
		//3.모든 배열을 확인
		//4.배열의 값을 수정할때는 사용하지 않음
		/*for(int tmp : arr){
			System.out.print(tmp + " ");
		}
		//
		for(int i = 0; i<arr.length;i++){
			int tmp = arr[i];
			System.out.print(tmp+ " ");
		}
		//
*/		for(int j=0; j<9;j=j+2){
			if(j%2==0)
				System.out.print(arr[j]);
		}
		//		
		for(int i =0; i<arr.length;i+=2){
			int tmp = arr[i];
			System.out.print(tmp+ " ");
		}
		System.out.println();
		//3.배열의 가장큰 수를 출력하세요.
		int max = arr[0];
		for(int tmp:arr){
		  if(max < tmp){
			  max = tmp;
		  }
		}
		System.out.println("배열의 최댓값 : " + max);
		
	}
		//위의 배열에서 짝수번지에 있는 값을 출력하세요
		
		//위의 배열에서 가장 큰 수를 출력하세요.
	
		
	

}
