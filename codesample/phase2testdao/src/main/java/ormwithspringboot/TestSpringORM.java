package ormwithspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringORM  implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestSpringORM.class, args);
	}

	@Autowired
	private X x;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//x.isItWorking();
	//	x.insert();
		
		//x.singleSelect();
		
		//x.update();
		
		x.getAll();
		
		
	}
	
	
	
	

	
	
}
