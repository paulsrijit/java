package designpattern.behavioral.state.example1;

public class TvOffState implements State{
	@Override
	public void doAction() {
		System.out.println("TV turned OFF");
	}
}
