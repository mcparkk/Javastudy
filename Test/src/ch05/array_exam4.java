package ch05;

// 버블정렬 선택정렬
public class array_exam4 {
	char[] chars = { 'b', 'e', 'z', 'a', 'w' };
	char temp ='';
	for(int i = 0;i<chars.length-1;i++)
	{
		for (int j = i + 1; j < chars.length; j++) {
			if (chars[i] > chars[j]) {
				temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
			}

		}
	}System.out.println(chars);
}}