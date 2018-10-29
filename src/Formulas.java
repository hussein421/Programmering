
public class Formulas {
	
	public static double fahrenheitToCelsius(double fahrenheit)/*1an*/ {
		double celsius = ((fahrenheit-32)*5)/9;
		return celsius;
	}
	public static double kelvinToCelsius(double kelvin)/*2an*/ {
		double celsius = kelvin - 273.15;
		return celsius;
	}
	public static double fluidPressure(double fluid,double deep)/* 3an*/ {
		double g= 9.82;
		double vätsketryck = g*fluid*deep;
		return vätsketryck;
	}
	public static double pressureUnderWater(double deep) {
		double G= 9.82;
		double pressure = G*997/*vatten densitet*/*deep;
		return pressure;
	}
	

}
