package ch18;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		while(true) {
			int num = (int)(Math.random() *45)+1;
			lotto.add(num);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		
		
		
		
//		String[] arr = new String[3];
//		arr[0] = "kim";
//		String value = arr[0];
//		
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		
//		ArrayList list = new ArrayList<String>();
//		list.add("kim");
//		String value2 = (String) list.get(0);
//		
	}
}
