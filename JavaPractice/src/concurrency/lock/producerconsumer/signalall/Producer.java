package concurrency.lock.producerconsumer.signalall;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Producer extends ProducerConsumer {

	
	public Producer(List<Integer> list, ReentrantLock lock, Condition producerQueue, Condition consumerQueue) {
		super(list, lock, producerQueue, consumerQueue);
	}

	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			lock.lock();
			
			/*if(list.size() == 5) {
				producerQueue.await();
			}
			
			System.out.println(Thread.currentThread().getName()+":: add "+value);
			list.add(value++);
			
			consumerQueue.signalAll();
			Thread.sleep(1000);*/
			
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+":: add "+value);
				list.add(value++);
				Thread.sleep(1000);
			}
			consumerQueue.signalAll();
			producerQueue.await();
			
			Thread.sleep(1000);
			
			lock.unlock();
		}
		
	}
	
}
