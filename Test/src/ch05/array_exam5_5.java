package ch05;
//�迭�� �׸� �հ� ��� ���ϱ�
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
				 // �ڵ� �ۼ�
				 for (int i = 0; i < arr.length; i++) {
					 for (int j = 0; j < arr[i].length; j++) {
						 sum += arr[i][j];
						 count++;		//����Ƚ�� => [i][j]�� �� ����
						}
				}
				 
				 avg = (double)sum / count;

				 System.out.println("�� : " + sum);
				 System.out.println("��� : " + avg);
				 }
				}
