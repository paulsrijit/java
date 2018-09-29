package java8practice.lambdaexpression.inpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

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

		Predicate<Person> studentCriteria = per -> (per.getAge() <= 18);

		Function<Person, Student> studentFunction = person -> {
			Student student = null;
			if (studentCriteria.test(person)) {
				student = new Student();
				student.setsName(person.getName());
				student.setsAge(person.getAge());
				student.setsStd(generateRandomStd());
			}

			return student;
		};

		personList.forEach(person -> {
			Student student = studentFunction.apply(person);
			if (student != null) {
				System.out.println(student.toString());
			}
		});

	}

	private static String generateRandomStd() {
		Random r = new Random();
		int low = 1;
		int high = 12;
		int result = r.nextInt(high - low) + low;
		return Integer.toString(result);
	}

}