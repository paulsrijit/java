package designpattern.structural.decorator.example1;

public class ColorDecorator extends ShapeDecorator {
	protected Color color;

	public ColorDecorator(Shape decoratedShape, Color color) {
		super(decoratedShape);
		this.color = color;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Color : " + color.toString());
	}

	/*@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String description() {
		return decoratedShape.description() + " with " + color.toString() + " color";
	}*/

}
