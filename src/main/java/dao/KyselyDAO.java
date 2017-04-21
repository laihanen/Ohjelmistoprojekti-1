package dao;

import bean.Kysely;

import java.util.List;

/**
 * Created by Iiro on 20.4.2017.
 */
public interface KyselyDAO {

    public abstract void lisaaKysely(Kysely kysely);

    public abstract void poista(int id);

    public abstract List<Kysely> haeKysely();
}
