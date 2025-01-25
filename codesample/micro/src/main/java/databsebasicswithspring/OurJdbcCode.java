package databsebasicswithspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



@Component
public class OurJdbcCode {
	
	private JdbcTemplate t;

	@Autowired
	public void setT(JdbcTemplate t) {
		System.out.println("JDbc template wired");
		this.t = t;
	}
	
	public void insert()
	{
		CUser x =new CUser("pqr","ijk","pqr@ijk",01); //assume this
		//came from service..
		String sql ="insert into cuser( username,password,email,pincode) values (?,?,?,?)";
		
		Object[] array= {x.getUsername(),x.getPassword(),x.getEmail(),x.getPincode()};
		
		int row = t.update(sql,array);
		
		

		
		
		
		
	}
	
	public void singleselect()
	{
		
		CUser x =null;
		String userid="pqr";
		String sql ="select username,password, email, pincode from cuser  where username=?";
		Object[] params = { userid };
		BeanPropertyRowMapper<CUser>
		pqr =new BeanPropertyRowMapper<CUser>(CUser.class);
		try {
			 x = t.queryForObject(sql, params,pqr);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			x=new CUser("","", "", 0);
		}
		System.out.println("results are " + x.getPincode());
		
		
		
		
		
	}

	public void multiSelect() {
		// TODO Auto-generated method stub
		List<CUser> l =new ArrayList<>();
		int pincode=4;
		String sql ="select username,password, email,  pincode from cuser where pincode=?";
		Object[]  params= {pincode};
		BeanPropertyRowMapper<CUser>
		pqr =new BeanPropertyRowMapper<CUser>(CUser.class);
		try {
			 l = t.query(sql, params,pqr);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(l.size());
	}
	
	
	
	
	
	
}
