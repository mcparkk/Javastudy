package ch12;

public class substing_1 {
	public static void main(String args[]) {
		// 				  4    8   12	
		String str = "Java ������ �缺�� ���� ����������!!";
	
		int idx = 0;
		while(true) {
			idx = str.indexOf(" " + idx +1);
			if (idx == -1) {
				
				break;
			}
			System.out.println(str.substring(0, idx));
		}
		
	
	}
}
