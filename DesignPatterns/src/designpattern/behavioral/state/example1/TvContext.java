package designpattern.behavioral.state.example1;

public class TvContext implements State{
	
	private State tvState;
	

	public State getTvState() {
		return tvState;
	}


	public void setTvState(State tvState) {
		this.tvState = tvState;
	}


	@Override
	public void doAction() {
		tvState.doAction();		
	}

}
