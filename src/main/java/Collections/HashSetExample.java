package Collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet,treeset,LinkedHashSet  implements Set
		
//		does not accept duplicate value
//		There is a no guarantee that element stored in same order. Random order
//		Indexing is not possible
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("India");
		hs.add("US");
		hs.add("India");
		hs.add("UK");
		hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.size());
		
	}

}
