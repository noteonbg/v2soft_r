package com.poc.springbootjpaexample;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjpaexampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaexampleApplication.class, args);
		System.out.println("please work");

	}
	
	@Autowired
	CUserDao cdao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ok patience");
		
		//insert command
		CUser user =new CUser("freak","great","notgreat",213);
		
		/*
		if(!cdao.existsById(user.getUsername()))
		{
			cdao.save(user);
			System.out.println("inserted");
			
		}
		else
			System.out.println("not inserted");
		
		*/
		
		
		/*
		
		if(cdao.existsById(user.getUsername()))
		{
			cdao.save(user);
			System.out.println("updated");
			
		}
		else
			System.out.println("not updated");
			
			*/
		
		/*
		
		List<CUser> allrows = cdao.findAll();
		System.out.println(allrows);
		
		*/
		
		List<CUser> allrows = cdao.findBypincode(4);
		System.out.println(allrows);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
