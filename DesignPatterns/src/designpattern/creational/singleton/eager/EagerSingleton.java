package designpattern.creational.singleton.eager;

public class EagerSingleton {
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	private EagerSingleton() {
		System.out.println("EagerSingleton const");
	}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
