package testhelloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("testhelloworld")
public class TestAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext c
		=new AnnotationConfigApplicationContext(TestAnnotations.class);
		
		
		
	}

}
