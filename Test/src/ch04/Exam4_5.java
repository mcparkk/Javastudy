package ch04;

//1000 ������ �ڿ��� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ���
//��µ� ���ڵ��� ���� ���ϴ� �ڵ� �ۼ�

public class Exam4_5 {
	public static void main(String[] args) {

		int num = 0;

		for (int i = 0; i <= 1000; i++) {
			if (i % 14 == 0) {
				
				System.out.println(i);
			}
			num += i;
			System.out.println(num);
		}
	}
}
