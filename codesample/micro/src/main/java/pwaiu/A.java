package pwaiu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import any.C;




@Component
public class A {
	
	@Autowired
	private C x;
	

	
	public A() {
		System.out.println("A created");
	}



	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("f3 of A");
		x.f2();
		
	}
	
	


	  
	 
}
