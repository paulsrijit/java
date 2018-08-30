package java8.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
		obj = new Xyz();
		obj.show();
	}
}


interface A {
	void show();
}

class Xyz implements A {
	public void show() {
		System.out.println("Hello");
	}
}