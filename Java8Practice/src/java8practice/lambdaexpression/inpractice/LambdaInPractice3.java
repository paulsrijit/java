package java8practice.lambdaexpression.inpractice;

public class LambdaInPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " started"));
		Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " started"));

		t1.start();
		t2.start();
	}

}
