package basics.spring;

public class A {
	
	private B y;//this is our logic spring has not forced us.

	public A()
	{
		System.out.println("A object got created");
	}
	
	public void setHi(B x)
	{
		y =x;
		
		System.out.println("WE have object of A also we have object of B also");
	}
	
	public void f1()
	{
		System.out.println("hey f1 at work");
	}
	
	public void f3()
	{
		System.out.println("hey f3 at work");
		
	}

}
