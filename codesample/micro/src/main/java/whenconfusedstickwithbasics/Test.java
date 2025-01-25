package whenconfusedstickwithbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext c
	=new ClassPathXmlApplicationContext("tomato.xml");
	
	
	//below line is telling spring hey spring
	//you must havea  X class obejct which you
	//created and wired please give me the object
	X obj =c.getBean(X.class);
	
	obj.f3();

	}

}
