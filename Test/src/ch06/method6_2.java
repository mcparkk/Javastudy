package ch06;

public class method6_2 {
	public static void main(String[] args) {
		int n = 100;
		int total = getTotal(n);
		System.out.println("1~" + n + "�������� : " + total);
	}
	//���������� - 23���� ������ �ִ�.
	public static int getTotal(int num) {
		int total = 0;
		for (int i = 0; i <= num; i++) {
			total += i;
		}
		return total;
	}
}
