package javapractice.basic;

public class AbstractDemo {

	public static void main(String[] args) {
		DemoAbstract absObj = new DemoAbstract("Srijit Paul") {
		};
		
		absObj.printName();
	}

}

abstract class DemoAbstract {
	private String name;

	public DemoAbstract(String name) {
		super();
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Name: "+name);
	}
}
