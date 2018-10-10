package java8practice.lambdaexpression.inpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SearchCriteria {
	private final Map<String, Predicate<Person>> predicateStore = new HashMap<>();

	private void initPredicateStore() {
		Predicate<Person> adultCriteria = person -> person.getAge() > 18;
		Predicate<Person> studentCriteria = person -> person.getAge() <= 17;
		Predicate<Person> middleAgedCriteria = person -> (person.getAge() >= 40) && (person.getAge() <= 50);

		predicateStore.put("adultCriteria", adultCriteria);
		predicateStore.put("studentCriteria", studentCriteria);
		predicateStore.put("middleAgedCriteria", middleAgedCriteria);
	}

	SearchCriteria() {
		super();
		initPredicateStore();
	}

	public Predicate<Person> getPersonCriteriaByName(String criteriaName) {
		Predicate<Person> personCriteria = null;
		if (criteriaName != null) {
			personCriteria = predicateStore.get(criteriaName);
		} else {
			throw new RuntimeException("Criteria can't be null");
		}

		if (personCriteria == null) {
			throw new RuntimeException("Criteria not found");
		}
		return personCriteria;
	}
}
