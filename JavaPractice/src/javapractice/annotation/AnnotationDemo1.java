package javapractice.annotation;

public class AnnotationDemo1 {

	public static void main(String[] args) {
		// the problem
		Shape rectangle = new Rectangle();
		
		rectangle.printArea(100);
	}

}

class Shape {
	void printArea(double area) {
		System.out.println("javapractice.annotation.Shape.printShape(double)::" + area);
	}
	
	/*void printArea(float area) {
		System.out.println("javapractice.annotation.Shape.printShape(float)::" + area);
	}*/
}

class Rectangle extends Shape {
	/*@Override
	void printArea(short area) {
		System.out.println("javapractice.annotation.Rectangle.printShape(short)::" + area);
	}*/
	void printArea(int area) {//Though the intention was to override, it got overloaded. Adding an @Override annotation could catch this error at compile time
		System.out.println("javapractice.annotation.Rectangle.printArea(int)::" + area);
	}
}
