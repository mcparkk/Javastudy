package ch04;

//1 ~ 1000 ������ ���� �� 3�� �����ϰ� �ִ� ���ڸ� ���
public class Exam4_8 {

	public static void main(String[] args) {
		int n;
		// 999
		for (int i = 1; i <= 1000; i++) {
			n = i;
			while (n > 0) {
				if (n % 10 == 3) {
					System.out.print(i);
					System.out.println(": 3 ����");
					break;  // �Ŀ� �����ϸ� while���� �������´�.
				}
				n /= 10;
			}

		}
	}
}
