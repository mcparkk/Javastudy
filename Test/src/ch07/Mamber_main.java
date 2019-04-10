package ch07;

public class Mamber_main {
	
	int age = 0;
	
	
	void method() {
		age = age +1;
		int age2 = 0;
		age2 = age2 +1;
	}
	
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "ggoreb";
		m1.age = 100000;
		System.out.println(m1);		//인스턴스 출력
		
		Member m2 = new Member();
		m1.id = "ggoreb";
		System.out.println(m2);		//인스턴스 출력
		
	}
}