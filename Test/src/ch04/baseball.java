package ch04;

import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		Number n = new Number();
		int number = n.get();
		
		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;
		int baseball1 = (number / 10 / 10) % 10;

		Scanner s = new Scanner(System.in);
		int inputNumber1 = s.nextInt();
		int inputNumber2 = s.nextInt();
		int inputNumber3 = s.nextInt();
		
		int strike = 0; // 스트라이크를 개수를 저장할 변수
		int ball = 0; // 볼의 개수를 저장할 변수
		
		
		if(inputNumber1 ==baseball1) {
			strike++; // strike = strike + 1;
		}
		else if (inputNumber1 == baseball2 || inputNumber1 == inputNumber3){
			ball++;
		}
		if(inputNumber2 ==baseball2) {
			strike++; // strike = strike + 1;
		}
		else if (inputNumber2 == baseball1 || inputNumber2 == inputNumber3){
			ball++;
		}
		if(inputNumber3 ==baseball3) {
			strike++; // strike = strike + 1;
		}
		else if (inputNumber3 == baseball1 || inputNumber3 == inputNumber2){
			ball++;
		}
		
		if(strike == 0 && ball == 0)
			System.out.println("아웃");
		/* 코드 작성
		   스트라이크와 볼 검사 조건문 작성 
		*/
		
		System.out.println("스트라이크 => " + strike);
		System.out.println("볼 => " + ball);
	}
}

