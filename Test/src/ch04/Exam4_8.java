package ch04;

//1 ~ 1000 사이의 숫자 중 3을 포함하고 있는 숫자를 출력
public class Exam4_8 {

	public static void main(String[] args) {
		int n;
		// 999
		for (int i = 1; i <= 1000; i++) {
			n = i;
			while (n > 0) 
			{
				if (n % 10 == 3) {
					System.out.print(i);
					System.out.println(": 3 포함");
					break;  // 식에 성립하면 while문을 빠져나온다.
				}
				n /= 10;	// 계속 나누다 보면 0이 되어 while 문을 빠져나온다.!!
			}

		}
	}
}
