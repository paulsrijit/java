package concurrency.lock.producerconsumer.signalall;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	
	volatile List<Integer> list;
	volatile ReentrantLock lock;
	volatile Condition producerQueue; 
	volatile Condition consumerQueue;
	
	public ProducerConsumer(List<Integer> list, ReentrantLock lock, Condition producerQueue, Condition consumerQueue) {
		super();
		this.list = list;
		this.lock = lock;
		this.producerQueue = producerQueue;
		this.consumerQueue = consumerQueue;
	}
}


