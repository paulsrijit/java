package designpattern.structural.decorator.example2;

public class NamePersonDecorator extends PersonDecorator {

	protected String name;

	public NamePersonDecorator(Person decoratedPerson, String name){
		super(decoratedPerson);
		this.name = name;
	}

	@Override
	public void introduce(){
		decoratedPerson.introduce();
		System.out.println("Name : " + name);
	}

}