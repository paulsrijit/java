package designpattern.behavioral.command.example1;


//Client
public class MainClass {

	public static void main(String[] args) {
		Light light = new Light();
		Command onCommand = new LightsOnCommand(light);
		Command offCommand = new LightsOffCommand(light);
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(onCommand);
		remote.pressButton();
		
		remote.setCommand(offCommand);
		remote.pressButton();
	}

}
