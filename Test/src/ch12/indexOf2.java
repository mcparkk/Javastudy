package ch12;

public class indexOf2 {
	public static void main(String args[]) {

		           // 01234'5678'9 //'띄어쓰기
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int sidx = 0; // start
		int eidx = 0; // end

		while (true) {
			eidx = str.indexOf(" ", sidx + 1);
			if (eidx == -1) {
				break;
			}
			System.out.println(sidx + "," + eidx);
			sidx = eidx;
		}

	}

}
