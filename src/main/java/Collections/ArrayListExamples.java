package Collections;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java");
		a.add("Python");
		System.out.println(a);
		a.add("Java");
		System.out.println(a);
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("C");
		b.add("C#");
		
		
		a.addAll(b);
		System.out.println(a);
		
		System.out.println(a.indexOf("C"));
		System.out.println(a.lastIndexOf("Java"));
		System.out.println(a.contains("Java"));
		System.out.println(a.containsAll(b));
		System.out.println(a.size());
		

	}

}
