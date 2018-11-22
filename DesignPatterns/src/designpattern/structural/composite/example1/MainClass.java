package designpattern.structural.composite.example1;

public class MainClass {

	public static void main(String[] args) {
		Shape triangle1 = new Triangle();
		Shape triangle2 = new Triangle();
		Shape circle = new Circle();
		
		DrawingClass drawing = new DrawingClass();
		
		drawing.addShape(triangle1);
		drawing.addShape(triangle2);
		drawing.addShape(circle);		
		drawing.draw("Red");		
		drawing.clearAllShapes();
		
		drawing.addShape(new Triangle());
		drawing.addShape(new Circle());
		drawing.draw("Green");
		drawing.clearAllShapes();
	}

}
