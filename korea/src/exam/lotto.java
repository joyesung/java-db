package exam;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 45, min = 1;//max�� 7���� ������ �迭 ������ ���� 
		int [] arr= new int[7]; 
		int [] arr2 = new int [6]; 
		//int [] arr= null;//�迭 ������ ���� 
		if(createRandArr(min, max, arr)){ 
			printArr(arr); 
		}else{ 
			System.out.println("�迭 ������ ����"); 
		} 
		if(createRandArr(min, max, arr2)){ 
			printArr(arr2); 
		}else{ 
			System.out.println("�迭 ������ ����"); 
		} 
		//��÷ ����� ����ϴ� �ڵ带 �ۼ��غ�����.(�����Ӱ�) 
		//1�� : ���ʽ���ȣ�� ������ ��ȣ 6���� ��ġ 
		//2�� : ���ʽ���ȣ�� ������ ��ȣ 6���� ��ġ 
		//3�� : ���ʽ���ȣ�� ������ ��ȣ 5���� ��ġ 
		//4�� : ���ʽ���ȣ�� ������ ��ȣ 4���� ��ġ 
		//5�� : ���ʽ���ȣ�� ������ ��ȣ 3���� ��ġ 
		//�� : 2������ 
		int r = rank(arr,arr2); 
		printRank(r); 
		 
	} 
	/* ��� : �ּҰ�(min)�� �ִ�(max)�� �־����� �ּڰ��� �ִ� ������ ������ ������ 
	 * �˷��ִ� �޼ҵ� 
	 * �Ű����� : �ּڰ�, �ִ�=>int min, int max 
	 * ����Ÿ�� : ���� => int 
	 * �޼ҵ�� : random  
	 * */ 
	public static int random(int min, int max){ 
		if(min>max){ 
			int tmp = min; 
			min = max; 
			max = tmp; 
		} 
		return (int)(Math.random()*(max-min+1)+min); 
	} 
	/* ��� : �迭�� �˻����ڰ� �ִ��� ������ Ȯ���ϴ� �޼ҵ� 
	 * �Ű����� : �˻�����,�迭=>int[] arr, int num 
	 * ����Ÿ�� : �ִ���(true), ������(false)=>boolean 
	 * �޼ҵ�� : contain 
	 * */ 
	public static boolean contain(int []arr, int num, int cnt){ 
		if(arr == null){ 
			return false; 
		} 
		//�迭�� ũ�⺸�� �� ���� �˻��Ϸ��� �ϴ� ��� 
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
	/* ��� : �ּڰ��� �ִ�, �迭�� �־����� �ߺ����� ���� ������ ��(min~max)��  
	 *       �迭�� ä��� �޼ҵ� 
	 * �Ű����� : �ּڰ�, �ִ�, �迭 =>int min, int max, int []arr 
	 * ����Ÿ�� : boolean(�迭�� ä������ ��ä���� ����) 
	 * �޼ҵ�� : createRandArr 
	 */ 
	public static boolean createRandArr(int min, int max, int []arr){ 
		//�Ű������� �Ѿ�� �迭�� �����Ǿ� ���� ���� �� 
		if(arr == null)				{	return false;		} 
		//������ �� �ִ� ������ �������� �迭�� ũ�Ⱑ Ŭ �� 
		//�ߺ��Ǵ� ��Ȳ�� �߻��� ���ۿ� ���� �� 
		if(max-min+1 < arr.length)	{	return false;		} 
		int cnt = 0;//�迭�� ����� ������ ������ ���� 
		//�迭�� ������ŭ ����Ǹ� �ݺ����� ���� 
		while(cnt < arr.length){ 
			int r = random(min,max); 
			//arr�� r�� ������ 
			if(!contain(arr, r, cnt)){ 
				arr[cnt] = r; 
				cnt++; 
			} 
		} 
		return true; 
	} 
	/* ��� : �迭�� �־����� �迭�� ��� ���Ұ��� �ֿܼ� ����ϴ� �޼ҵ� 
	 * �Ű����� : �迭 =>int []arr 
	 * ����Ÿ�� : ���� =>void 
	 * �޼ҵ�� : printArr 
	 */ 
	public static void printArr(int []arr){ 
		System.out.print("[ "); 
		for(int tmp:arr){ 
			System.out.print(tmp + " "); 
		} 
		System.out.print("]\n"); 
	} 
	public static int contain2(int []arr, int num, int cnt){ 
		if(arr == null){ 
			return -1; 
		} 
		//�迭�� ũ�⺸�� �� ���� �˻��Ϸ��� �ϴ� ��� 
		if(cnt > arr.length){ 
			cnt = arr.length; 
		} 
		for(int i=0; i<cnt; i++){ 
			if(arr[i] == num){ 
				return i; 
			} 
		} 
		return -1; 
	} 
	public static boolean createRandArr2(int min, int max, int []arr){ 
		if(arr == null)				{	return false;		} 
		if(max-min+1 < arr.length)	{	return false;		} 
		int cnt = 0; 
		while(cnt < arr.length){ 
			int r = random(min,max); 
			//arr�� r�� ������ 
			if(contain2(arr, r, cnt)<0){ 
				arr[cnt] = r; 
				cnt++; 
			} 
		} 
		return true; 
	} 
	/* ��� : �� �迭�� �־����� �� �迭�� ���� ���Ұ� � �ִ��� �˷��ִ� �޼ҵ� 
	 * �Ű����� : �� �迭=>int []arr1, int []arr2 
	 * ����Ÿ�� : ����=>int 
	 * �޼ҵ�� : compareArr 
	 * */ 
	public static int compareArr(int []arr1, int []arr2){ 
		int cnt = 0;//�� �迭�� ���� �� ��ġ�ϴ� ���� 
		int size = 0;//�� �迭 �� ���� �迭�� ���̸� ���� 
		if(arr1.length > arr2.length){ 
			size = arr2.length; 
		}else{ 
			size = arr1.length; 
		} 
		//�� �迭���� ��ġ�ϴ� ������ ������ ���ϴ� ���� 
		for(int i=0; i<size; i++){ 
			if(contain(arr2,arr1[i],size)){ 
				cnt++; 
			} 
		} 
		return cnt; 
	} 
	/* ��� : ��÷�迭�� �ڵ������迭�� �־����� ������� �˷��ִ� �޼ҵ�(�� ���� -1) 
	 * �Ű����� : �� �迭=>int []lotto, int []auto 
	 * ����Ÿ�� : ���=>int 
	 * �޼ҵ�� : rank 
	 * */ 
	public static int rank(int []lotto, int[]auto){ 
		int cnt = compareArr(lotto, auto); 
		switch(cnt){ 
		case 6:	return 1; 
		case 5: 
			/*switch(contain2(auto,lotto[lotto.length-1],auto.length)){ 
			case -1:	return 3; 
			default:	return 2; 
			}*/ 
			if(contain(auto,lotto[lotto.length-1],auto.length)){ 
				return 2; 
			}else 
				return 3; 
		case 4: return 4; 
		case 3: return 5; 
		default:return -1; 
		} 
	} 
	public static void printRank(int r){ 
		if(r == -1){ 
			System.out.println("��"); 
		}else{ 
			System.out.println(r+"��"); 
		} 
	} 
} 