package ch04;

public class bingo {
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 ==0) {
				System.out.println();
			}
		}
	}
}
