package javapractice.overriding.example2;

public class OverridingTest2 {

	public static void main(String[] args) {
		Ort2_X x = new Ort2_Y();
		x.m1(10, 20);
		
		Ort2_Y y = (Ort2_Y) x;
		y.m1(0, 0);
		
		Ort2_Z z = (Ort2_Z) y;
		z.m1(-1, 1);
	}

}

class Ort2_X {
	void m1(int a, int b) {
		System.out.println("X.m1");
	}

}

class Ort2_Y extends Ort2_X {
	void m1(int a, int b) {
		System.out.println("Y.m1");
	}
}

class Ort2_Z extends Ort2_Y {
	void m1(int a, int b) {
		System.out.println("Z.m1");
	}
}
