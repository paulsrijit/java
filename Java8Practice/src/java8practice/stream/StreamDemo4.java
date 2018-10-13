package java8practice.stream;

import java.util.List;
import java.util.stream.Collectors;

import java8practice.lambdaexpression.inpractice.Student;

import java.util.function.Function;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<Person> list = Person.createPersonList();
		Function<Person, Student> stuFun = (per) -> {
			Student s = new Student();
			s.setsName(per.getName());
			s.setsAge(per.getAge());
			s.setsStd("12");
			return s;
		};
		System.out.println(list.stream().map(stuFun).collect(Collectors.toList()));
	}

}
