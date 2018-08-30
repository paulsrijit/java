
public class ThreadVsRunnable {

	public static void main(String[] args) {
		Thread t = new MyThread(new MyRunnable());
		t.start();
	}

}

class MyThread extends Thread{
	MyThread(Runnable r){
		super(r);
	}
	
	/*@Override
	public void run() {
		System.out.println("MyThread running");
	}*/
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable running");
	}
	
}
