package ch05;
////���� 0�̻��� ������ ���̷� �ϴ� N���� ����Ⱑ �ִ�.

//�� ������ �� ���� ª�� ������� ���̷�
//��� ����⸦ �ڸ��� ���� [cut operation]�̶�� �Ѵ�.
//���� ��� 6���� ����Ⱑ �ְ� �� ���̰� ������ ���ٸ�
//5 4 4 2 2 8
//�� ��� [Cut Operation]�� �ѹ� �����ϸ� ������ ����.
//3 2 2 6
//(���� ª�� ������ 2�� 6���� ����⸦ �߶󳻰� ���̰� 0�� �Ǿ����
//2���� ������ ��������.)
//N���� ������ �� ������ ���̰� �־����� ��
//[Cut Operation]�� ��� ����Ⱑ ������ ��(���̰� 0�� �ɶ�)����
//�ݺ��ϰ� ���� �� ���� ���� ������� ���� ����ϴ�
//���α׷��� �ۼ��Ͻÿ�.

public class crop_stick {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };

		for (int i = 0; i < stick.length; i++) {
			
		
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < stick.length; i++) {
			if (stick[i] < min) {
				min = stick[i];
			}
		}
		}
//		System.out.println(min);
//		int max = Integer.MAX_VALUE;
//
//		for (int i = 0; i < stick.length; i++) {
//			if (stick[i] > min) {
//				max = stick[i];
//			}
//		}
//		System.out.println(max);
	}
}