package doubtonBean;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import doubtonBean.p1.X;
import doubtonBean.p2.Y;

@ComponentScan
public class TestX {
	
	@Bean
	public Y f1()
	{
		Y y =new Y();
		return y;
		
	}
	
	@Bean
	public doubtonBean.p3.Y f2()
	{
		doubtonBean.p3.Y y =new doubtonBean.p3.Y();
		return y;
		
	}
	
	
	
	
	
	
public static void main(String[] args) {
	
	SpringApplication.run(TestX.class, args);
	
}	

}
