package ch05;
//�迭 nums �� ����� ������ �������� ���� �� �ֵ��� �ڵ� �ۼ�

public class attay_exam4_3 {
	public static void main(String[] args) {

		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		for (int i = 0; i < nums.length; i++) {
			// �ڵ� �ۼ�
			char temp = ' ';		//character ' '
			int random = (int)(Math.random() * 7);
			temp = nums[0];
			nums[0]	= nums[random];
			nums[random] = temp;			// temp -> char ������ ��� 
			
			
			
		}

		System.out.println(nums);
	}

}
