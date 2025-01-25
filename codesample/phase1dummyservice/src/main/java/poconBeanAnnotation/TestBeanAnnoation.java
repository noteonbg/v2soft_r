package poconBeanAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestBeanAnnoation {
	
	@Bean
	public X nobodycares()
	{ 
		return new X();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =null;
		SpringApplication.run(TestBeanAnnoation.class, args);
		
		
		

	}

}
