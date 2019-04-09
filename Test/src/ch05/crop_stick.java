package ch05;
////각각 0이상의 정수를 길이로 하는 N개의 막대기가 있다.

//이 막대기들 중 가장 짧은 막대기의 길이로
//모든 막대기를 자르는 것을 [cut operation]이라고 한다.
//예를 들어 6개의 막대기가 있고 그 길이가 다음과 같다면
//5 4 4 2 2 8
//이 경우 [Cut Operation]을 한번 수행하면 다음과 같다.
//3 2 2 6
//(가장 짧은 길이인 2로 6개의 막대기를 잘라내고 길이가 0이 되어버린
//2개의 막대기는 버려진다.)
//N개의 막대기와 그 각각의 길이가 주어졌을 때
//[Cut Operation]을 모든 막대기가 버려질 때(길이가 0이 될때)까지
//반복하고 수행 시 마다 남은 막대기의 수를 출력하는
//프로그램을 작성하시오.

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