package designpattern.structural.adapter.example1;

public class MainClass {

	public static void main(String[] args) {
		SocketAdapter adapter = new SocketAdpaterImpl();
		
		System.out.println(adapter.get12Volt().getVolts());
		
		System.out.println(adapter.get3Volt().getVolts());

	}

}
