package designpattern.structural.decorator.example2;

public class Teacher implements Person {

	@Override
	public void introduce(){
		System.out.println("This is a Teacher");
	}
}