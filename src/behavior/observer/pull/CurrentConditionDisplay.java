package behavior.observer.pull;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private double temperature;
	private double humidty;
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidty = weatherData.getHumidty();
		display();
	}
	
	@Override
	public void display() {
		System.out.printf("현재 상태: 온도 %.1f℃, 습도 %.1f%%\n", temperature, humidty);
	}
}
