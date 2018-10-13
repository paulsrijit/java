package java8practice.stream.inpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiscStreamMethods {

	public static void main(String[] args) {
		//Stream.generate(() -> )
		Stream<String> emptyStream = Stream.empty();
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,3,7);
		System.out.println(l);
		System.out.println(l.stream().distinct().collect(Collectors.toList()));
		
	}

}
