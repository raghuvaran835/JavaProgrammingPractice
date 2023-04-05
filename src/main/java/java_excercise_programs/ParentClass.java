package java_excercise_programs;

public class ParentClass {
	String name = "Raghuvaran";

	// static {
	// System.out.println("Parent class static block");
	// }
	//
	// {
	// System.out.println("Parent initialize block");
	// }

	ParentClass() {
		this("Studytonight");
	}

	ParentClass(String str) {

		System.out.println(str);

	}

	public void getName() {
		System.out.println("Studytonight");
	}

	public ParentClass display() {
		// return current object
		return this;
	}

	public void test1() {
		System.out.println("test1 method");
	}

}
