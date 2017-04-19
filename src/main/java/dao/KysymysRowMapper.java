package dao;

import bean.Kysymys;
import bean.KysymysImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Iiro on 19.4.2017.
 */
public class KysymysRowMapper implements RowMapper<Kysymys> {

    public Kysymys mapRow(ResultSet rs, int rowNum) throws SQLException{
        Kysymys m = new KysymysImpl();
        m.setId(rs.getInt("id"));
        m.setOtsikko(rs.getString("otsikko"));
        m.setKysymysteksti(rs.getString("kysymysteksti"));

        return m;
    }
}
