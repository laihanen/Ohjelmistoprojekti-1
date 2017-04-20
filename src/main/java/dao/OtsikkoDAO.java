package dao;

import bean.Otsikko;

import java.util.List;

/**
 * Created by bferr on 20.4.2017.
 */
public interface OtsikkoDAO {

    public abstract void lisaaOtsikko(Otsikko otsikko);

    public abstract void poista(int id);

    public abstract List<Otsikko> haeKaikki();
}
