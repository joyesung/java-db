package nuli;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class day4월17일2 {

	public static void main(String[] args) {
		
		/*//숫자 야구 게임 
		중복되지 않은 1~9사이의 3개의 숫자를 맞추는 게임
		스트라이크: 자리수와 숫자가 일치하는 경우
		볼: 해당 숫자는있지만 자리수가 안맞는 경우
		3out: 일치하는 숫자가 없는 경우
		3s: 전부다 일치==> 게임 종료

		com: 1,3,9
		1 2 3 
		1s 1b

		4 5 6
		3out
		7 8 9
		1s*/
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("숫자야구게임을 시작하시겠습니까? 1. start|| 2.exit");
			int game =  scan.nextInt();
			if(game==2){
				System.out.println("게임을 종료하겠습니다");
				break;
			}else
				System.out.println("게임을 시작하겠습니다.");
			int ballArray[] = new int [3];
			int userArray[] = new int [3];
			
			ballArray= initBallArray();
			while (true) {
				userArray = inputUserNumber();
				if(game(ballArray,userArray))
					break;
			}
			
		}
		
	}
	static int [] initBallArray(){
		Random r = new Random();
		
		int [] ballArr = {10, 10, 10
				};
		
		for (int i =0; i<ballArr.length;i++){
			int ball = r.nextInt(10);
			ballArr[i]=ball;
			
			for(int j =0; j<i;j++){
				if(ballArr[j] != ballArr[i]){
					continue;
				}else{
					i--;
					break;
				}
			}
			
		}
		return ballArr;
	}
	static int[] inputUserNumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요(중복불가)");
		int userNum = scan.nextInt();
		int num1, num2,num3;
		
		num1 = userNum / 100;
		num2 = (userNum/10) % 10;
		num3 = userNum%10;
		int [] userNumArray = {num1, num2, num3};
		
		return userNumArray;
		
	}
	static boolean game (int [] ballArray, int [] userArray){
		int strike = 0;
		int ball = 0;
		for(int i =0; i< ballArray.length; i++){
			for(int j=0; j<userArray.length; j++){
				if(ballArray [i] == userArray[j]){
					if(i==j){
						strike++;
					}else
						ball++;
				}
			}
		}
		
		
		System.out.println(strike+ "스트라이크 "+ ball+ "볼");
		if(strike==3){
			return true;
			
		}else 
		return false;
	}


	}

