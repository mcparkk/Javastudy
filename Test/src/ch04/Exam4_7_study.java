package ch04;

public class Exam4_7_study {
	public static void main(String[] args) {
		int leftSpace = 4;
		int rightSpace = 6;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= leftSpace || j >= rightSpace) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (i < 5) {
				leftSpace -= 1;
				rightSpace += 1;
			} else {
				leftSpace += 1;
				rightSpace -= 1;
			}
			System.out.println();
		}

	}
}
