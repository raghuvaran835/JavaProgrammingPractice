package OopsConcepts;

public class ConstructorChaining {
	
	public ConstructorChaining() {
		// TODO Auto-generated constructor stub
		this(5);
	}
	public ConstructorChaining(int x) {
		// TODO Auto-generated constructor stub
		this(5,10);
	}
	public ConstructorChaining(int x,int y) {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to constructor Chaining!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining cc=new ConstructorChaining();
	}

}
