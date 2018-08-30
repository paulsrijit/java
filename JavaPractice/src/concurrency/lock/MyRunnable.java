package concurrency.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

	MyResource r;
	ReentrantLock lock;

	public void setResource(MyResource r) {
		this.r = r;
		lock = new ReentrantLock();
	}

	@Override
	public void run() {

		try {
			if (lock.tryLock(5, TimeUnit.SECONDS)) {
				for (int j = 0; j < 10000; j++) {
					r.increment();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

}
