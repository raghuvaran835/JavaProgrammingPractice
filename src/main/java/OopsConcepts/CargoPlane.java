package OopsConcepts;

public class CargoPlane extends Plane {
	
	public void fly()
	{
		System.out.println("CargoPlane is flying at medium height");
	}
	
	public void fly1()
	{
		System.out.println("flying");
	}

	@Override
	public void takeOf() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane is taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane is landing");

	}
	

}
