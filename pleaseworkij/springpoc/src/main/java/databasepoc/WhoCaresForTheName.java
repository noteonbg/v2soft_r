package databasepoc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WhoCaresForTheName implements RowMapper<CUser> {
    @Override
    public CUser mapRow(ResultSet rs, int rowNum) throws SQLException {
        CUser user =new CUser();
        //user.setUsername(rs.getString(""));
        return user;
    }
}
