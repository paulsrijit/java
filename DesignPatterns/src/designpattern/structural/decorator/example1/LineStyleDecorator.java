package designpattern.structural.decorator.example1;

public class LineStyleDecorator extends ShapeDecorator{
	
	protected LineStyle line;
	
	public LineStyleDecorator(Shape decoratedShape, LineStyle line) {
		super(decoratedShape);
		this.line = line;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line Style : " + line.toString());		
	}
}
