package javapractice.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(new File("c:\\temp\\tst.txt")));
		A a = new A();
		a.setI(10);
		a.setS("hi");
//		B b = new B();
//		b.setF(101.11F);
//		a.setB(b);
		os.writeObject(a);*/
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("c:\\temp\\tst.txt")));
		A a1 =(A) is.readObject();
		System.out.println(a1.toString());
	}

}

class A implements Serializable{

//	private static final long serialVersionUID = 1385822647241428610L;
//	private B b;
	private String s;
	private int i;
	private float f;
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	/*public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}*/
	/*@Override
	public String toString() {
		return "A [s=" + s + ", i=" + i + "]";
	}*/
	@Override
	public String toString() {
		return "A [s=" + s + ", i=" + i + ", f=" + f + "]";
	}
	
	
	
}

class B{
	private float f;

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "B [f=" + f + "]";
	}
	
	
}
