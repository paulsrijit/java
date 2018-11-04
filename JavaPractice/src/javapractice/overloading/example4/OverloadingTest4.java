package javapractice.overloading.example4;

public class OverloadingTest4 {

	public static void main(String[] args) {
		OverloadingTest4 obj = new OverloadingTest4();
		System.out.println(obj.overloadedMethod(100));

	}
	
	double overloadedMethod(double d) {
		return d *= d;
	}

	int overloadedMethod(int i) {
		System.out.println("i = " + i);
		return overloadedMethod(i *= i);
	}

	float overloadedMethod(float f) {
		return overloadedMethod(f *= f);
	}

}
