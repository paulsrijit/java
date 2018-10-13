package java8practice.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Person> perList = Person.createPersonList();
		perList.add(new Person("D", 120));
		Map<String, List<Person>> perMap = perList.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println(perMap.toString());
	}

}
