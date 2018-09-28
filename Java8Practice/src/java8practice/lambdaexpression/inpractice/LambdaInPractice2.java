package java8practice.lambdaexpression.inpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaInPractice2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("A");
		list.add("D");
		list.add("C");
		list.add("B");
		
		System.out.println(list.toString());

		/*Comparator<String> stringComparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}};*/
		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2) );
		
		System.out.println(list.toString());
	}

}
