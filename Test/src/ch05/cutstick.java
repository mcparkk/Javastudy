package ch05;

public class cutstick {
	public static void main(String[] args) {
		int[] stick = { 1, 2, 3, 4, 3, 3, 2, 1};
		while (true) {
			int count = 0;
			int min = 0;
			
			for (int i : stick) {
				if (i > 0) {
					count++;
				    min = i;
                }
			}
			
           if(count == 0)
               break;
​
			System.out.println(count);
           
			for (int i : stick) {
				if (min > i && i > 0)
					min = i;
			}
​
			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
		}
	}
}
