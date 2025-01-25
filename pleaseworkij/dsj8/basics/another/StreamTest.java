package dsj8.basics.another;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/*
 * https://www.journaldev.com/2774/java-8-stream
 * https://mkyong.com/tutorials/java-8-tutorials/
 * 
 * Function and BiFunction: Function represents a function 
 * that takes one type of argument and returns 
 * another type of argument. 
 * Function<T, R> is the generic form where 
 * T is the type of the input to the function and 
 * R is the type of the result of the function.
 * 
 * ToIntFunction, ToLongFunction, ToDoubleFunction, ToIntBiFunction, ToLongBiFunction


Predicate and BiPredicate: 
 It represents a predicate against which elements of the stream are tested. 
. This is used to filter elements from the java stream. Just like Function, there are primitive specific interfaces for int, long and double.
Some of the Stream methods where Predicate or BiPredicate specializations are used are:

Stream<T> filter(Predicate<? super T> predicate)


Consumer and BiConsumer: It represents an operation that 
accepts a single input argument and returns no result. 
It can be used to perform some action on all the elements 
of the java stream


Some of the Java 8 Stream methods where Consumer, BiConsumer or it’s primitive specialization interfaces are used are:

Stream<T> peek(Consumer<? super T> action)
void forEach(Consumer<? super T> action)

Supplier: Supplier represent an operation through which we can generate new values in the stream. Some of the methods in Stream that takes Supplier argument are:
public static<T> Stream<T> generate(Supplier<T> s)
<R> R collect(Supplier<R> supplier,BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner)


 * 
 * 
 */

public class StreamTest {

	public static void main(String[] args) {
		
		
		IntStream.range(1, 10)
			.filter(no -> no %2 == 0)
			.forEach(no -> System.out.println(no));
		
		
			
		
		int x[]= {1,2,3,5,6,7,8,9,10};
		for(int i : x)
		{
			if( i % 2 ==0)
				System.out.println("value of i " + i);
			
			
		}
		
		
		
	}

}
