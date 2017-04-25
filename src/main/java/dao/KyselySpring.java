package dao;

import bean.Kysely;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Iiro on 20.4.2017.
 */
@Repository
public class KyselySpring implements KyselyDAO {

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void lisaaKysely(Kysely k){

        final String sql = "insert into kysely(nimi, luojanimi) values(?)";
        final String nimi = k.getNimi();
        final String luojanimi = k.getLuojaNimi();

        KeyHolder idHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pre = con.prepareStatement(sql, new String[]{"id"});
                pre.setString(1, nimi);
                pre.setString(1, luojanimi);
                return pre;
            }
        }, idHolder);
        k.setId(idHolder.getKey().intValue());
    }

    public void poista(int id){

        String sql = "delete from kysely where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }


    public List<Kysely> haeOmat(String luojaNimi){
        String sql = "select * from kysely where luojanimi = ?";
        Object[] parametrit = new Object[] {luojaNimi};
        RowMapper<Kysely> mapper = new KyselyRowMapper();
        List<Kysely> kyselyt = jdbcTemplate.query(sql, mapper);

        return kyselyt;
    }


    public List<Kysely> haeKaikki(){

    }
}
