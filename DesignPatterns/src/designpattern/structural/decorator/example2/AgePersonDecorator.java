package designpattern.structural.decorator.example2;

public class AgePersonDecorator extends PersonDecorator{

	protected int age;

	public AgePersonDecorator(Person decoratedPerson, int age){
		super(decoratedPerson);
		this.age = age;
	}

	@Override
	public void introduce(){
		decoratedPerson.introduce();
		System.out.println("Age : " + age);
	}
}