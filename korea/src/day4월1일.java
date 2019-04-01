import java.util.Scanner;

public class day4월1일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i, j;
		for(i=1; ; i++){
			if(i>3){
				break;
			}
			for(j=1; ; j++){
				if(j>5){
					break;
	
				}
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//for(1.초기화; 2.5.8.조건식; 4.7.증감연산){
/*		*           3.6.실행문;
	      }
		
		  1. 초기화;
		   while(2.5.조건식){
			     3.6.실행문;
			     4.7.증감연산;
		   }
*/	    /*  while(ture){
	             실행문;
                }

		
		*/
		
         /*int i, sum;
         i=1;
         sum=0;
         while(i<=10){
        	   sum += i;
        	   i++;
        	   System.out.println(sum);
         }
		*/
		
		/* for, while : 조건식에 따라 한번도 실행되지 않을 수 잇다.
		 * do while : 조건식에 다라 무조건 1번은 실행 된다.
		 * do{
		 *        실행문;
		 *  }while(조건식);
		 */
		
		/*int menu;
		Scanner scan=new Scanner(System.in);
	    do{
	    	System.out.println("메뉴");
	    	System.out.println("1.학생정보 추가");
	    	System.out.println("2.학생정보 수정");
	    	System.out.println("3.학생정보 삭제");
	    	System.out.println("4.학생정보 확인");
	    	System.out.println("5.종료");
	    	System.out.println("메뉴를 선택하세요 : ");
	    	menu = scan.nextInt();
	     }while(menu != 5);
	    scan.close();
	    */
		
		// 배열은 같은 의미를 가지는 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		//묶음으로 다루는것
		// 배열의 장점: 물리적으로 연속된 공간으로 배열을 생성하기 때문에 접근이 빠르다.
		// 정수령 변수를 국어, 영어, 수학, 체육성정과 학변, 반, 번호를
		//저장하기 위해서 배열로 만든다.
		//학생 7명의 정수형 변수 국어 성적을 배열로 만든다
		// 자료형 [] 배열 이름; // 배열을 선언
		// 배열이름=new 자료형 [배열의 크기]; // 배열생성
		//자료형 배열 이름[]; // 배열을 선언
		// 배열이름=new 자료형 [배열의 크기]; // 배열생성
		//배열의 시작은 0번지부터이다.
		//배열의 마지막 번지는 배열의 크기-1번지까지이다.
		//배열은 주로 반복문과 사용된다.
	    //잘못된 번지로 접근하면 예외가 발생한다.
		//배열 이름 . length : 배열의 크기를 알려줌
		//자로형 [] 배열이음 = new int[]{값1, 값2,값3...};
		//자료형[] 배열이름 = {값1, 값2, 값3...};
		
	/*	int [] kor;
		kor= new int[10]; //int [] kor = new int[10];
		kor[0] = 10;
        System.out.println(kor[0]);
        System.out.println(kor[9]);
       //System.out.println(kor[10]);//예외바생
		int i;
        for(i=0; i<kor.length; i++){
			System.out.println(i+"번지 : " + kor[i]);
		}*/
        /*Scanner scan = new Scanner(System.in);
        for(i=0; i<3; i++){
        	kor[i] = scan.nextInt();
        	
        }
		scan.close();*/
	/*	int[] eng;
		eng = kor;
		  for(i=0; i<eng.length; i++){
				System.out.println(i+"번지 : " + eng[i]);
			}
		
		eng[9] = 100;
		  for(i=0; i<eng.length; i++){
				System.out.println(i+"번지 : " + kor[i]);
		  }
		
		eng = new int[10]; //eng배열 생성
		//kor 배열의 값을 eng 배열에 복사
		for(i=0; i<eng.length; i++){
			eng[i] = kor[i];
		}*/
		
		//1. 7개를 저장할 수 있는 정수형 배열을 생성하고 각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드를 작성하세요.
		//2. 7개의 정수형 배열을 생성하고 0번지에는 0, 1번지에는 1..
        //  6번지에는 6을 넣는 코드를 작성하세요
		
       /* int [] eng;        
        eng = new int[7];
       
        eng[6] = 6;
        eng[0] = 0;
        eng[1] = 1;
        int i=0;
        for(i=0; i<eng.length; i++){
        	System.out.println(i+"번지: " + eng[i]);
        }
       
        int i=0;
        for(i=0; i<eng.length; i++){
        	eng[i]= i;
        	System.out.println(eng[i]);
        }
        
        */
		
		
		/*int [] age;
		age = new int[7];
		int i = 0;
		for(i=0; i<7; i++){
			int j=(int)(Math.random()*(45-1+1))+1;
			
		System.out.println(age[i]);
		}*/
		
		
		/*
		int [] age;
		age = new int[7];
		int i = 0;
		for(i=0; i<age.length; i++){
			int j=(int)(Math.random()*(45-1+1))+1;
			age[i]=j;
			System.out.println(age[i]);
		}
		
		*/
		
		/*
		
		int i=0;
        for(i=0; i<eng.length; i++){
        	eng[i]= i;
        	System.out.println(eng[i]);
		*/
		
		//변수의 유효범위 
		//일반 변수는 선언되면 해당 변수를 감싸고 있는 괄호안에서 유효하다.
		/*int num;
		for(int i = 0; i<10; i++){
			System.out.println(i);
		}
		for(int i= 0; i<5; i++){
			System.out.println(i);
		}
		*/
		/*int []arr = new int[5];
		for(int i=0; i<arr.length; i++){
		  arr[i] = i;	
		}
		int search = 4;*/
		// 배열 : 0 1 2 3 4
		//배열에 있는 모든 값을 확인하여 
		//배열의 값과 검색값이 같으면 find를 true로 변경 후 반복문을 종료 
		//없으면 계속 진행
		// 변수 search의 값이 배열 arr에 있는지없는지를 나타내는 변수
		
		    	
		
		
		/*int [] arr;
		arr = new int[7];
		int i = 0;
		for(i=0; i<arr.length;){
			int r=(int)(Math.random()*(7-1+1))+1;
			age[i]=j;
			//System.out.println(age[i]);
			boolean find = false;
			for(int j=0; j<arr.length; j++){
			    if(arr[j]== r){
			    	find = true;
			    	break;
			    }
			}	
			if(!find){//find==false
				arr[i] = r;
				i++;
			}
		
		}
		for(int k=0; k<arr.length;k++){
			System.out.println(arr[k]);
		}
		*/
		
		//a~z, A~Z, 0~9로 조합된 8자리의 임시 비밀번호 발급하는 예제
		//a~z : 26가지 A~Z: 26가지 0~9 : 10개 
		//62개, 0~61
		//0~9 : '0'~'9'
		//10~ 35: 'a'~'z'
		//36~61: 'A'~'Z'
		//랜덤한 수가 60 : 'Y'
		
	/*	char []pw = new char[8];
		for(int i=0; i<pw.length; i++){
			int r= (int)(Math.random()*(61+1));
			if(r<=9){
				//문자 + 정수 + = 정수
				//문자 = 정수;//(불가능)
				//문자 = (char)정수;//(가능)
				pw [i] = (char)('0'+r);
			}else if(r<=35){
				pw [i] = (char)('a'+(r-10));
			}else{
				pw [i] = (char)('A'+(r-36));
			}
		}
		for(int i=0; i<pw.length; i++){
			
		}
		System.out.println(pw);*/
		
		//4. 있으면 아무일도 하지 않는다.

		//abcd...z
		/*int numA = 'a';
		int numB = 'b';*/
		/*System.out.println(numA);//97
		//문자 a에 대한 유니코드 정수값
		System.out.println(numB);//98
		//문자 B에 대한 유니코드 정수값
		numA='A';//자동형변환큰거에서작은거로 갈때는 자동형변환(자료형변환)
		numB='B';
		System.out.println(numA);//65
		//문자 A에 대한 유니코드 정수값
		System.out.println(numB);//66
		//문자 B에 대한 유니코드 정수값
		int num =100;//'d'
		System.out.println((char)num);*/
		
		/*for(int i =97; i<= 97+25; i++){
			System.out.print((char)i);
			//97이 a라는 것을 이용하여 a~z까지 출력하는 예제
		}
		
		System.out.println();*/
		
		
		/*for(int i ='a'; i<='z'; i++){
			System.out.print((char)i);
		
		}
		
		System.out.println();
		
		for(int i =0; i<=25; i++){
			System.out.print((char)('a'+i));
		}*/
		/*int [] arr1,arr2;
		int arr3[],arr4;
		arr1 = new int[3];//배열
		arr2 = new int[3];//배열
		arr3 = new int[3];//배열
		
		//arr4=new int[3]; // arr4:int arr4는 일반 변수
		int[]arr5;
		int arr6[];
		
		
		// 두 수 공약수들을 배열에 저장하여 출력하는 코드를 작성하세요.
		// 공약수는최대 10까지 저장
		*/
		
		
		/*int num1=8, num2=12;
		int i;
		int [] arr= new int[10]; 
		int cnt = 0;
		for(i=1; i<=num1; i++){
			if(cnt ==10){
				break;
			}
			if(num1 % i== 0 && num2 % i == 0){
				arr[cnt]=i;//추가된 부분
				cnt++;//공약수 갯수를 하나 증가
				
			}
		}
		for(int j=0; j<cnt; j++){
			System.out.print(arr[j]+ " ");
			
				
			}
		*/
		
		
		//향상된 for문
		//배열의 모든 값들을 확인한다.
		//배열의 값을 수정할때에는 사용 불가
		// for(자료형 변수명 : 배열이름){
		        //실행문;
		//자료형은 배열과 같은 자료형을 써야 한다.
	    /*int []num = new int[]{1,2,3,4,5};
	    boolean find = false;
	    int search =6;
		for(int tmp :num){
			if(tmp== search){
				find= true;
				break;
			}
		}
		if(find){
			System.out.println("있음");
		
		}else{
			System.out.println("없음");
		}
			*/
	    //버블정렬: 단순하고 효율이 가장 안좋다
		int [] arr = new int [] {1,2,3,5,6,9,4,7,8,};
		//반복 횟수: 배열의 크기 - 1
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1; j++)
				if(arr[j]<arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
		
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
