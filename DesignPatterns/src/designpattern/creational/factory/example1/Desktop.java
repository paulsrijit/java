package designpattern.creational.factory.example1;
public class Desktop extends Computer{
	private String hdd;
	private String cpu;
	private String ram;

	public Desktop(String hdd, String cpu, String ram){
		super();
		this.hdd = hdd;
		this.cpu = cpu;
		this.ram = ram;
	}

	@Override
	public String getHdd(){
		return hdd;
	}

	@Override
	public String getCpu(){
		return cpu;
	}

	@Override
	public String getRam(){
		return ram;
	}

	@Override
	public String getComputerType(){
		return "Desktop";
	}
}