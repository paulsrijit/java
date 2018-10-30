package designpattern.creational.singleton;

import designpattern.creational.singleton.eager.EagerSingleton;
import designpattern.creational.singleton.eager.EagerStaticBlockSingleton;

public class MainClass {

	public static void main(String[] args) {
		/*EagerSingleton obj1 = EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		EagerSingleton obj2 = EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());*/
		
		EagerStaticBlockSingleton obj3 = EagerStaticBlockSingleton.getInstance();
		System.out.println(obj3.hashCode());
		
		EagerStaticBlockSingleton obj4 = EagerStaticBlockSingleton.getInstance();
		System.out.println(obj4.hashCode());
		
		//Student stu = new Student();
	}

}
