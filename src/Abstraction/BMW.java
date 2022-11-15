package Abstraction;
public class BMW implements car, FiveStarSafty, CarLightsStandards{

	@Override
	public void stablityControl() {
		

	}

	@Override
	public int sum(int a, int b) {

		System.out.println("in the BMW: SUM = " + (a + b));

		return a + b;
	}

	@Override
	public void turnSignalRight() {
		
		
	}

	@Override
	public void something() {
		
	}



}
