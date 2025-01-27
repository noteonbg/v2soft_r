package com.example.service2;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/anotheroperation")
public class Service2 {
	
	
	@GetMapping("/great/{inputgiven}")
	public String someLogic(@PathVariable("inputgiven")  String inputgiven)
	{
		
		
		return inputgiven.toUpperCase();
		
	}
	
	
}
