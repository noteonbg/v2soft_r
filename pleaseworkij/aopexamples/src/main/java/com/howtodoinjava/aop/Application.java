package com.howtodoinjava.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Autowired
	private Freak freak;
	//private DomainService domainService;
	
	@Autowired
	private Freak freak1;
	
	

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//domainService.getDomainObjectById(1L);
		
		String msg = freak == freak1 ? "same ": "different objects";
		System.out.println(msg);
		
		//freak.f1();
		
	}
}
