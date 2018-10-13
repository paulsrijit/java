package java8practice.lambdaexpression.inpractice;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaInCollection3 {

	public static void main(String[] args) {
		List<Person> personList = Person.createPersonList();
		Predicate<Person> adultCriteria = SearchCriteria.getInstance().getCriteria("adultCriteria");
		List<Person> adultList = personList.stream().filter(adultCriteria).collect(Collectors.toList());
		System.out.println(adultList);
	}

}
