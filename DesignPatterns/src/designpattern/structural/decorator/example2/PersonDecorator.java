package designpattern.structural.decorator.example2;

public abstract class PersonDecorator implements Person {

	protected Person decoratedPerson;

	public PersonDecorator(Person decoratedPerson){
		this.decoratedPerson = decoratedPerson;
	}
}