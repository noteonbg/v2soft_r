package archcodewithspringdb;

import org.mariadb.jdbc.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@ComponentScan("archcodewithspringdb")
public class TestArchitecture {
	
	@Bean
	public JdbcTemplate f1()
	{
		JdbcTemplate x =null;
		
		Driver d =new Driver();
		SimpleDriverDataSource s =new SimpleDriverDataSource(d,"jdbc:mariadb://localhost:3309/test","root","1234");
		x =new JdbcTemplate(s); //green and red wired
		return x;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(TestArchitecture.class);
		//here we give a class on which we used @ComponentScan annotation.
		
		/*
		 * JDBCImplemntation x = ac.getBean(JDBCImplemntation.class); x.f1();
		 */
		
		
			
		Presentation p =ac.getBean(Presentation.class);
		
		p.startTheApp();
		p.shutdownapp();
		
		
		
		
		/*
		 
		
		once you understand this program come up with a logic for
		Emp  empno,mobileno ,deptid are all ints
		empname is a string, create a class
		demonsrate insert , single select and update , delete, multi select based on deptid
		
		*/
		

	}

}
