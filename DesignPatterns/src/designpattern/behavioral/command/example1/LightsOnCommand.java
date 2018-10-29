package designpattern.behavioral.command.example1;


//Concrete command
public class LightsOnCommand implements Command {

	private Light light;

	public LightsOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
	}
}
