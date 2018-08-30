package pattern.builtin.observer.weatherApp.impl;

import java.util.Observable;
import java.util.Observer;

import pattern.observer.weatherApp.contract.DisplayElement;

public class CurrentConditionsDisplayBuiltinObserver implements Observer, DisplayElement {
	
	private Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplayBuiltinObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherDataObservable) {
			WeatherDataObservable weatherData = (WeatherDataObservable) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: " + temperature + " F degrees " + humidity + " % humidity");		
	}

}
