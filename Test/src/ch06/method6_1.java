package ch06;

public class method6_1 {
	public static void main(String[] args) {
		int result1 = plus(5, 3);
		 System.out.println("plus => " + result1);

		 int result2 = minus(5, 3);
		 System.out.println("minus => " + result2);
	}
	public static int plus(int num1, int num2) {
		
		return num1 + num2;
	}
	public static int minus(int num1, int num2) {
		int result2 = num1 - num2;
		return result2;
	}
}
// 출력결과 	plus = 8
//   		minus = 2