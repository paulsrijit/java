package javapractice.basic;

public class InterfaceDemo {

	public static void main(String[] args) {
		I1 obj1 = new C11();
//		obj1.m1();
//		obj1.m2();
		
		I2 obj2 = new C22();
//		obj2.m1();
//		obj2.m2();
		
		I1 obj3 = new C22();
//		obj3.m1();
//		obj3.m2();
		
		C11 obj4 = new C22();
//		obj4.m1();
//		obj4.m2();
		
		C22 obj4_1 = new C22();
//		obj4_1.m1();
//		obj4_1.m2();
		
		I1 obj5 = new I2() {
			
			@Override
			public void m2() {
				System.out.println("javapractice.basic.InterfaceDemo.main(...).new I2() {...}.m2()");
				
			}
		};
//		obj5.m1();
//		obj5.m2();
		
		I1 obj6 = new I1() {
			
			@Override
			public void m2() {
				System.out.println("javapractice.basic.InterfaceDemo.main(...).new I1() {...}.m2()");
				
			}
		};
//		obj6.m1();
//		obj6.m2();
		
		I2 obj7 = new I2() {
			
			@Override
			public void m2() {
				System.out.println("javapractice.basic.InterfaceDemo.main(...).new I2() {...}.m2()");
				
			}
		};
		obj7.m1();
		obj7.m2();

	}

}

interface I1 {
	default void m1() {
		System.out.println("javapractice.basic.I1.m1()");
	}
	
	void m2();
}

interface I2 extends I1 {
	default void m1() {
		System.out.println("javapractice.basic.I2.m1()");
	}
	
	void m2();
}

class C11 implements I1 {

	@Override
	public void m2() {
		System.out.println("javapractice.basic.C11.m2()");
		
	}
	
}

class C22 extends C11 implements I2  {

	@Override
	public void m2() {
		System.out.println("javapractice.basic.C22.m2()");
		
	}
	
}
