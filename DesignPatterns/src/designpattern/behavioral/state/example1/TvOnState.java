package designpattern.behavioral.state.example1;

public class TvOnState implements State{
	
	@Override
	public void doAction() {
		System.out.println("TV turned ON");
	}
}
