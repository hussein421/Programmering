
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
	public static double pressureUnderWater(double deep) /*4an*/{
		double pressure = 9.82*997/*vatten densitet*/*deep;
		return pressure;
	}
	public static double kineticEnergy(double mass, double velocity)/*5an*/ {
		double KineticEnergy = mass*Math.pow(velocity, 2)*0.5;
		return KineticEnergy;
	}
	public static double potentialEnergy(double mass, double height) /*6an*/{
		double PotentialEnergi= mass*height*9.82;
		return PotentialEnergi;
	}
	public static double fallSpeed(double height)/*7an*/{
		double fallsped = 
	}
	public static double delta(double first, double last) {
		double delta= first-last;
		return delta;
		
	}
	public static double volumeToMass(FluidTable fluid, double volume) {
		double VolymToMass= fluid.density*volume;
		return VolymToMass;
	}
	public static double volumeToMass(GasTable gas, double volume) {
		double VolymToMass= gas.density*volume;
		return VolymToMass;
	}
}
