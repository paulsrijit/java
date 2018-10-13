package java8practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamWith2DCollectionDemo {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(Arrays.asList(1,2,3,4));
		matrix.add(Arrays.asList(5,6,7,8));
		matrix.add(Arrays.asList(9,10,11,12));
		matrix.add(Arrays.asList(13,14,15,16));
		
		/*Predicate<Integer> pre = e -> (e!=null && e==8);
		
		Predicate<List<Integer>> pre2 = l -> (l!=null && l.stream().anyMatch(pre));
		
		matrix.stream().filter(pre2);*/
		
		Integer val = matrix.stream().map(
				listOfInt -> (listOfInt.stream()
						.filter(intFromList -> intFromList.equals(8))
						.findFirst()
						.orElse(null))
				)
				.filter(listOfIntAfterFilter -> listOfIntAfterFilter != null)
				.findFirst()
				.get();
		
		
		System.out.println(val);

	}

}
