package com.example.webservicespoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
public class SessionPoc {

	public static void main(String[] args) {
SpringApplication.run(SessionPoc.class, args);

	}

}

@RestController
@RequestMapping("/spoc")
class X
{
	@PostMapping
	public String f1(HttpSession session,@RequestParam("x")  String x)
	{
		session.setAttribute("k1", x);
		return "hi";
		
		
	}
	
	@GetMapping
	public String f2(HttpSession session)
	{
		Object m1 = session.getAttribute("k1");
		String message = m1 == null ? "session not set" :m1.toString();
		return message;
		
	}
	
	
}
