package poc.springbasics;

public class Sim {
	
	private int simno;

	public Sim()
	{
		System.out.println("sim getting created");
	}

	public int getSimno() {
		return simno;
	}

	public void setSimno(int simno) {
		System.out.println("simno being set "); this.simno = simno;
	}
	
	

}
