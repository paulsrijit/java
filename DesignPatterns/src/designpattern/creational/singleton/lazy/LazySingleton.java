package designpattern.creational.singleton.lazy;

public class LazySingleton {

	private static LazySingleton INSTANCE;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazySingleton();
		}
		return INSTANCE;
	}
}
