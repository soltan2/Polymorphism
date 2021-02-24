package vehicule;

import java.util.*; 
import carParts.CarPart;
import carParts.Engine;
import carParts.FuelTank;
import carParts.Wheels;

public class Car {

	protected Collection<CarPart> list = new LinkedList<CarPart>();
	
	public Car() {
	
		Engine engine=new Engine();
		FuelTank tank=new FuelTank();
		Wheels wheels=new Wheels();
		 
		list.add(engine);
		list.add(tank);
		list.add(wheels);
	}
	
	public void run() {
		
		 for (Iterator<CarPart> i=list.iterator(); i.hasNext(); )
		     i.next();
	}
}
