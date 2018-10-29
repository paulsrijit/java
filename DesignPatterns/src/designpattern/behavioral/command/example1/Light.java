package designpattern.behavioral.command.example1;


//Receiver
public class Light {

	boolean on;

	public void switchOn() {
		on = true;
		System.out.println("Light ON");
	}

	public void switchOff() {
		on = false;
		System.out.println("Light OFF");
	}
}
