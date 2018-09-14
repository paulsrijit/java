package javapractice.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("DataStore has changed:: " + o.toString());		
	}

}
