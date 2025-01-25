package whenconfusedstickwithbasics;

public class X {
	
	private Y obj;
	
	
	public X()
	{
		System.out.println("X object created");
	}

	public void setHorror(Y obj) {
		
		this.obj =obj;
		System.out.println("java bean naming convention");
	
	}
	
	public void f3()
	{
		
		System.out.println("this is function of X");
		obj.f1();
		
	}
	
	public void f4()
	{
				System.out.println("this is function f4 of X");
		obj.f1();
		
	}
	
	
	
	
	
	
	
}
