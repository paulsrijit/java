package javapractice.overriding.example3;

public class MainClass {

	public static void main(String[] args) {
		X obj = new Y();
		System.out.println(obj.m1());
	}

}

class X {
	Person m1() {
		return new Person();
	}
}

class Y extends X {
	Scholar m1() {
		return new Scholar();
	}
}

class Person {
	@Override
	public String toString() {
		return "Person";
	}
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
}

class Scholar extends Student {
	@Override
	public String toString() {
		return "Scholar";
	}
}
