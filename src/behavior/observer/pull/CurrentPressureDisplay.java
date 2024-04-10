package behavior.observer.pull;

public class CurrentPressureDisplay implements Observer, DisplayElement{
	private double pressure;
	private WeatherData weatherData;
	
	public CurrentPressureDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		this.pressure = weatherData.getPressure();
		display();
	}
	
	@Override
	public void display() {
		System.out.printf("현재 상태: 기압 %.1f\n", pressure);
	}
}
