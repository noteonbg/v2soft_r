package testpoc;

public class Mobile {
	
	private Sim s;
	private Battery b;
	
	public Mobile()
	{
		System.out.println("Mobile created");
		b =new Battery();
		b.setMah(4000);
	}
	
	public void putSim(Sim y)
	{
		s = y;
		
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("making call" + s.getSimno() + " --" + b.getMah());
		
	}
	
	

}
