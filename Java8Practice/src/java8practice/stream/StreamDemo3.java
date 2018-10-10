package java8practice.stream;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

import java8practice.lambdaexpression.inpractice.Person;
import java8practice.lambdaexpression.inpractice.Student;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Person> list = Person.createPersonList();
		Function<Person, Student> function = (per) -> {
			Student student = new Student();
			student.setsName(per.getName());
			student.setsAge(per.getAge());
			student.setsStd(generateRandomStd());
			return student;
		};

		Stream<Student> stuStream = list.stream().map(function);
		stuStream.forEach(System.out::println);

	}
	
	private static String generateRandomStd() {
		Random r = new Random();
		int low = 1;
		int high = 12;
		int result = r.nextInt(high - low) + low;
		return Integer.toString(result);
	}

}
