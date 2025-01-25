package databsebasicswithspring;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.jdbc.Driver;

@ComponentScan("databsebasicswithspring")
public class Test {
	
	@Bean
	public JdbcTemplate horror()
	{
		JdbcTemplate t =null;
		try {
			SimpleDriverDataSource s
			=new SimpleDriverDataSource();
			Driver d =new Driver();
			s.setDriver(d);
			s.setUrl("jdbc:mysql://localhost:3309/test");
			s.setUsername("root");
			s.setPassword("1234");
			
			 t =new JdbcTemplate(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t;
		
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext c =
				new AnnotationConfigApplicationContext(Test.class);
		OurJdbcCode x = c.getBean(OurJdbcCode.class);
		//x.insert();
	//	x.singleselect();
		
		x.multiSelect();
		
		

	}

}
