package designpattern.behavioral.state.example1;

public class MainClass {

	public static void main(String[] args) {
		State tvState = new TvOnState();
		TvContext context = new TvContext();
		context.setTvState(tvState);
		context.doAction();
		
		tvState = new TvOffState();
		context.setTvState(tvState);
		context.doAction();
	}

}
