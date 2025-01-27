package com.example.service1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface Service2Client {
	
	@GetExchange("/great/{inputgiven} ")
	public String someLogic(@PathVariable("inputgiven")  String inputgiven);
	
	
	
	

}
