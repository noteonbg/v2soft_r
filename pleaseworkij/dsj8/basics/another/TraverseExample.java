package dsj8.basics.another;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseExample {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Harry","Peter","George","Kim");
//		
		List<String> names = new ArrayList<>();
		names.add("Harry");
		names.add("Peter");
		
		System.out.println("******");
		for(int i = 0 ; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("***********");
		for(String name : names) {
			names.add("A"); // failfast
			System.out.println(name);
		}
		System.out.println("******");
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			names.add("A"); // failfast
			String name = iter.next();
			System.out.println(name);
		}
	}

}
