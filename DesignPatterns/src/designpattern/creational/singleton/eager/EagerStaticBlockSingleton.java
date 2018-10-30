package designpattern.creational.singleton.eager;

public class EagerStaticBlockSingleton {
	
	private static EagerStaticBlockSingleton INSTANCE;

	private EagerStaticBlockSingleton() {
		System.out.println("EagerStaticBlockSingleton const");
	}

	static {
		try {
			INSTANCE = new EagerStaticBlockSingleton();
		} catch (Exception ex) {
			throw new RuntimeException("Exception occured while creating instance: " + ex);
		}
	}

	public static EagerStaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
