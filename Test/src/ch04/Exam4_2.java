package ch04;
//score�� 2�� ����� ��� ��¦��, 3�� ����� ��� ������, 2�� ����̸鼭 3�� ����� ��� ����¦��,
//�� ���� ���� score�� ��µǵ��� �ڵ� �ۼ�

public class Exam4_2 {
	public static void main(String[] args) {
		int score = 24;
		if (score % 6 ==0) {
			System.out.println("��¦");
		}
		else if(score %2 ==0) {
			System.out.println("¦");
		}
		else if(score % 3 ==0){
			System.out.println("��");
		}
		// �ڵ� �ۼ�
	}
}
