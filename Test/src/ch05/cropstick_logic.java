package ch05;

public class cropstick_logic {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		int count = 0;
		// 1. 0���� ū �迭 ����� ������ ���
		for (int i = 0; i < stick.length; i++) 
		{
			if(stick[i] >0)
			{
				//���� ����
				count++;
			}
		}
		int min = 0;
		min = Integer.MAX_VALUE; 	// �ּڰ�
		// 2. �迭 ����߿��� 0�� �����ϰ� ���� ���� ���� ã�Ƴ�
		for (int i = 0; i < stick.length; i++)
		{
				if(stick[i] < min && stick[i] > 0)
				{
					min = stick[i];
				}
		}
		// ����غ��� for-each
//		for(int value : stick)
//		{
//			System.out.println(value);
//		}
		// 3. ���� ���� ���� ��� �迭 ��� ���� ����
		for (int i = 0; i < stick.length; i++) 
		{
			stick[i] = stick[i] - min;
		}
		// ����غ��� for-each
//		for(int value : stick)
//			{
//				System.out.println(value);
//			}
		
	}
}
}
