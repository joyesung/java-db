

public class day4월3일1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		/*1. 구구단 전체를 출력하는 코드를 작성하세요.
		2.5개짜리 배열을 생성하고 배열에 0번지에 5,1번지에 4,2번지에 3,3번지에 2,4번지에 1를 저장하고 출력하는 코드를 작성하세요.
		3. 50이하의 소수를 출력하는 코드를 작성핫세요.
		4. 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드를 작성하세요.*/
		
		//2.문제 5개짜리 배열을 생성하고 배열에 0번지에 5,1번지에 4,2번지에 3,3번지에 2,4번지에 1를 저장하고 출력하는 코드를 작성하세요.
		int [] score; 
		score = new int[5];
		
		score[0] = 5;
		score[1] = 4;
		score[2] = 3;
		score[3] = 2;
		score[4] = 1;
		
		System.out.println(score [0]   );
		System.out.println(score [1]   );
		System.out.println(score [2]   );
		System.out.println(score [3]   );
		System.out.println(score [4]   );
		
		
		
		int []arr = new int[5];
		arr[0] = 5; arr[1] = 4; arr[2] = 3; arr[4] = 2;
		for(int tmp:arr)
			System.out.println(tmp + " ");
		System.out.println();
		
		
		
		int []arr2 = new int[]{5,4,3,2,1};
		for(int i = 0; i<arr2.length; i++) 
			System.out.println(arr2[i] + " ");
		System.out.println();
		
		
		
		int[]arr3 = new int[5];
		for(int i=0; i<arr3.length; i++){
			arr3[i] = arr3.length - i;
		}
		for(int tmp: arr3)
			System.out.println(tmp+ " ");
		System.out.println();
		
	
		
		
		
		
		
	}

}
