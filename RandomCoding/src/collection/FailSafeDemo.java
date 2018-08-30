package collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {

	public static void main(String[] args) {
		new FailSafeDemo().demo();

	}
	
	void demo() {
		/*ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		System.out.println("Before:"+map.toString());
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer nextInt = itr.next();
			String nextStr = map.get(nextInt);
			
			if(nextStr.equals("Two")) {
				//map.remove(nextStr);
				itr.remove();
			}
		}
		
		System.out.println("After:"+map.toString());*/
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("Before:"+list.toString());
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String nextStr = itr.next();
			if(nextStr.equals("two")) {
				
				//itr.remove();
				//list.remove(nextStr);
				list.add("TWO");
			}
		}
		
		System.out.println("After:"+list.toString());
		
	}

}
