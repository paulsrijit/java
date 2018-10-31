package designpattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import designpattern.creational.singleton.eager.EagerSingleton;
import designpattern.creational.singleton.eager.EagerStaticBlockSingleton;
import designpattern.creational.singleton.threadsafe.ThreadSafeSingleton;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*EagerSingleton obj1 = EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		
		EagerSingleton obj2 = EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());*/
		
		/*EagerStaticBlockSingleton obj3 = EagerStaticBlockSingleton.getInstance();
		System.out.println(obj3.hashCode());
		
		EagerStaticBlockSingleton obj4 = EagerStaticBlockSingleton.getInstance();
		System.out.println(obj4.hashCode());*/
		
		//Student stu = new Student();
		
		ThreadSafeSingleton obj5 = ThreadSafeSingleton.getInstance();
		obj5.setName("Srijit Paul");
		System.out.println(obj5.hashCode());		
		File file = new File("c:\\Temp\\tempclass.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(obj5);		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		ThreadSafeSingleton obj6 = (ThreadSafeSingleton) ois.readObject();				
		ois.close();
		System.out.println(obj6.hashCode());
		System.out.println(obj6.getName());
	}

}
