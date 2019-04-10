package ch05;

public class cropstick_logic {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		int count = 0;
		// 1. 0보다 큰 배열 요소의 개수를 출력
		for (int i = 0; i < stick.length; i++) 
		{
			if(stick[i] >0)
			{
				//개수 세기
				count++;
			}
		}
		int min = 0;
		min = Integer.MAX_VALUE; 	// 최솟값
		// 2. 배열 요소중에서 0을 제외하고 가장 적은 수를 찾아냄
		for (int i = 0; i < stick.length; i++)
		{
				if(stick[i] < min && stick[i] > 0)
				{
					min = stick[i];
				}
		}
		// 출력해보기 for-each
//		for(int value : stick)
//		{
//			System.out.println(value);
//		}
		// 3. 가장 적은 수로 모든 배열 요소 값을 감소
		for (int i = 0; i < stick.length; i++) 
		{
			stick[i] = stick[i] - min;
		}
		// 출력해보기 for-each
//		for(int value : stick)
//			{
//				System.out.println(value);
//			}
		
	}
}
}
