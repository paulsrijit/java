package javapractice.basic;

public class FinalDemo {

	public static void main(String[] args) {
		D d = new D();
		d.m2();

	}

}

/*class A extends B{// not permitted since A is final
	
}*/

final class B {
	
}

class C {
	final void m1() {
		System.out.println("m1 method in C");
	}
}

class C1 extends C {
	/*void m1() {// not permitted since m1 method is final
		System.out.println("m1 method in C1");
	}*/
}

class Student {
	String name = "Srijit Paul";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}

class D {
	/*final int i;// i must be initialized

	public D(int i) {
		super();
		this.i = i;// that means either here
	}*/
	
	/*final static int i;
	static {
		i = 5; // or here (if i is static)
	}*/
	
	final int i = 5;// or at the very beginning where i is declared
	
	/*void m1() {
		i = 6;// not permitted to assign further value since it's final and already initialized
	}*/
	
	final Student s = new Student();
	void m2() {
		System.out.println(s.toString());
		s.setName("Tamojit Paul");//changing final objects state is permitted.
		System.out.println(s.toString());
		
		
		Student s2 = new Student();
		//s = s2; //but changing final objects reference is not permitted 
	}
	
}

