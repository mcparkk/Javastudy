package ch04;
//score가 2의 배수인 경우 “짝”, 3의 배수인 경우 “쿵”, 2의 배수이면서 3의 배수인 경우 “쿵짝”,
//그 외의 경우는 score가 출력되도록 코드 작성

public class Exam4_2 {
	public static void main(String[] args) {
		int score = 24;
		if (score % 6 ==0) {
			System.out.println("쿵짝");
		}
		else if(score %2 ==0) {
			System.out.println("짝");
		}
		else if(score % 3 ==0){
			System.out.println("쿵");
		}
		// 코드 작성
	}
}
