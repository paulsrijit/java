package javapractice.designpattern.observer;

import java.util.Observable;

public class DataStore extends Observable {

	private String data = "Init Data";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data += " " + data;

		// mark the observable as changed
		setChanged();

		// notify observer
		notifyObservers();
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}

}
