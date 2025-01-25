package com.example.webservicespoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class POCTestCase {

	@Test
	void test() {
		
		 
		int result =POC.getresult(2, 3); 
		assertEquals(result, 5,"did not get 5");
			
	}
	
	@Test
	void test1() {
		
		 
		int result =POC.getresult(-2, -3); 
		assertEquals( -5,result,"did not get -5");
			
	}

}
