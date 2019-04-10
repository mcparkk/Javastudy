package ch12;

import java.util.Scanner;

/*회원가입을 하면서아이디를 입력 받으려고 하는데 서비스의 정책 상 아이디에
대문자와 소문자가 모두 사용되어야 한다.
사용자로부터 입력받은 아이디를 검사하는 코드를 작성하시오.*/
public class String12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);				//키보드 입력
		String id = s.nextLine();						// id는 키보드로 입력된 텍스트

		boolean isUpper = false;
		boolean isLower = false;

		/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */
		
		for (int i = 0; i <id.length(); i++) {
			char c = id.charAt(i);
			// 문자열 변수 c
			// System.out.print(c);

			/* ASCII_A 등 미리 정의되어 있는 아스키 코드 상수를 이용하여 */
			/* 대문자와 소문자 입력 여부 확인 */
			if ((int) c >= ASCII_a && (int) c <= ASCII_z) {
				isLower = true;
			}
			if ((int) c >= ASCII_A && (int) c <= ASCII_Z) {
				isUpper = true;
			}
		}
		if (isUpper == true && isLower == true) {
			System.out.println("입력하신 아이디는 :" +id + "입니다.");
			System.out.println("정상 가입되었습니다.");
		} else {
			System.out.println("아이디를 확인해주세요");
		}

		/* 대문자와 소문자 입력 여부에 따라 결과 출력 */

		s.close();

	}
}