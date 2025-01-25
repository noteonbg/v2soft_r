package poc.springbasics;

public class Mobile {
	
	private Sim s;
	
	public void setHorrible(Sim y)
	{
		s =y;
	}
	
	

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("making call using sim " + s.getSimno());
		
	}

}
