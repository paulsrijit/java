package java8practice.stream;

import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Person> list = Person.createPersonList();
		//list.stream().forEach(per -> System.out.println(per.toString()));
		//list.stream().forEach(System.out::println);
		list.parallelStream().forEach(System.out::println);
	}

}
