package ch05;

public class array_Exam5 {
	public static void main(String[] args) {
		
	
	int[][] arr = new int[][]{
		 {1, 2, 3},
		 {4, 5, 6},
		 {7, 8, 9, 19},
		 {10, 11, 12}
		};
		
		System.out.println(arr[1][1]);		//5
		System.out.println(arr[2][2]);  	//9
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}