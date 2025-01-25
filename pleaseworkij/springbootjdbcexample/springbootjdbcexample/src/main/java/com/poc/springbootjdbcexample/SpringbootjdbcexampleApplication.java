package com.poc.springbootjdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringbootjdbcexampleApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcexampleApplication.class, args);
		System.out.println("hi");
		
		
		
	}
	
	public static void main1(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/world"; // URL of the database
        String user = "root"; // MySQL username
        String password = "1234"; // MySQL password
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("does this work");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
	}
	
	

	@Override
	public void run(String... args) throws Exception {

		multiselect(jt);



	}

	private static void multiselect(JdbcTemplate jt) {

		int pincode=4;
		List<CUser> l =null;
		String sql ="select username,password, email, pincode from cuser  where pincode=?";
		Object params[]= {pincode};
		BeanPropertyRowMapper<CUser> rw = BeanPropertyRowMapper.newInstance(CUser.class);




		try {
			l = jt.query(sql, params,rw);//in case you get multiple rows..
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("where codntion failed exception has ocured");
			l=new ArrayList<>();
		}
		System.out.println(l);



	}

	private static  void singleSelectComamnd(JdbcTemplate jt)
	{


		String userid="D";
		CUser user=null;
		String sql ="select username,password, email, pincode from cuser  where username=?";
		Object params[]= {userid};
		BeanPropertyRowMapper<CUser> rw = BeanPropertyRowMapper.newInstance(CUser.class);
		try {
			user = jt.queryForObject(sql, params,rw);
			System.out.println("details got " + user);

		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("where codntion failed exception has ocured");
			e.printStackTrace();
			user =new CUser("","","",0);
		}




	}

	private static void insertCommand(JdbcTemplate jt) {
		{
			try {
				CUser user = new CUser("ABC", "B", "C", 4);
				String sql = "insert into cuser( username,password,email,pincode) values (?,?,?,?)";
				Object params[] = {user.getUsername(), user.getPassword(), user.getEmail(), user.getPincode()};


				int ra = jt.update(sql, params);
				System.out.println("insert successful");

			}catch(DuplicateKeyException e)
			{
				System.out.println("later on we will think in architecture what to do with this");
			}
			catch(CannotGetJdbcConnectionException e)
			{
				System.out.println("database itself in entertainment mode..");
			}





		}

















	}
}
