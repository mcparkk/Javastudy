package ch04;

public class Exam4_8_ans {
	public static void main(String[] args) {
int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			int n = i;
			while (n > 0) {
				int n2 = n % 10;
				if (n2 == 3) {
					count += 1;
					System.out.print(i);
					System.out.println("  : 3이 포함");
//					break;
				}
				n = n / 10;
			}
		}
		System.out.print(count + " :차수");
			
	}
}