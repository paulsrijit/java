package designpattern.creational.factory.example1;
public abstract class Computer{
	public abstract String getCpu();
	public abstract String getHdd();
	public abstract String getRam();
	public abstract String getComputerType();

	@Override
	public String toString(){
		return getComputerType()+" :: CPU : "+getCpu()+", HDD : "+getHdd()+", RAM : "+getRam();
	}
}