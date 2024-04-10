package behavior.observer.push;

@SuppressWarnings("unused")
public class CurrentPressureDisplay implements Observer, DisplayElement{
	private double pressure;
	private WeatherData weatherData;
	
	public CurrentPressureDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(double temperature, double humidty, double pressure) {
		this.pressure = pressure;
		display();
	}
	
	@Override
	public void display() {
		System.out.printf("현재 상태: 기압 %.1f\n", pressure);
	}
}
