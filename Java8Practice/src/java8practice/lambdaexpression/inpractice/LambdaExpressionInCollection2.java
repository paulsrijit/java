package java8practice.lambdaexpression.inpractice;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressionInCollection2 {

	public static void main(String[] args) {
		List<Person> personList = Person.createPersonList();
		Predicate<Person> adultCriteria = new SearchCriteria().getCriteria("adultCriteria");

		List<Person> adultPersonList = personList.stream().filter(adultCriteria).collect(Collectors.toList());
		
		System.out.println(adultPersonList.toString());
	}

}
