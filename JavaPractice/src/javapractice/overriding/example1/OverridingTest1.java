package javapractice.overriding.example1;

public class OverridingTest1 {

	public static void main(String[] args) {
		Ot2 obj = new Ot2();
		//obj.m1();
		
		Ot2.m1();

	}

}

class Ot1{
	static void m1() {
		System.out.println("Ot1.m1");
	}
}

class Ot2 extends Ot1{
	//trying to override static method using a non-static signature, not possible	
	/*void m1() {
		System.out.println("m1");
	}*/
	
	static void m1() {
		System.out.println("Ot2.m1");
	}
}
