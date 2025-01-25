package dsj8.basics.another;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Product> products = new HashSet<>();

		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv")); // duplicate
		products.add(new Product(224, "iPhone", 98000.00, "mobile")); // duplicate
		
		for(Product p : products) {
			System.out.println(p);
		}

	}

}
