package com.example.webservicespoc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	
	@GetMapping("/poc")
	public ResponseEntity<Integer> doubleIt(@RequestParam int number)
	{
		ResponseEntity<Integer> result = null;
		if(number == 0)
			result =
			new ResponseEntity<Integer>(HttpStatus.BAD_REQUEST);
		else
			result =
			new ResponseEntity<Integer>(number*2,HttpStatus.OK);
		
		
		
		return result;
		
		
		
	}
	
	
	
	
	@GetMapping("/generalize1")
	public ResponseEntity<String> maybebetter() // kids satisfaction of seeing
	//inbuilt data types.. like String. arraylist
	{
		ResponseEntity<String> r
		=null;
		System.out.println("hello how are you");
		r =new ResponseEntity<String>("hello",HttpStatus.OK);
		
		return r;
		
		//why are you returning string and not ArrayList..
		//becuase my servcie fucntion returns String and not
		//ArrayList
		
		//why are we taking int as input argument
		// becuase my servcie fucntion input needed is an int
		// and not something else..
		
		
		
	}
	
	
	@PostMapping("/xyz")
	public String readObject(@RequestBody CUser user)//sin ever since dinosaur was codin
	{
		
		System.out.println(user);
		return "hi";
		
		
	}
	
	
	@GetMapping("/getuser")
	public CUser whocares()
	{
		CUser cuser =new CUser("A","B","C@d.com",1234);
		return cuser;
		
		
	}
	
	
	
	
	@GetMapping("/generalize")
	public String think() // kids satisfaction of seeing
	//inbuilt data types.. like String. arraylist
	{
		System.out.println("hello how are you");
		return "hello";
		
		//why are you returning string and not ArrayList..
		//becuase my servcie fucntion returns String and not
		//ArrayList
		
		//why are we taking int as input argument
		// becuase my servcie fucntion input needed is an int
		// and not something else..
		
		
		
	}
	
	@PostMapping("/generalize")
	public String think1() // kids satisfaction of seeing
	//inbuilt data types.. like String. arraylist
	{
		System.out.println("hello how are you ok");
		return "hello 1";
		
		//why are you returning string and not ArrayList..
		//becuase my servcie fucntion returns String and not
		//ArrayList
		
		//why are we taking int as input argument
		// becuase my servcie fucntion input needed is an int
		// and not something else..
		
		
		
	}




}
