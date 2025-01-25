package kts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

	public X()
	{
		System.out.println("X objecct created");
	}
	
	
	@Autowired
	public void xf(Y obj)
	{
		System.out.println("xf function called ");
		obj.yf();
	}
	
	public void f1()
	{
		System.out.println("this is x function");
		
	}
	
}
