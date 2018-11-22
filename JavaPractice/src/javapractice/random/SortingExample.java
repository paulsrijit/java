package javapractice.random;

import java.util.*;

public class SortingExample {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		Person p1 = new Person(10, "A");
		Person p2 = new Person(13, "B");
		Person p3 = new Person(11, "Z");
		Person p4 = new Person(9, "x");
		Person p5 = new Person(17, "e");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		System.out.println(list.toString());
		//list.sort(null);
		Collections.sort(list, null);
		System.out.println(list.toString());
	}

}

class Person {
//class Person implements Comparable<Person>{
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	/*@Override
	public int compareTo(Person o) {
		
		if(this.age == o.age) {
			return 0;
		}else if(this.age > o.age) {
			return 1;
		}else {
			return -1;
		}
	}*/
}
