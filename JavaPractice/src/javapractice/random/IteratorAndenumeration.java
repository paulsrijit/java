package javapractice.random;

import java.util.*;

public class IteratorAndenumeration {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.toString());
		
		/*Iterator it = list.iterator();
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			if(i==3) {
				it.remove();
			}
			System.out.println(i);
		}
		
		System.out.println(list.toString());*/
	}

}
