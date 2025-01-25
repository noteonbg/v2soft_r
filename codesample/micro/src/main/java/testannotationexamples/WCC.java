package testannotationexamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import plts.B;

@ComponentScan("plts")
public class WCC {
	
	  // we are telling spring hey i am 
	@Bean//creating the object but i want spring to use it.
	public B f1()
	{
		B obj =new B();//who is creating object here
		return obj;
		
	}
	
	
	
	

}
