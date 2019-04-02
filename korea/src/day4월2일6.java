
public class day4월2일6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //최소값(min)과 최댓값(max)가 주어지면 최솟값과 최댓값 사이의 임의의 정수를 알려주는 메소드   
	//알려주는 메소드
	//매개변수 :최솟값, 최댓값 => int min, int max 
	//리턴타입 : int
    //메소드명 : random
		int max= 45, min =1;
		int [] arr= new int[7];
		int [] arr2=new int[6];
		if(createRandArr(min,max,arr)){
			printArr(arr);
		}else{
			System.out.println("배열 생성에 실패");
		}
		if(createRandArr(min,max,arr2)){
			printArr(arr2);
		}else{
			System.out.println("배열 생성에 실패");
		}
		
		
		
    }
	
	
	
	public static int random(int min, int max){
		if(min>max){
		   int tmp =min;
		   min =max;
		   max =tmp;
		
		
		
		}
		return (int)(Math.random()*(max-min+1)+min);
		
	}
	
	// 기능 : 배열에 검색숫자가 있는지 없는지 확인하는 메소드
	//매개변수 :필요한정보 =>검색숫자,배열  => int[] arr, int nm
	//리턴타입 :있는지(true), 없는지(false)=>boolean
	//메소드명 :Contain 
	
	public static boolean contain(int []arr, int num, int cnt){
		if(arr == null){
			return false;
		}
		if(cnt > arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i] == num){
				return true;
			}
		}
		return false;
	}
	
	// 기능 : 배열이 주어지면 중복되지 않은 랜덤한 수(min~max)로 배열을 채우는 메소드
	// 매개변수 : 최솟값, 최댓값, 배열 => int min, int max, int []arr
	// 리턴타입 : 배열(채워진 배열), 정수(중복되지 않은 랜덤한수),boolean(중복여부)
	           //boolean(배열을 채웠는지 못채웠는지 여부)
	public static boolean createRandArr(int min, int max, int []arr){
		if(arr == null){
			return false;
		}
		if(max-min+1<arr.length){
			return false;	
		}
		int cnt = 0;
		while(cnt < arr.length){
			int r = random(min,max);
			if(!contain(arr,r,cnt)){
				arr[cnt] = r;
				cnt++;
			}
		}
		return true;
	}   
	
	
	// 기능: 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메소드
	// 매개변수 : 배열=>int []arr
	//매소드명 : printArr
	public static void printArr(int []arr){
		System.out.print("[");
		for(int tmp:arr){
			System.out.println(tmp + " ");
		}
		System.out.println("]\n");
	}
	
	
	
	
}
