package demo.poc.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootexampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootexampleApplication.class, args);
		System.out.println("hi");




		//System.out.println(1);
	}



	@Autowired
	private B obj;
	/*
	@Autowired
	private A temp;

	*/

	@Override
	public void run(String... args) throws Exception {

		obj.bFunction();

			//temp.somefunctionofA();


	}
}
