package ch05;
// �迭�� �ּҰ� ���ϱ�



// �ִ��� integer.min & if �� �ε�ȣ �ݴ� 
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
		 System.out.println("�ּҰ� : " + min);
		 }
		}