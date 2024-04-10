package behavior.observer.push;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private double temperature;
	private double humidty;
	private double pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers)
			observer.update(temperature, humidty, pressure);
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidty = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
