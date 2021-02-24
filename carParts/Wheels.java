package carParts;

public class Wheels extends CarPart implements Functional{

	protected int wearLevel;

	@Override
	public void function(String message) {
		System.out.println(message);
	}
}
