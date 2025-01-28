package com.example.service1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service1data")
public class Service1 {
	 
	private static final Logger LOGGER
    = LoggerFactory.getLogger(Service1.class);
	
	@Autowired
	private Service2Client service2client;
	

    @GetMapping
    public String f1()
    {
    	LOGGER.info("decide what you want to do in f1");
        return "servcie1 function getting some data";
    }
    
    @GetMapping("/callingwebservice/{freak}")
    public String f2(@PathVariable("freak") String freak)
    {
    		System.out.println("calling web service" + freak);
    		//System.out.println("are we getting the class " + service2client.getClass());
    		// service3client.whateverufnction(3);
    		return service2client.someLogic(freak);
    	//	return "hi";
    		
    	
      }
    
}
