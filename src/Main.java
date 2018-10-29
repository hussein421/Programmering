
public class Main {

	public static void main(String[] args) {
		Formulas calculator = new Formulas();
	
		
		System.out.println(calculator.fahrenheitToCelsius(40));
		System.out.println("tryck enter för att forsätta");
		System.out.println(calculator.kelvinToCelsius(30));
		System.out.println(calculator.fluidPressure(840/*oljas densitet*/, 9));
		System.out.println(calculator.pressureUnderWater(14));
		
	}

}
