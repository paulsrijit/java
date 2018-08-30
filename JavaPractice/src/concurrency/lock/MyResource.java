package concurrency.lock;

import java.util.concurrent.locks.ReentrantLock;

public class MyResource {
	int i;
	public void increment() {
		
		i++;
	}
}
