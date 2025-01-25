package resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import resource.dao.ResourceDAOInterface;
import resource.model.Resource;

@SpringBootApplication
public class StepByStepShouldBeFollowedAndNotTalkedAbout  implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SpringApplication.run(StepByStepShouldBeFollowedAndNotTalkedAbout.class, args);
		

	}
	
	@Autowired
	private ResourceDAOInterface resourceDaoInterface;
	

	@Override
	public void run(String... args) throws Exception {
		// this gives you an idea what service function call means
		//for presentation.
		
		//single select
		
		/*
		int resourceId=20;
		Optional<Resource> x = resourceDaoInterface.findById(resourceId);
		if(x.isPresent())
		{
			Resource r = x.get();
			System.out.println(r.getResourceName());
		}
		else
		{
			System.out.println("resource not found");
		}
		*/
		
		
		Resource r =new Resource(11,"X",true);
	
		try {
			boolean x = resourceDaoInterface.existsById(r.getResourceId());
			if(!x)
				resourceDaoInterface.save(r);
			System.out.println("Added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("could not add");
		}
		
		
		// adding logic
		
		
		
		
		
		
	}

}
