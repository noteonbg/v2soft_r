package archpocannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceLogic {
	
	private DAOLayer d;
	
	public ServiceLogic()
	{
		System.out.println("servioce object got created.");
	}
	
	

	@Autowired
	public void setD(DAOLayer d) {
		System.out.println("dao layer object wired in service");
		this.d = d;
	}



	public String someServiceFunction(Courier c) {
		
		System.out.println("this is service, got data from presentation");
		// TODO Auto-generated method stub
		
		d.talkwithDB(c);
		System.out.println("this is service telling presetnation what happened");
		return "status of logic in service";
	}

}
