package springexamplesusingannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import any.C;
import pwaiu.A;
import pwaiu.B;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  AnnotationConfigApplicationContext c =new
		  AnnotationConfigApplicationContext(TSWCSIU.class);
		  
		  B temp = c.getBean(B.class);
		  
		  C temp1 = c.getBean(C.class);
		  C temp2 = c.getBean(C.class);
		  System.out.println(temp1  == temp2);
		  
		  temp.f4();
		  
		/*
		 * A temp = c.getBean(A.class);
		 * 
		 * temp.f3();
		 */
		  
		  // 1. create a class called B in same pacakge as where A is present. B object is created by spring.
		  //2 ensure A object is autowired in B.
		  // in test.java code ensure you get the B object. dont need to call any function.
		  
		  
		  
		  
		  
		 
		//TSWCSIU t=null;
		//Tell Spring Where Component Scan Is Used.
		
				
		

	}

}
