package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class FailFastDemo {
	
	public static void main(String[] args) {
		new FailFastDemo().demo();
	}
	
	void demo(){
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("Before:"+list.toString());
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String nextStr = itr.next();
			if(nextStr.equals("two")) {
				
				itr.remove();
				//list.remove(nextStr);
				//list.add("TWO");
			}
		}
		
		System.out.println("After:"+list.toString());
		
		/*for(int i = 0; i < list.size(); i++) {
			
			String nextStr = list.get(i);
			
			if(nextStr.equals("two")) {
				list.add("TWO");
				list.remove(nextStr);
			}
		}
		
		System.out.println("After:"+list.toString());*/
	}
}