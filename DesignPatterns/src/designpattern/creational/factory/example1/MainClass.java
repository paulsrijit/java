package designpattern.creational.factory.example1;
public class MainClass {
	public static void main(String args[]){

		Computer laptopObj = ComputerFactory.getComputer("Laptop", "1 tb", "Pentium 7", "32 gb");
		System.out.println(laptopObj.toString());
	}
}