package exam;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		int min = 10;
		int max = 1;
		res = sum(min,max);
		/*이 위치에서 min과 max의 값을 찍는다면 과연 얼마인가?
		 * min = 10;
		 * max = 1;
		 * */
		System.out.println(""+min+","+max);
		System.out.println(res);
		
	}
	/*기능 : min과 max가 주어지면 min부터 max까지의 합을 알려주는 메소드
	 * 매개변수: min max 
	 * 리턴타입: int
	 * 메소드명: sum
	 * 
	 * 
	 * 
	 * */
	public  static int sum(int max, int min){
		int i=0;
		int res=0;
		if(max<min){
			int tmp = min;
			min = max;
			max =tmp;
		}
		for(i=min;i<=max;i++){
			res+=i;
		}
			
		return res;
	}
	
}
