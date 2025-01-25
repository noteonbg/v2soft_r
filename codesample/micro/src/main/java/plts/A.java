package plts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	private B obj;
	
	public A()
	{
		System.out.println("A created");
	}
	
	@Autowired
	public void setwhocares(B temp)
	{
		System.out.println("wiring will happen here");
		obj = temp;
		
	}

}
