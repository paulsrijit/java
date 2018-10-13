package java8practice.stream;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MinMaxDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,30,10,60,70,80,90,40,50);
		
		/*Optional<Integer> opInt = list.stream().min(new Comparator<Integer>(){
			public int compare(Integer i1, Integer i2){			
				return i1.compareTo(i2);
			}
		});*/
		
		//Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2); 
		
		Optional<Integer> opInt = list.stream().max((i1, i2) -> i1.compareTo(i2));
		
		System.out.println(opInt.get());
	}

}
