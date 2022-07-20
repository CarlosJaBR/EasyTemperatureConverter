package model;

public class TemperatureConverter {

	public TemperatureConverter() {
		
	}
	
	public double celsiusToFahrenheit(double c) {
		double fah = ((c*9)/5)+32;
		return fah;
	}
}
