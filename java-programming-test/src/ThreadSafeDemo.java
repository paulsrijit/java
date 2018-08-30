
public class ThreadSafeDemo {

	public static void main(String[] args) {
		MyDto dto = new MyDto();
		Runnable job = new MyJob(dto);

		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		t1.start();
		t2.start();
	}

}

class MyJob implements Runnable {

	MyDto dto = null;

	MyJob(MyDto dto) {
		this.dto = dto;
	}

	@Override
	public synchronized void run() { //synchronized in run method signature will make the codes within it thread-safe
		/*		
		Thread-0 -> 1
		Thread-0 -> 3
		Thread-0 -> 5
		Thread-0 -> 7
		Thread-0 -> 9
		Thread-1 -> 11
		Thread-1 -> 13
		Thread-1 -> 15
		Thread-1 -> 17
		Thread-1 -> 19
		*/
		dto.incrementByTwo();
	}

}

class MyDto {

	int i = -1;

	void incrementByTwo() {
		for (int j = 0; j < 5; j++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i = i + 2;
			System.out.println(Thread.currentThread().getName() + " -> " + i);
		}

	}
}
