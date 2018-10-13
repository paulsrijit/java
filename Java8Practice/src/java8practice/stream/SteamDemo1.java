package java8practice.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SteamDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		Stream<String> streamFromList = list.stream();
		List<String> newList = streamFromList.collect(Collectors.toList());
		System.out.println(newList.toString());

		String[] arr = {"A", "B", "C", "D", "E"};
		Stream<String> streamFromArr = Stream.of(arr);
		Object[] newArr = streamFromArr.toArray(); // this is generic method
		System.out.println(Arrays.asList(newArr).toString());
	}

}
