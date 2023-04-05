package OopsConcepts;

public class PolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
	
		Plane ref=cp;
		ref.fly(); //--->1
		
		ref=pp;
		ref.fly(); //--->2
		
		ref=fp;
		ref.fly(); //--->3
		
//		cp.fly();
//		pp.fly();
//		fp.fly();
		
//		one ref and 3 outputs=>Polymorphism
		
		//Parent class reference can access only inherited and overridden methods .it cannot access specialized methods

	}

}
