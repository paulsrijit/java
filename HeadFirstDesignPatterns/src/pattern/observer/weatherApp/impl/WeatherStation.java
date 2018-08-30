package pattern.observer.weatherApp.impl;

import pattern.builtin.observer.weatherApp.impl.CurrentConditionsDisplayBuiltinObserver;
import pattern.builtin.observer.weatherApp.impl.WeatherDataObservable;

public class WeatherStation {

	public static void main(String[] args) {
		/*WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
		
		CurrentConditionsDisplayObserver currentConditionsDisplayObserver = new CurrentConditionsDisplayObserver(weatherDataSubject);
		StatisticsDisplayObserver statisticsDisplayObserver = new StatisticsDisplayObserver(weatherDataSubject);
		
		weatherDataSubject.setMeasurements(80, 65, 30.4f);
		weatherDataSubject.setMeasurements(82, 70, 29.2f);*/
		
		
		WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
		CurrentConditionsDisplayBuiltinObserver currentConditionsDisplayObserver = new CurrentConditionsDisplayBuiltinObserver(weatherDataObservable);
		
		weatherDataObservable.setMeasurements(80, 65, 30.4f);
		
		
	}

}
