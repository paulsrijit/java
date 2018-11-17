package concurrency.lock.producerconsumer.signalall;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer extends ProducerConsumer {
	
	public Consumer(List<Integer> list, ReentrantLock lock, Condition producerQueue, Condition consumerQueue) {
		super(list, lock, producerQueue, consumerQueue);
	}

	public void consume() throws InterruptedException {
		while(true) {
			lock.lock();
			
			if(list.size() == 0) {
				consumerQueue.await();
			}
			
			int value = list.remove(0);
			System.out.println(Thread.currentThread().getName()+":: remove "+value);
			
			
			producerQueue.signal();
			consumerQueue.await();
			Thread.sleep(1000);
			
			lock.unlock();
		}
	}
}
