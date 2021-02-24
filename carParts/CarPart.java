package carParts;

public class CarPart implements Functional {

	protected int condition;
	
	
	public CarPart() {
		
		this.condition=100;
		
	}
	
	public void status() {
			
		System.out.println("The condition of the part is"+ this.condition);
	}

	@Override
	public void function(String message) {
	
	}
	
}
