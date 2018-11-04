package javapractice.overloading.example1;

public class OverloadingTest {

	public static void main(String[] args) {		
		B obj = new C();
		meth1(obj);
	}
	
	static void meth1(Object o) {
		System.out.println("Object");
	}
	
	static void meth1(A a) {
		System.out.println("A");
	}
	
	/*static void meth1(B b) {
		System.out.println("B");
	}*/
	
	static void meth1(C c) {
		System.out.println("C");
	}
	
	

}

class A {

}

class B extends A {

}

class C extends B {

}
