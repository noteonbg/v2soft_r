package basics.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//entry point for spring
		ClassPathXmlApplicationContext c =new ClassPathXmlApplicationContext("carrot.xml");
		
		/*
		 * A obj = c.getBean(A.class);//once we get the object created by spring spring
		 * job is over, //exit point for spring
		 * 
		 * 
		 * A obj1 = c.getBean(A.class);
		 * 
		 * A obj2 = c.getBean(A.class);
		 * 
		 * if( obj == obj2) System.out.println(123);
		 * 
		 * 
		 * obj.f1();
		 */
		
		
		
		
		

	}

}
