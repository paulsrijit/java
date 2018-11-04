package javapractice.overloading.example2;

public class OverloadingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTest2 obj = new OverloadingTest2();
		obj.method1(10);
		obj.method1("Srijit");
		
	}
	
	void method1(int i) {
		System.out.println(i);
	}
	
	static void method1(String s) {
		System.out.println(s);
	}
	
	//This can't exist
	/*void method1(String s1) {
		System.out.println(s1);
	}*/

}
