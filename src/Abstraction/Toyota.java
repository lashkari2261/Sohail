package Abstraction;

public class Toyota implements FiveStarSafty {

	@Override
	public void stablityControl() {
		// TODO Auto-generated method stub

	}

	@Override
	public int sum(int a, int b) {
		System.out.println("in the Toyota: SUM = " + (a + b));

		return a + b;
	} 
	

}
