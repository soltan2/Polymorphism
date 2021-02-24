package carParts;

public class Engine extends CarPart implements Functional{

	protected int numOfCylinders;

	@Override
	public void function(String message) {
		System.out.println(message);
	}
	
}
