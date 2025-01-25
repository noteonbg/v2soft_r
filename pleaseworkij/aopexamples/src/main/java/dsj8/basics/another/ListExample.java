package dsj8.basics.another;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class ListExample {
	
	//interface List extends Collection.

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(645, "Hp Laptop", 1.00, "computer"));
		products.add(new Product(224, "iPhone", 1.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 1.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 1.00, "tv"));
		products.add(new Product(912, "One Plus", 1.00, "mobile"));
		products.add(new Product(88, "HP Printer", 1.00, "computer"));
		/*
	
		Collections.sort(products);
		
		//below function is taking 2 arguments.
		Collections.sort(products , (p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		
		
		
		
		
		
		
		
		
		//I dont know let us measure.
		
		//this is slow 
		Iterator<Product> i = products.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
	
		
		//this is fast
		for(Product p : products) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("******************");
		
		*/
	
		/*
		//poetic words, look code looks neat here

		products.stream()
			.filter(p -> p.getCategory().equals("mobile"))
			.forEach(p -> System.out.println(p));
			
			
		
		//long y = System.currentTimeMillis();
		//code looks ugly here.. 
		for(Product p : products) {
			if(p.getCategory().equals("mobile"))
			        System.out.println(p);
		}
		
		//long z = System.currentTimeMillis();
		//System.out.println(z-y);
		*/
		
		
	
		
		
		System.out.println("******************");
		
		List<Product> comps = products.stream()
		.filter(p -> p.getCategory().equals("computer"))
		.collect(Collectors.toList());
		
		List<Product> compProducts =new ArrayList<Product>();
		for(Product p : products) {
			if(p.getCategory().equals("computer"))
			        compProducts.add(p);
		}
		
		
		//what is that I want to stream
		//what intermediate operations we want to perform
		// what is terminal operation to perform.
		
		
		
		
		
	
		
		
		for(Product p : comps) {
			System.out.println(p);
		}
		
		System.out.println("******************");
		
		products.stream()
			.map(p -> p.getPrice())
			.forEach(p -> System.out.println(p));
		
		System.out.println("******************");
		
		double total = products.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, (p1,p2) -> p1+p2);
		
		System.out.println("total is " + total);
		
		
	}

}
