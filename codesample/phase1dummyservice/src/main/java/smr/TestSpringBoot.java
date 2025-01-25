package smr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBoot implements CommandLineRunner {
	
	// I want the A object created by spring boot in my code

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestSpringBoot.class, args);
		
	}
	
	@Autowired
	private A temp;// I wanted to test A becuase i know spring has got
	//A object with it..

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring is going to call this function");
		temp.f1();
	}
	
	

}
