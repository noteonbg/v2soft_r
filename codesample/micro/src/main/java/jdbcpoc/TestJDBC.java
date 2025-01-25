package jdbcpoc;

import java.util.List;

import org.mariadb.jdbc.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import daolayer.SpringJDBCDAO;

public class TestJDBC {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(CS.class);
		SpringJDBCDAO sjd = ac.getBean(SpringJDBCDAO.class);
		sjd.f1();
		CUser user =new CUser("c198","p2","c1@d1.com",89);
		//sjd.insertLogic(user);
		
		/*
		 * boolean status = sjd.updateLogic(user); System.out.println(status);
		 */
		
		/*
		 * String userid="c341"; user = sjd.getUserDetails(userid);
		 * System.out.println(user.getPincode());
		 */
		
		int pincode =4;
		List<CUser> l = sjd.getMultiple(pincode);
		System.out.println(l.size());
		
		
		
		
		
		
	}
	
	

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		CUser user =new CUser();
		
		System.out.println(1);
		JdbcTemplate x =null;
		
		Driver d =new Driver();
		SimpleDriverDataSource s =new SimpleDriverDataSource(d,"jdbc:mariadb://localhost:3309/test","root","1234");
		x =new JdbcTemplate(s);
		x.update("insert into item(itemno) values (23)");
		System.out.println("db working");
	
		

	}

}
