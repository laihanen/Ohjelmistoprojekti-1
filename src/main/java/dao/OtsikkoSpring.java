package dao;

import bean.Otsikko;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * Created by bferr on 20.4.2017.
 */
@Repository
public class OtsikkoSpring implements OtsikkoDAO {

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public void lisaaOtsikko(Otsikko t){

        final String sql = "insert into otsikko(otsikko) values (?)";
        final String otsikko = t.getOtsikko();

        KeyHolder idHolder = new GeneratedKeyHolder();
    }


}
