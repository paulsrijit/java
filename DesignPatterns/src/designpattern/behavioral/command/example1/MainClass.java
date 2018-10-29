package designpattern.behavioral.command.example1;


//Client
public class MainClass {

	public static void main(String[] args) {
		Light receiver = new Light();
		Command concreteOnCommand = new LightsOnCommand(receiver);
		Command concreteOffCommand = new LightsOffCommand(receiver);
		
		RemoteControl invoker = new RemoteControl();
		invoker.setCommand(concreteOnCommand);
		invoker.pressButton();
		
		invoker.setCommand(concreteOffCommand);
		invoker.pressButton();
	}

}
