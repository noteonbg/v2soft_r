package cjbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c
		=new ClassPathXmlApplicationContext("tomato.xml");
		Presentation p = c.getBean(Presentation.class);
		p.startTheApp();
		
		
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c
		=new ClassPathXmlApplicationContext("tomato.xml");
		Mobile m = c.getBean(Mobile.class);
		
		
		/*
		Sim s = c.getBean("nc",Sim.class) ;// Invite Trouble
		System.out.println(s.getSimno());
		*/
		

	}

}
