package pattern.observer.weatherApp.impl;

import pattern.observer.weatherApp.contract.DisplayElement;
import pattern.observer.weatherApp.contract.Observer;
import pattern.observer.weatherApp.contract.Subject;

public class StatisticsDisplayObserver implements Observer, DisplayElement {

	private Subject weatherDataSubject;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public StatisticsDisplayObserver(Subject weatherDataSubject) {
		this.weatherDataSubject = weatherDataSubject;
		weatherDataSubject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Weather Statistics: Temperature = " + temperature + " F, Humidity = " + humidity
				+ " %, Pressure = " + pressure + " Millibars");
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = (temperature * 30) / 29;
		this.humidity = (humidity * 30) / 29;
		this.pressure = (pressure * 30) / 29;
		display();
	}

}
