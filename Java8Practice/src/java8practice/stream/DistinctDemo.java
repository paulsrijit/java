package java8practice.stream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DistinctDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,20,30,40,50,60,70,80,90,70,80,90);
		System.out.println("before: "+list);
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("after: "+list2);
	}

}
