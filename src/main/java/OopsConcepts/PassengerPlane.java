package OopsConcepts;

public class PassengerPlane extends Plane {
	
	public void fly()
	{
		System.out.println("Passenger Plane is flying at low height");
	}

	@Override
	public void takeOf() {
		// TODO Auto-generated method stub
		System.out.println("Passenger Plane is Taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("PassengerPlane is landing");

	}

}
