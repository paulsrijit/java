package designpattern.structural.decorator.example1;

public class MainClass {

	public static void main(String[] args) {	
		Shape circle = new ColorDecorator(new LineStyleDecorator(new Circle(), LineStyle.SOLID), Color.BLUE);
		circle.draw();
		
		Shape triangle = new LineStyleDecorator(new ColorDecorator(new Triangle(), Color.RED), LineStyle.DOT);
		triangle.draw();        
	}

}
