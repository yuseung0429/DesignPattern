package behavior.observer.push;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weaterData = new WeatherData();
		Observer currentConditionDisplay = new CurrentConditionDisplay(weaterData);
		Observer currentPressureDisplay = new CurrentPressureDisplay(weaterData);
		weaterData.setMeasurements(24.0, 80.0, 960);
		weaterData.setMeasurements(30.0, 82.0, 1000);
		weaterData.setMeasurements(28.0, 75.0, 1040);
	}
}
