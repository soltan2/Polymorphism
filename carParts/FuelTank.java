package carParts;

public class FuelTank extends CarPart implements Functional {

	protected int tankLevel;

	@Override
	public void function(String message) {
		System.out.println(message);
	}
}
