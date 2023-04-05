package OopsConcepts;

public class ChildClass extends ParentClass{
	
	String name="xyz";
	
	public ChildClass()
	{
//		super();
		System.out.println("child class constructor");
	}
	
	public void getName()
	{
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass pc=new ChildClass();
		
		pc.getName();

	}

}
