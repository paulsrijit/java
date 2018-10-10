package java8practice.lambdaexpression.inpractice;

import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionInCollection {

	public static void main(String[] args) {
		List<Person> personList = Person.createPersonList();
		SearchCriteria searchCriteria = new SearchCriteria();
		Predicate<Person> adultCriteria = searchCriteria.getPersonCriteriaByName("adultCriteria");
		Predicate<Person> studentCriteria = searchCriteria.getPersonCriteriaByName("studentCriteria");
		
		
		personList.stream().filter(adultCriteria).forEach(Person::printPerson);
		personList.stream().filter(studentCriteria).forEach(Person::printPerson);

	}

}
