package concurrency.lock.producerconsumer;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	
	List<Integer> list;
	ReentrantLock lock;
	Condition condition;
	
	public ProducerConsumer(List<Integer> list, ReentrantLock lock, Condition condition) {
		super();
		this.list = list;
		this.lock = lock;
		this.condition = condition;
	}
}


