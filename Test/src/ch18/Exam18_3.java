package ch18;

import java.util.Iterator;
import java.util.TreeSet;

public class Exam18_3 {
	public static void main(String[] args) {
		// �ζ� ��ȣ�� ���� set ��ü ����
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		// ��ȣ 3�� �̸� ����(����)
		lotto.add(2);
		lotto.add(7);
		lotto.add(11);

		// �̸� ������ ��ȣ�� �����ϰ� ������ ���� ���� �� ����
// [�ڵ� �ۼ�]

		// ����(����)�� �ζ� ��ȣ Ȯ��(���)
		Iterator<Integer> iter = lotto.iterator();
		String seperator = "";
		while (iter.hasNext()) {
			System.out.print(seperator + iter.next());
			seperator = ", ";
		}
	}
}
