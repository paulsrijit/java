package collection;

import java.util.Comparator;

public class TmpCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		//if(p1.name > p2.name)
		return 0;
	}
	
}

class Person {
	String name;
	int age;
}
