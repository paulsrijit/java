package javapractice.basic;

public class StaticNestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.Inner1_1 i1_1 = new Outer1.Inner1_1();
		i1_1.m1();
		Outer1 o1 = new Outer1();
		o1.m2();
	}

}

/*static class StaticCls{//Not permitted
	
}*/

class Outer1{
	
	public String name;
	public static int age;
	
	
	static class Inner1_1{//only permitted when nested 
		public static String role="dev";
		void m1() {
			//name = "Srijit";//can't access not static member of parent
			age = 30;//permitted
			System.out.println("age is set");
		}
	}
	
	static {
		System.out.println("inside static block");
	}
	
	void m2() {
		Inner1_1 i11 = new Inner1_1();
		System.out.println(Inner1_1.role);
		i11.m1();
	}
}


