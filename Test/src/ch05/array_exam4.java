package ch05;

// 버블정렬 선택정렬
public class array_exam4 {
	public static void main(String[] args) {

		char[] chars = { 'b', 'e', 'z', 'a', 'w' };

		char temp = ' ';
		for (int i = 0; i < chars.length; i++) {
			for (int j = i; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}
		}
		System.out.println(chars);
	}
}