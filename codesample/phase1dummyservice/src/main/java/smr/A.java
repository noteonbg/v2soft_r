package smr;

import org.springframework.stereotype.Component;

@Component
public class A {
	
	public A()
	{
		System.out.println("for kids satisfaction A object getting created");
	}
	
	public void f1()
	{
		System.out.println("this is f1 function of A");
	}

}
