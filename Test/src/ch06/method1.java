package ch06;

public class method1 {
	public static char sum(int a, char c) {
//		System.out.println(2);
		char trans = (char)(c + a);			//인트형 강제변환
//		System.out.println(trans);
		return trans;
	}
	
	public static void main(String[] args) {
	 System.out.println();
		
//		System.out.println(1);
		char ch = sum(2, 'A'); 
//		System.out.println(3);
	}
}
