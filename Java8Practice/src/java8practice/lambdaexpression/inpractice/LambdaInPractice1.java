package java8practice.lambdaexpression.inpractice;

import java.util.ArrayList;
import java.util.List;

public class LambdaInPractice1 {

	public static void main(String[] args) {
		List<String> listStr = new ArrayList();
		listStr.add("X");
		listStr.add("Y");
		listStr.add("Z");
		
		System.out.println(listStr.toString());
		

		listStr.forEach(n -> System.out.println(n));

	}

}
