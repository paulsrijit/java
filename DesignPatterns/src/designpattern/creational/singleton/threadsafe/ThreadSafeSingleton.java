package designpattern.creational.singleton.threadsafe;

import java.io.Serializable;

public class ThreadSafeSingleton implements Serializable {

	private static final long serialVersionUID = 382038964562423155L;

	private static ThreadSafeSingleton INSTANCE;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ThreadSafeSingleton() {
	}

	public synchronized static ThreadSafeSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadSafeSingleton();
		}
		return INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
