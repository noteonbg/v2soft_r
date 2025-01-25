package resource.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import resource.model.Resource;



@RestController
public class ResourceController {
	
	
	
	
	// http://localhost:777/gr/3
	@GetMapping("/gr/{resourceId}")
	public Resource getResourceDetails(@PathVariable int resourceId) {
		
		//returning from the controller function http status + model.
		System.out.println("Hello");
		System.out.println("controller got input " + resourceId);
		Resource r =new Resource(99,"no logic here",false);
		return r;
		
	}
	
	
	
	// erquest body somebody has to supply resource object.
	//as a json spring will convert that into java object
	@PostMapping("/ar")
	public boolean addResource(@RequestBody Resource r) {
		
		System.out.println("input got i  s" + r.getResourceName());
		return false;
		
	}
	

}
