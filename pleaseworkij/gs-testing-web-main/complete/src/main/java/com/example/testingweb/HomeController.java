package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	public HomeController()
	{
		System.out.println("hi object is created");
	}

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hi, World";
	}

}
