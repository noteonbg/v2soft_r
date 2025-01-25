package spring_archcode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("spring_archcode")
public class TestArchitecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext c
		=new AnnotationConfigApplicationContext(TestArchitecture.class);
		Presentation p =c.getBean(Presentation.class);
		p.startTheApp();
		/*
		 
		
		once you understand this program come up with a logic for
		Emp  empno,mobileno ,deptid are all ints
		empname is a string, create a class
		demonsrate insert , single select and update , delete, multi select based on deptid
		
		*/
		

	}

}
