package oprojekti.dao;

import oprojekti.bean.Kysymys;
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
 * Created by bferr on 19.4.2017.
 */
@Repository
public class KysymysSpring implements KysymysDAO{

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void lisaaKysymys(Kysymys t){

        final String sql = "insert into kysymys(otsikko, kysymysteksti) values(?,?)";
        final String otsikko = t.getOtsikko();
        final String teksti = t.getKysymysteksti();

        KeyHolder idHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pre = con.prepareStatement(sql, new String[]{"id"});
                pre.setString(1, otsikko);
                pre.setString(2, teksti);
                return pre;
            }
        }, idHolder);
        t.setId(idHolder.getKey().intValue());
    }

    public void poista(int id){

        String sql = "delete from kysymys where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public List<Kysymys> haeKaikki(){

        String sql = "select id, otsikko, kysymysteksti from kysymys";
        RowMapper<Kysymys> mapper = new KysymysRowMapper();
        List<Kysymys> kysymykset = jdbcTemplate.query(sql, mapper);
        return kysymykset;
    }
}
