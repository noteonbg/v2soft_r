package pwaiu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	@Autowired
	private A obj;
	
	@Autowired
	private Integer i;
	
	
	public B()
	{
		System.out.println("B object got created");
	}

	public void f4() {
		// TODO Auto-generated method stub
		System.out.println("f4 function of B");
		obj.f3();
		
	}
	

}
