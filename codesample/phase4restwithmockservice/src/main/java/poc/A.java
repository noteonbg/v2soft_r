package poc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	
	public A()
	{
		System.out.println("a object created");
		
	}
	
	@PostMapping("/anotherpoc")
	public ResponseEntity<Task> whocares(@RequestBody Task t)
	{
		
		ResponseEntity<Task> response =new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		if(t.getTaskId() == 3)
		{
			response =new ResponseEntity<>(t,HttpStatus.OK);
		}
		System.out.println(t.getTaskName());
		return response;
		
	}
	
	
	@GetMapping("/abc123")
	public String freak()
	{
		System.out.println("hello Freak function at work");
		return "hello";
		
	}

}
