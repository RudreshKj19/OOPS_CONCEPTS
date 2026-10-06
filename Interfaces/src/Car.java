
public class Car implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Car Started,...");
		System.out.println(Vehicle.no);
	}
	
	//default method
	public void stop() {
		System.out.println("Stop the Car");
	}
}
