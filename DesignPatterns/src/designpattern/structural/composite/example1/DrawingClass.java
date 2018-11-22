package designpattern.structural.composite.example1;

import java.util.List;
import java.util.ArrayList;

public class DrawingClass implements Shape {

	List<Shape> shapesToBeDrawn = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		shapesToBeDrawn.forEach(aShape -> aShape.draw(fillColor));
	}

	public void addShape(Shape shape) {
		shapesToBeDrawn.add(shape);
	}

	public void removeShape(Shape shape) {
		shapesToBeDrawn.remove(shape);
	}

	public void clearAllShapes() {
		shapesToBeDrawn.clear();
	}

}
