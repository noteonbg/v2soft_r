package poc.springbasics;

public class Mobile {
	
	private Sim s;

	public Mobile()
	{
		System.out.println("mobiel getting created");
	}
	
	public void setHorrible(Sim y)
	{
		s =y;
		System.out.println("sim put in mobile");
	}
	
	

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("making call using sim " + s.getSimno());
		
	}

}
