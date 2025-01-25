package jdbcpoc;

import org.mariadb.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@ComponentScan("daolayer")
public class CS {
	
	@Bean
	public JdbcTemplate f1()
	{
		JdbcTemplate x =null;
		
		Driver d =new Driver();
		SimpleDriverDataSource s =new SimpleDriverDataSource(d,"jdbc:mariadb://localhost:3309/test","root","1234");
		x =new JdbcTemplate(s); //green and red wired
		return x;
		
		
	}

}
