package interfaces;

public class TestClass implements Movable {
	
	
	static int x=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass obj=new TestClass();
//		System.out.println("Access i using obj:"+i);
//		System.out.println(Movable.i);
//		Movable.view();
//		obj.show();
//		obj.getName();
		obj.chage_x();
		
	}
	
	public void chage_x()
	{
		x=3;
		System.out.println(x);
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Inside implementation:"+Movable.i);
	}

}
