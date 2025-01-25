package mockitopoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

interface X
{
	String f1();
	int f2();
	
}

class A implements X
{
	public String f1()
	{
		return "hello";
	}
	
	public int f2()
	{
		
		return 3;
	}
	
	
}

public class AnotherPoc {
	
	@Test
	public void poc()
	{
		X temp =new A();
		X temp1 = spy(temp);
		when(temp1.f1()).thenReturn("freak"); // Stubbing on the spy
		when(temp1.f2()).thenReturn(34);
		assertEquals("freak",temp1.f1());
		assertEquals(3,temp1.f2());
		
		
		
		//assertEquals(true, true);
		
	}


}
