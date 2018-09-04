package java8practice.misc;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		OldContarct obj = new OldImpl();
		obj.newDefaultImpl1();
		obj.newDefaultImpl2();
		obj.oldContarct1();
		
		OldContarct obj2 = new NewImpl();//
		obj2.newDefaultImpl2();
	}

}

interface OldContarct {
	void oldContarct1();
	
	default void newDefaultImpl1() {
		System.out.println("newDefaultImpl1 print");
	}
	
	default void newDefaultImpl2() {
		System.out.println("newDefaultImpl2 print");
	}
}

class NewImpl implements OldContarct {

	@Override
	public void oldContarct1() {
		// TODO Auto-generated method stub
		
	}
	
}

class OldImpl implements OldContarct {

	@Override
	public void oldContarct1() {
		System.out.println("oldContarct1 impl print");
	}
	
	@Override
	public void newDefaultImpl2() {
		System.out.println("newDefaultImpl2 overridden print");
	}
}
