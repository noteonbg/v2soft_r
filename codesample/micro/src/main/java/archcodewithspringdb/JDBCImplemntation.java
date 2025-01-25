package archcodewithspringdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
public class JDBCImplemntation implements DAOInterface {
	
	private Connection con;
	
	@Autowired
	private JdbcTemplate t;
	
	public void f1()
	{
		System.out.println("t is "  + (t!=null));
		
	}
	
	
	
	
	

	@Override
	public void registerUserInDb(CUser user) throws DuplicateUserException {
		
		
		}
		
		
		



	@Override
	public CUser getUserDetailsFromDb(String userid) {
		
		
		return null;
	}

	@Override
	public boolean updateDetailsInDb(CUser user) {
		// TODO Auto-generated method stub
		boolean updated = false;
		return updated;
			}

	@Override
	public boolean removeUserInDb(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CUser> getAllUsersFromDBBasedonPincode(int pincode) {
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


	@Override
	public void releaseDb() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
