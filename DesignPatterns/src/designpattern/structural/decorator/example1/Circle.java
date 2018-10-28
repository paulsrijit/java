package designpattern.structural.decorator.example1;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle drawn");
	}

	/*@Override
	public void resize() {
		System.out.println("Circle resized");
	}

	@Override
	public String description() {
		return "Circle object";
	}*/
}
