package phase1dummyservice;

public class S {

	public static String processString(String input) {
		// TODO Auto-generated method stub
		if(input.trim().length() ==0)
			return "horrible";
		
		
		return input.toUpperCase();
	}

}
