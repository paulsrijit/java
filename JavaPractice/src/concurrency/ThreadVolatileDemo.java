package concurrency;

public class ThreadVolatileDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadVolatile t1 = new ThreadVolatile();
		t1.setName("T1");
		t1.start();
		Thread.sleep(1000);
		t1.flag = false;
		t1.join();
		System.out.println("Existing main thread");

	}

}

class ThreadVolatile extends Thread {

	public volatile boolean flag = true;

	@Override
	public void run() {
		System.out.println("Thread started:" + Thread.currentThread().getName());

		long i = 1L;

		while (flag) {
			i = i+1;
		}

		System.out.println("Thread stopping:" + Thread.currentThread().getName() + ", total count=" + i);
	}
}