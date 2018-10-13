package java8practice.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstDemo {

	public static void main(String[] args) {
		List<Person> list = Person.createPersonList();
		Stream<Person> strm = list.stream();
		Optional<Person> opt = strm.filter((per) -> per.getAge() >= 18).findFirst();
		System.out.println(opt);		

	}

}
