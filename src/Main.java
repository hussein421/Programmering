
public class Main {

	public static void main(String[] args) {
		Formulas calculator = new Formulas();
	
		
		System.out.println(calculator.fahrenheitToCelsius(40));/*1*/
        System.out.println(calculator.kelvinToCelsius(30));/*2*/
		System.out.println(calculator.fluidPressure(840/*oljas densitet*/, 9));/*3*/
		System.out.println(calculator.pressureUnderWater(14));/*4*/
		System.out.println(calculator.kineticEnergy(20, 30));/*5*/
		//System.out.println(calculator.potentialEnergy(mass, height));/*6*/
		System.out.println(calculator.delta(10, 15));/*8*/
		System.out.println(calculator.volumeToMass(FluidTable.WATER, 10));/*9*/
		System.out.println(calculator.volumeToMass(GasTable.OXYGEN, 1));
	
	}

}
