package javapractice.overloading.example3;

public class OverloadingTest3 {

	public static void main(String[] args) {
		new Y().method((byte)1);
		new Y().method((short)1);
		new Y().method(1);
		new Y().method(1L);
		new Y().method(1.0);
	}

}

class X {
	
	void method(byte num) {
		System.out.println("Byte");
	}
	
	void method(short num) {
		System.out.println("Short");
	}
	
	void method(int num) {
		System.out.println("Int");
	}
	
	void method(long num) {
		System.out.println("Long");
	}
	
	void method(double num) {
		System.out.println("Double");
	}
}

class Y extends X {
	@Override
	void method(double num) {
		System.out.println("Override Double");
	}
}
