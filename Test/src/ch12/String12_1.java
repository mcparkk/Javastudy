package ch12;

import java.util.Scanner;

/*ȸ�������� �ϸ鼭���̵� �Է� �������� �ϴµ� ������ ��å �� ���̵�
�빮�ڿ� �ҹ��ڰ� ��� ���Ǿ�� �Ѵ�.
����ڷκ��� �Է¹��� ���̵� �˻��ϴ� �ڵ带 �ۼ��Ͻÿ�.*/
public class String12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);				//Ű���� �Է�
		String id = s.nextLine();						// id�� Ű����� �Էµ� �ؽ�Ʈ

		boolean isUpper = false;
		boolean isLower = false;

		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		
		for (int i = 0; i <id.length(); i++) {
			char c = id.charAt(i);
			// ���ڿ� ���� c
			// System.out.print(c);

			/* ASCII_A �� �̸� ���ǵǾ� �ִ� �ƽ�Ű �ڵ� ����� �̿��Ͽ� */
			/* �빮�ڿ� �ҹ��� �Է� ���� Ȯ�� */
			if ((int) c >= ASCII_a && (int) c <= ASCII_z) {
				isLower = true;
			}
			if ((int) c >= ASCII_A && (int) c <= ASCII_Z) {
				isUpper = true;
			}
		}
		if (isUpper == true && isLower == true) {
			System.out.println("�Է��Ͻ� ���̵�� :" +id + "�Դϴ�.");
			System.out.println("���� ���ԵǾ����ϴ�.");
		} else {
			System.out.println("���̵� Ȯ�����ּ���");
		}

		/* �빮�ڿ� �ҹ��� �Է� ���ο� ���� ��� ��� */

		s.close();

	}
}