package ch05;
// 배열의 최소값 구하기



// 최댓값은 integer.min & if 절 부등호 반대 
public class attay_exam3 {
	public static void main(String[] args) {
		 int[] numbers = {3, 2, 1, 7, 4};

		 int min = Integer.MAX_VALUE;
		 System.out.println(min);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		 System.out.println("최소값 : " + min);
		 }
		}