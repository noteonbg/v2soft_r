package dsj8.basics.another;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Double> books = new HashMap<String, Double>();
		books.put("Java", 450.00);
		books.put("Oracle", 2550.00);
		books.put("JS", 450.00);
		books.put("goLang", 5450.00);
		
		books.put("Oracle", 999.00);
		
		System.out.println(books.get("JS"));
		System.out.println(books.get("Oracle"));
		
		books.forEach((k,v) -> {
			System.out.println(k + " :  " + v);
		});
	}

}
