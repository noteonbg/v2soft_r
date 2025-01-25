package resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import resource.model.Resource;
import resource.service.ResourceServiceInterface;

@SpringBootApplication
public class StepByStepShouldBeFollowedAndNotTalkedAbout  implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StepByStepShouldBeFollowedAndNotTalkedAbout.class, args);
		

	}
	
	@Autowired
	private ResourceServiceInterface resourceServiceInterface;
	

	@Override
	public void run(String... args) throws Exception {
		// this gives you an idea what service function call means
		//for presentation.
		
		Resource r =new Resource(12,"A",false);
		boolean x = resourceServiceInterface.addResource(r);
		if(x)
			System.out.println("resource added");
		else
			System.out.println("resource not added");
		
		
		int resourceId=23;
		r =resourceServiceInterface.getResourceDetails(resourceId);
		if(r.getResourceId() == -1)
			System.out.println("resource not found");
		else
			System.out.println("resource foun d " + r.getResourceName());
		
		
		
		
		
		
	}

}
