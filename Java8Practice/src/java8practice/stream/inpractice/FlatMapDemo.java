package java8practice.stream.inpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(5,6,7,8);
		
		List<List<Integer>> l = Arrays.asList(l1,l2);
		
		System.out.println(l);
		
		System.out.println(l.stream().flatMap((listOfInteger) -> listOfInteger.stream()).collect(Collectors.toList()));

	}

}
