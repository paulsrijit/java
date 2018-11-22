package designpattern.structural.composite.example1;

public class Circle implements Shape {
	@Override
	public void draw(String fillColor) {
		System.out.println("Circle drwan with color: " + fillColor);
	}
}
