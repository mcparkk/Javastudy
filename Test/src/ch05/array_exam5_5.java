package ch05;
//배열의 항목 합과 평균 구하기
public class array_exam5_5 {
	public static void main(String[] args) {
		int[][] arr = {
				 {95, 86},
				 {83, 92, 96},
				 {78, 83, 93, 87, 88}
				 };

				 int sum = 0;
				 double avg = 0.0;
				 int count = 0;
				 // 코드 작성
				 for (int i = 0; i < arr.length; i++) {
					 for (int j = 0; j < arr[i].length; j++) {
						 sum += arr[i][j];
						 count++;		//실행횟수 => [i][j]의 총 갯수
						}
				}
				 
				 avg = (double)sum / count;

				 System.out.println("합 : " + sum);
				 System.out.println("평균 : " + avg);
				 }
				}
