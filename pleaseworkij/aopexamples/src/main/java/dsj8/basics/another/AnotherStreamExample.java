package dsj8.basics.another;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnotherStreamExample {
	
	class A implements Function<Integer, Integer>
	{

		@Override
		public Integer apply(Integer t) {
			// TODO Auto-generated method stub
			System.out.println("this is apply function");
			return t *t;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5);
		  
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    
	    
	    System.out.println(square);
	    
	    
	  
	    // create a list of String
	    List<String> names =
	                Arrays.asList("Reflection","Collection","Stream");
	  
	    // demonstration of filter method
	    List<String> result = names.stream().filter(s->s.startsWith("S")).
	                          collect(Collectors.toList());
	    System.out.println(result);
	  
	    // demonstration of sorted method
	    List<String> show =
	            names.stream().sorted().collect(Collectors.toList());
	    System.out.println(show);
	  
	    // create a list of integers
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	  
	    // collect method returns a set
	    Set<Integer> squareSet =
	         numbers.stream().map(x->x*x).collect(Collectors.toSet());
	    System.out.println(squareSet);
	  
	    // demonstration of forEach method
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	    
	    
	    
	    
	    
	    
	    
	  
	    // demonstration of reduce method
	    int even =
	       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	  
	    System.out.println(even);

	}

}
