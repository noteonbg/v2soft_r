package kts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TestSpringBoot implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestSpringBoot.class);
		
		
	}
	
	//which ever object you want from spring you create  rfernce
	//of it and use autowired
	@Autowired
	Y obj;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		obj.yf();
		
	}

}
