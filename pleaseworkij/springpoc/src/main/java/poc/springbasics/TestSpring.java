package poc.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx = new
                ClassPathXmlApplicationContext( "carrot.xml" );
		
		/*
		Mobile m=ctx.getBean(Mobile.class);//with this spring job is over..
		m.makeCall();

		String s =ctx.getBean(String.class);

		*/


		
		
		
		
		//if we have clarity in OO in our design, then coding is simple.
		

		

		Presentation p = ctx.getBean(Presentation.class);//after this spring job is over...

		p.startTheApp();// business logic...
		
		//DAOLayer d = ctx.getBean(DAOLayer.class);
		

		
		
		//Presentation p =new Presentation();

		
		

		
		
		
		
		
		
		

	}

}
