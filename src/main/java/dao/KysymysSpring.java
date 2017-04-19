package dao;

import bean.Kysymys;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

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

    public void lisaakysymys(Kysymys t){

        final String sql = "insert into kysymys(otsikko, kysymysteksti) values(?,?)";
        final String otsikko = t.getOtsikko();
        final String teksti = t.getKysymysteksti();

        KeyHolder idHolder = GeneratedKeyHolder();

    }

    public List<Kysymykset> haeKaikki(){

        String sql = "select id, otsikko, kysymysteksti from kysymys";
        RowMapper<Kysymykset> mapper = new KysymyksetRowMapper();
        List<Kysymys> kysymykset = jdbcTemplate.query(sql, mapper);
        return kysymykset;
    }
}
