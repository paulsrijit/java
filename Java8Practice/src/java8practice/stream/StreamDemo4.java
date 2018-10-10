package java8practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import java8practice.lambdaexpression.inpractice.Person;

public class StreamDemo4 {

	public static void main(String[] args) {
		/*final List<String> demoValues = Arrays.asList("A", "B", "C", "D", "E");
		BinaryOperator<String> binOp = (s1, s2) -> s1.concat(s2);
		System.out.println(demoValues.stream().reduce(binOp));*/
		
		List<Person> list = Person.createPersonList();//--//--//
		BinaryOperator<Person> binOpPer = (per1, per2) -> {
			Person resPer = new Person((per1.getName()+per2.getName()), (per1.getAge()+per2.getAge()));
			return resPer;
		};
		System.out.println(list.stream().reduce(binOpPer).toString());


	}

}
