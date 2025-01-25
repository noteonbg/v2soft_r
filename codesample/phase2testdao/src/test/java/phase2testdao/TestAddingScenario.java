package phase2testdao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddingScenario {

	@Test
	void bothNumbersNegative() {
		
		int result=0;
		result = Adding.somerequirement(-2,-3);
		assertEquals(-5,result);
		
		
		
	}
	
	@Test
	void bothNumbersPositive() {
		
		int result=0;
		result = Adding.somerequirement(2,3);
		assertEquals(5,result);
		
		
		
	}
	
	@Test
	void firstNumberNegative() {
		
		int result=0;
		result = Adding.somerequirement(-2,3);
		assertEquals(-1,result);
		
		
		
	}
	
	
	@Test
	void secondNumberNegative() {
		
		int result=0;
		result = Adding.somerequirement(2,-3);
		assertEquals(-1,result);
		
		
		
	}
	
	

}
