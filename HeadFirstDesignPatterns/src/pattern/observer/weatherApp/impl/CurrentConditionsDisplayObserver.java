package pattern.observer.weatherApp.impl;

import pattern.observer.weatherApp.contract.DisplayElement;
import pattern.observer.weatherApp.contract.Observer;
import pattern.observer.weatherApp.contract.Subject;

public class CurrentConditionsDisplayObserver implements Observer, DisplayElement {

	private Subject weatherDataSubject;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplayObserver(Subject weatherDataSubject) {
		this.weatherDataSubject = weatherDataSubject;
		weatherDataSubject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: " + temperature + " F degrees " + humidity + " % humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
