package concurrency.lock.producerconsumer;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerMainSignalAll {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<Integer> list = new ArrayList<>();
		ReentrantLock lock = new ReentrantLock();
		Condition condition = lock.newCondition();

		Producer prod = new Producer(list, lock, condition);
		Consumer cons1 = new Consumer(list, lock, condition);
		Consumer cons2 = new Consumer(list, lock, condition);

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

		Thread consumer1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cons1.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}, "Consumer1");

		Thread consumer2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					cons2.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}, "Consumer2");

		producer.start();
		consumer1.start();
		consumer2.start();

		producer.join();
		consumer1.join();
		consumer2.join();
	}

}
