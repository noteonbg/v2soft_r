package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class CfgExample {
	
	@Autowired
	private LoadBalancedExchangeFilterFunction filterFunction;
	
		@Bean
	    public WebClient getClient() 
		{
			
	        return WebClient.builder()
	        		.baseUrl("http://service2/anotheroperation")
	                .filter(filterFunction)
	                .build();
	    }
	    
	    
	    

		@Bean
	    public Service2Client getServiceReally() {
			
			
    		        

		
		HttpServiceProxyFactory httpServiceProxyFactory =
		        HttpServiceProxyFactory.builderFor(WebClientAdapter.create(getClient())).build();
		return httpServiceProxyFactory.createClient(Service2Client.class);
		
		  
		
        
        
	    }
	

}
