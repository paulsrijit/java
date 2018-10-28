package designpattern.creational.factory.example1;
public class ComputerFactory {
	public static Computer getComputer(String type, String hdd, String cpu, String ram) {
		if(type.equals("Laptop")){
			return new Laptop(hdd, cpu, ram);
		}else if(type.equals("Desktop")){
			return new Desktop(hdd, cpu, ram);
		}else{
			return null;
		}
	}
}