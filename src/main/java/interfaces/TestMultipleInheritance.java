package interfaces;

public class TestMultipleInheritance implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestMultipleInheritance obj=new TestMultipleInheritance();
		obj.show();
		obj.view();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("implementing the show method");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("implementing the view method");
	}

}
