package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		// �ڵ� �ۼ�
		String[] s =file.split("/");
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("")) {
				
			}
			else {
				System.out.println("/"+s[i]);	
			}
			
		}
	}

}
