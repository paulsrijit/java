package concurrency.lock.producerconsumer;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer extends ProducerConsumer {
	
	public Consumer(List<Integer> list, ReentrantLock lock, Condition condition) {
		super(list, lock, condition);
	}

	public void consume() throws InterruptedException {
		while(true) {
			lock.lock();
			
			if(list.size() == 0) {
				condition.await();
			} else {
			
			int value = list.remove(0);
			System.out.println(Thread.currentThread().getName()+":: remove "+value);
			
			condition.signalAll();
			
			}
			Thread.sleep(1000);
			
			lock.unlock();
		}
	}
}
