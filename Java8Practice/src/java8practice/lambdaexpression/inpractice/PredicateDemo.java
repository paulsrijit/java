package java8practice.lambdaexpression.inpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("A", 50));
		personList.add(new Person("B", 10));
		personList.add(new Person("C", 30));
		personList.add(new Person("D", 60));
		personList.add(new Person("E", 70));
		personList.add(new Person("F", 40));
		personList.add(new Person("G", 20));
		personList.add(new Person("H", 15));
		personList.add(new Person("I", 17));

		Predicate<Person> adultCriteria = per -> (per.getAge() >= 18);
		System.out.println("Adult Age::");
		personList.forEach(per -> {
			if (adultCriteria.test(per)) {
				System.out.println(per.toString());
			}
		});

		Predicate<Person> middleAgedCriteria = per -> (per.getAge() >= 30 && per.getAge() <= 50);
		System.out.println("Middle Age::");
		personList.forEach(per -> {
			if (middleAgedCriteria.test(per)) {
				System.out.println(per.toString());
			}
		});

	}

}

class Person {

	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return ("Name: " + this.name + ", Age: " + this.age);
	}
}