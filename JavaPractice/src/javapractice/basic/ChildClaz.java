package javapractice.basic;

public class ChildClaz extends ParentClaz{
	
	//@Override
	public ChildClazDto m1(){
		System.out.println("javapractice.basic.ChildClaz.m1()");
		return new ChildClazDto();
	}
}
