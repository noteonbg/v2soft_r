package poc.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx = new
                ClassPathXmlApplicationContext( "carrot.xml" );
		
		
		Mobile m=ctx.getBean(Mobile.class);
		m.makeCall();
		
		
		
		
		//if we have clarity in OO in our desing, then coding is simple.
		
	// i will askspring to give me  the object.
		//p.startTheApp();
		
		/*
		Presentation p = ctx.getBean(Presentation.class);//after this spring job is over...
		
		DAOLayer d = ctx.getBean(DAOLayer.class);
		
		B obj =ctx.getBean(B.class);
		
		
		//Presentation p =new Presentation();
		p.startTheApp();// business logic...
		
		
		//after this tells pring hey give me the wired object.
		*/
		
		
		
		
		
		
		
		

	}

}
