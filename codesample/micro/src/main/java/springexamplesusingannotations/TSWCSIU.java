package springexamplesusingannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import any.C;

@ComponentScan("pwaiu,any")  //package where annotations is used
public class TSWCSIU {
	
	@Bean
	public Integer f7()
	{
		Integer x = Integer.valueOf("1");
		return x;
		
	}
	
	
	// we want to tell spring hey i created the object, you please use it.. for your wiring
	@Bean
	public C f1()
	{
		System.out.println("C object created by us");
		C obj =new C();
		return obj;
		
	}

}
