package phase1dummyservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class STest {

	@Test
	void ns() {
		String expecting="HELLO";
		String got = S.processString("hello");
		assertEquals(expecting,got);
	}
	
	@Test
	void fs()
	{
		String expecting="horrible";
		String got = S.processString("");
		assertEquals(expecting,got);
		
	}
	
	
	

}
