package concurrency.lock.producerconsumer;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Producer extends ProducerConsumer {

	
	public Producer(List<Integer> list, ReentrantLock lock, Condition condition) {
		super(list, lock, condition);
	}

	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			lock.lock();
			
			if(list.size() == 5) {
				condition.await();
			}
			
			System.out.println(Thread.currentThread().getName()+":: add "+value);
			list.add(value++);
			
			condition.signal();
			Thread.sleep(1000);
			
			lock.unlock();
		}
		
	}
	
}
