package poconBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	@Autowired
	public void f1(String y)
	{
		System.out.println("f1 wired in the A");
		
	}

}
