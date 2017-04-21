package dao;


import bean.Kysely;
import bean.KyselyImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Iiro on 20.4.2017.
 */
public class KyselyRowMapper implements RowMapper<Kysely> {

    public Kysely mapRow(ResultSet rs, int rowNum) throws SQLException{
        Kysely m = new KyselyImpl();
        m.setId(rs.getInt("id"));
        m.setNimi(rs.getString("nimi"));

        return m;
    }
}
