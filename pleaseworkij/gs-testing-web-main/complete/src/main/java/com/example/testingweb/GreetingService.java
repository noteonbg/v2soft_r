package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public GreetingService()
	{
		System.out.println("this is greeting service");
	}
	public String greet() {
		System.out.println("this is greet funtion of service");
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello, World";
	}
}
