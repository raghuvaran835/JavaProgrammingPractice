package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Raghu");
		hm.put(1, "Charan");
		hm.put(2, "Lokesh");

		System.out.println(hm);

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key:" + entry.getKey());
			System.out.println("Value:" + entry.getValue());
		}

		Set sn = hm.entrySet();
		System.out.println(sn);

		Iterator it = sn.iterator();

		while (it.hasNext()) {
			
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getValue());
		}

	}

}
