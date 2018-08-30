package concurrency;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		new ThreadLocalDemo().demo();
	}
	
	void demo() {
		TLdto dto = new TLdto();
		MyRunnable r = new MyRunnable(dto);
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
			System.out.println("Final print - "+dto.getTlStr());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

class MyRunnable implements Runnable {
	
	private TLdto dto;
	
	public MyRunnable(TLdto dto) {
		super();
		this.dto = dto;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			dto.setTlStr(dto.getTlStr()+":"+Thread.currentThread().getName()+"::"+i);
		}
		System.out.println(dto.getTlStr());
	}
	
}

class TLdto{
	ThreadLocal<String> tlStr = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return "INIT";
		}
	};

	public String getTlStr() {
		return tlStr.get();
	}

	public void setTlStr(String tlStr) {
		this.tlStr.set(tlStr);
	}
	
}
