package testhelloworld;

import org.springframework.stereotype.Component;

@Component
public class A {
	

	private int i;
	
	
	private B obj;//reference
	private C obj1;
	
	
	
	
	public void setJunk(B obj) {
		obj1 =new C();
		this.obj = obj;
		System.out.println("setJunk function called");
	}




	public A()
	{
		System.out.println("A object created");
	}
	
	void f4()
	{	obj1.f5();
		obj.f1();
		System.out.println("this is job done by A");
		
		
	}
	
	
}
