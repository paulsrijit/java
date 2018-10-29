package designpattern.behavioral.command.example1;


//Concrete command
public class LightsOffCommand implements Command {

	private Light light;

	public LightsOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOff();
	}

}
