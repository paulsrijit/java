package collection;

import java.util.ArrayList;
import java.util.List;

public class TestSortOrder {

	public static void main(String[] args) {
		List<String> unsorted = new ArrayList<>();
		unsorted.add("A01");
		unsorted.add("001");
		unsorted.add("a01");
		unsorted.add("101");
		unsorted.add("001");
		
		for(String str : unsorted)
			System.out.println(str);
		
		System.out.println("--------------------");
		unsorted.sort((str1, str2) -> (str1 == null ? "" : str1)
                .compareTo((str2 == null ? "" : str2)));
		
		for(String str : unsorted)
			System.out.println(str);

	}

}
