package databasepoc;

import com.mysql.cj.jdbc.Driver;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SpringJDBC {

    public static void main(String[] args) {

        JdbcTemplate jt =new JdbcTemplate();
        String url ="jdbc:mysql://localhost:3306/world";
        String userid="root";
        String password="1234";
        try {
            Driver d =new Driver();
            SimpleDriverDataSource sd =
                    new SimpleDriverDataSource(d,url,userid,password);
            jt.setDataSource(sd);
            System.out.println("is it still working");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        insertCommand(jt);
        //singleSelectComamnd(jt);
        multiselect(jt);






    }

    private static void multiselect(JdbcTemplate jt) {

        int pincode=4;
        List<CUser> l =null;
        String sql ="select username,password, email, pincode from cuser  where pincode=?";
        Object params[]= {pincode};
        BeanPropertyRowMapper<CUser> rw = BeanPropertyRowMapper.newInstance(CUser.class);

        RowMapper<CUser> x =new WhoCaresForTheName();


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
