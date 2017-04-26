package oprojekti.dao;

import oprojekti.bean.Kysymys;

import java.util.List;
/**
 * Created by bferr on 19.4.2017.
 */
public interface KysymysDAO {

    public abstract void lisaaKysymys(Kysymys kysymys);

    public abstract void poista(int id);

    public abstract List<Kysymys> haeKaikki();
}
