package concurrency.lock.producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> list = new ArrayList<>();
		ReentrantLock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		
		Producer prod = new Producer(list, lock, condition);
		Consumer cons = new Consumer(list, lock, condition);
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					prod.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Producer");
		
		Thread consumer =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					cons.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}, "Consumer");
		
		
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();
	}

}
