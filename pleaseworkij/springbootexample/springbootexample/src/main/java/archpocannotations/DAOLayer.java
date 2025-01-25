package archpocannotations;

import org.springframework.stereotype.Component;

@Component
public class DAOLayer {
	
	public  DAOLayer()
	{
		System.out.println("db connection established");
	}

	public void talkwithDB(Courier c) {
		// TODO Auto-generated method stub
		System.out.println("DB layer talking with DB");
		System.out.println("return to service ");
		
	}
	
	

}
