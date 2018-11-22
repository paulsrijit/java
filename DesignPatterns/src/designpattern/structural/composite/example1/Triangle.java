package designpattern.structural.composite.example1;

public class Triangle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Triangle drawn with color: " + fillColor);
	}
}
