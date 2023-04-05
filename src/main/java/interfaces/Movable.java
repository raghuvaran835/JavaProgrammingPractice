package interfaces;

public interface Movable {
	static int i=1;
	
	static void view()
	{
		System.out.println("static method");
	}
	
	default void show()
	{
		System.out.println("default method");
	}
	
	void getName();
}


