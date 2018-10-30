package designpattern.creational.singleton;

public class Student {
	HomeWork homeWork = new HomeWork();
	String s;

	public Student() {
		System.out.println("student const");
		s="Srijit";
	}
	
	public void doit() {
		System.out.println(s);
	}
	
	

}
