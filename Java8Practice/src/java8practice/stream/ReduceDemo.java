package java8practice.stream;

import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		BinaryOperator<String> biOp = (str1, str2) -> str1 + str2;
		String s = list.stream().reduce(biOp).get();
		System.out.println(s);

	}

}
