package concurrency.lock;

public class RenntrantLockDemo {

	public static void main(String[] args) throws InterruptedException {
		MyResource r = new MyResource();
		MyRunnable mr = new MyRunnable();
		mr.setResource(r);

		Thread t1 = new Thread(mr);
		t1.setName("T1");

		Thread t2 = new Thread(mr);
		t2.setName("T2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("i=" + r.i);
	}

}
