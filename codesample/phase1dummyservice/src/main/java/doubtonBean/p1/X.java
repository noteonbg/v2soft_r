package doubtonBean.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import doubtonBean.p2.Y;

@Component
public class X {
	
	@Autowired
	public void sety(Y y)
	{
		System.out.println(y.getClass().getName());
	}
	
	
}
