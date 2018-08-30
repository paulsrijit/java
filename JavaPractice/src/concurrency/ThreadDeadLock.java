package concurrency;

public class ThreadDeadLock {

	public static void main(String[] args) throws InterruptedException {
		Bank1 b1 = new Bank1();
		Bank2 b2 = new Bank2();
		
		b1.setBank(b2);
		b2.setBank(b1);
		
		Bank1Runner b1Runner = new Bank1Runner();
		b1Runner.setBank(b1);
		
		Bank2Runner b2Runner = new Bank2Runner();
		b2Runner.setBank(b2);
		
		Thread t1 = new Thread(b1Runner);
		Thread t2 = new Thread(b2Runner);
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		
		t1.join();
		t2.join();

	}

}

class Bank1Runner implements Runnable{

	Bank1 bank1;
	
	public void setBank(Bank1 b1) {
		bank1 = b1;
	}
	
	@Override
	public void run() {
		try {
			bank1.incrementX();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

class Bank2Runner implements Runnable{
	Bank2 bank2;
	
	public void setBank(Bank2 b2) {
		bank2 = b2;
	}

	@Override
	public void run() {
		try {
			bank2.incrementY();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class Bank1 {
	private int x = 0;
	Bank2 bank2;
	
	public void setBank(Bank2 b2) {
		bank2 = b2;
	}
	
	public synchronized void incrementX() throws InterruptedException {
		System.out.println("incrementX::Started " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			x = x + 1;
			System.out.println("incrementX::New value is : " + x);
		}
		bank2.print10Y();
		System.out.println("incrementX::Ending " + Thread.currentThread().getName());
	}
	
	public synchronized void print10X() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("print10X:: " + i);
		}
	}
}

class Bank2 {
	private int y = 0;
	Bank1 bank1;
	
	public void setBank(Bank1 b1) {
		bank1 = b1;
	}
	
	public synchronized void incrementY() throws InterruptedException {
		System.out.println("incrementY::Started " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			y = y + 1;
			System.out.println("incrementY::New value is : " + y);
		}
		bank1.print10X();
		System.out.println("incrementY::Ending " + Thread.currentThread().getName());
	}
	
	public synchronized void print10Y() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("print10Y:: " + i);
		}
	}
}