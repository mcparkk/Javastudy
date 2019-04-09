package ch05;
//배열 nums 각 요소의 순서가 랜덤으로 섞일 수 있도록 코드 작성

public class attay_exam4_3 {
	public static void main(String[] args) {

		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		for (int i = 0; i < nums.length; i++) {
			// 코드 작성
			char temp = ' ';		//character ' '
			int random = (int)(Math.random() * 7);
			temp = nums[0];
			nums[0]	= nums[random];
			nums[random] = temp;			// temp -> char 변수명 사용 
			
			
			
		}

		System.out.println(nums);
	}

}
