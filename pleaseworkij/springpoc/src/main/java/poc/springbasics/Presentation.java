package poc.springbasics;





public class Presentation {
	
	private ServiceLogic s;
	
	public Presentation()
	{
		System.out.println("prsentation object got created.");
	}
	
	

	public void setS(ServiceLogic s) {
		System.out.println("service object wired in prsentation");
		this.s = s;
	}



	public void startTheApp() {
		// TODO Auto-generated method stub
		System.out.println("presnetation starts ");
		Courier c =new Courier();
		String status = s.someServiceFunction(c);
		System.out.println("based on service return, will update presentation");
		
	}

}
