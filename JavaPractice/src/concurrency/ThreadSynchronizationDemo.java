package concurrency;

public class ThreadSynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		final IntBank intBank = new IntBank();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					intBank.incrementX();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					intBank.incrementX_();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					intBank.incrementY();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		Thread.sleep(1000);
		t2.start();
//		Thread.sleep(1000);
		t3.start();

		t1.join();
		t2.join();
		t3.join();

	}

}

class IntBank {
	private int x = 0;
	
	private int y = 0;

	public synchronized void incrementX() throws InterruptedException {
		System.out.println("Started " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			x = x + 1;
			System.out.println("New value is : " + x);
		}
		System.out.println("Ending " + Thread.currentThread().getName());
	}

	public synchronized void incrementX_() throws InterruptedException {
		System.out.println("incrementX_ :: Started " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			x = x + 1;
			System.out.println("incrementX_ ::New value is : " + x);
		}
		System.out.println("incrementX_ :: Ending " + Thread.currentThread().getName());
	}
	
	public void incrementY() throws InterruptedException {
		System.out.println("incrementY::Started " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			y = y + 1;
			System.out.println("incrementY::New value is : " + y);
		}
		System.out.println("incrementY::Ending " + Thread.currentThread().getName());
	}
}
