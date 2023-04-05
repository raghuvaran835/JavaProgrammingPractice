package OopsConcepts;

public class FighterPlane extends Plane {

	public void fly()
	{
		System.out.println("FighterPlane is flying at high height");
	}

	@Override
	public void takeOf() {
		// TODO Auto-generated method stub
		System.out.println("FighterPlane is taking off");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("FighterPlane is landing");

	}
}
