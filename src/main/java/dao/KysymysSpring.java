package dao;

import bean.Kysymys;

/**
 * Created by bferr on 19.4.2017.
 */
public class KysymysSpring {



    public void lisaakysymys(Kysymys t){

        final String sql = "insert into kysymys(otsikko, kysymysteksti) values(?,?)";

        final String otsikko = t.getOtsikko();
        final String teksti = t.getKysymysteksti();

    }

    public  haeKysymys(){
        
    }
}
