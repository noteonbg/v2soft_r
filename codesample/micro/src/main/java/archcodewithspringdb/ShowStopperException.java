package archcodewithspringdb;

public class ShowStopperException extends Exception {

	public ShowStopperException(Exception  e, String message) {
		
			super(message, e);//calling parametrized constructor of super class Exception
			//this is constructor call using super, it must be first line in the subclass constructor only.
			
		// TODO Auto-generated constructor stub
	}
	

}
