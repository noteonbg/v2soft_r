package whocares;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	@Autowired
	public void whocares(B obj)
	{
		System.out.println("B object put inside A");
	}
	
	public A()
	{
		System.out.println("A object created");
	}

}
