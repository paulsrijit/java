package java8practice.stream.inpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class SpliteratorDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Spliterator<Integer> sp = list.spliterator();
		
		while(sp.tryAdvance((i) -> System.out.println(i))){
			
		}
		
		System.out.println(list.stream().collect(Collectors.toMap((i) -> i.toString(), (i) -> i)));
		
	}

}
