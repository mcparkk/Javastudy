package ch12;

public class indexOf {
	public static void main(String args[]) {
		 
		
					//012345'6789'	//'����
		String str = " Java ������ �缺�� ���� ����������!!";
		 int idx = -1;         //str.indexOf(" ");
		 //System.out.println(idx);
		 
		 while(true) {
			 idx = str.indexOf(" ", idx + 1);
			 if(idx == -1) {
				 break;
			 }
			 System.out.println(idx);
		 }
		 
	
//		 idx = str.indexOf(" ", idx+1);
//		 System.out.println(idx);
//		 
//		 idx = str.indexOf(" ", idx+1);
//		 System.out.println(idx);
//		 		 
//		 idx = str.indexOf(" ", idx+1);
//		 System.out.println(idx);
//	
	}
	
}
