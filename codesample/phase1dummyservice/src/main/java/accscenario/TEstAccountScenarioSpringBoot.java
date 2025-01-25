package accscenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import accscenario.controller.AccountPresentation;
import smr.TestSpringBoot;

@SpringBootApplication
public class TEstAccountScenarioSpringBoot implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TEstAccountScenarioSpringBoot.class, args);
				
	}
	
	@Autowired
	private AccountPresentation ac;

	
	// run method is guranteed to runonly after the objects are created and wired
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ac.startTheApp();
	}

}
