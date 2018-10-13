package java8practice.stream;

import java.util.List;
import java.util.Arrays;

public class MatchingDemo {

	public static void main(String[] args) {
		/*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("before: "+list);
		
		boolean result = list.stream().anyMatch((i) -> i/2==0);
		System.out.println(result);*/
		
		
		/*List<Integer> list = Arrays.asList(2,4,6,8);
		System.out.println("before: "+list);
		
		boolean result = list.stream().allMatch((i) -> i%2==0);
		System.out.println(result);*/
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("before: "+list);
		
		boolean result = list.stream().noneMatch((i) -> i > 9);
		System.out.println(result);

	}

}
