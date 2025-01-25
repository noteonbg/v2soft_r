package testhelloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj =new A();
		ClassPathXmlApplicationContext c =new ClassPathXmlApplicationContext("carrot.xml");
	    //the objects are with spring... both A and B  we should how to get the object
		//from spring
		

		A temp1=c.getBean(A.class); //with this spirng job is over

		/*
		temp1.f4();  //this is our business logic.

		*/

		
		

	}

}
