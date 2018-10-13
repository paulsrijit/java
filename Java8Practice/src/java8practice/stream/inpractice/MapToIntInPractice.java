package java8practice.stream.inpractice;

import java.util.List;
import java.util.Arrays;

public class MapToIntInPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,11,12,13,14,15,21,22,23,24,25);
		System.out.println(list.stream().filter(i -> i < 10).mapToInt(i -> i).sum());
	}

}
