package daolayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jdbcpoc.CUser;

@Repository
public class SpringJDBCDAO {
	
	
	@Autowired
	private JdbcTemplate t;
	//wirte jdbcb tempalte object, spring is asking
	//when did you say me create a jdbc template objectx
	//you also did not create any jdbc template object and gave
	//it to me..
	
	
	public SpringJDBCDAO()
	{
		System.out.println("dao object created");
	}
	
	public void f1()
	{
		System.out.println(t !=null  );
	}

	public void insertLogic(CUser user) throws DataAccessException{
		// TODO Auto-generated method stub
		String sql ="insert into cuser( username,password,email,pincode) values (?,?,?,?)";
		Object params[]= { user.getUsername(),user.getPassword(),user.getEmail(),user.getPincode()};
		int ra = t.update(sql,params);
				
		
	}

	public boolean updateLogic(CUser user) {
		// TODO Auto-generated method stub
		boolean updated = false;
		String sql ="update  cuser set password =?,email=?,pincode=?  where username=?";
		Object params[]= {user.getPassword(),user.getEmail(),user.getPincode(),user.getUsername()};
		int ra = t.update(sql,params);
		if( ra > 0)
			updated=true;
		return updated;
		
		
		
		
		
	}

	public CUser getUserDetails(String userid) {
		// TODO Auto-generated method stub
		CUser user=null;
		String sql ="select username,password, email, pincode from cuser  where username=?";
		Object params[]= {userid};
		BeanPropertyRowMapper<CUser> rw = BeanPropertyRowMapper.newInstance(CUser.class);
		try {
			user = t.queryForObject(sql, params,rw);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("where codntion failed exception has ocured");
			user =new CUser("","","",0);
		}
		return user;
	}

	public List<CUser> getMultiple(int pincode) {
		// TODO Auto-generated method stub
		List<CUser> l ;
		String sql ="select username,password, email, pincode from cuser  where pincode=?";
		Object params[]= {pincode};
		BeanPropertyRowMapper<CUser> rw = BeanPropertyRowMapper.newInstance(CUser.class);
		try {
			l = t.query(sql, params,rw);//in case you get multiple rows..
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("where codntion failed exception has ocured");
			l=new ArrayList<>();
		}
		return l;
	}

}





