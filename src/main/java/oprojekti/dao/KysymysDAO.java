package oprojekti.dao;

import java.util.List;
import oprojekti.bean.Kysymys;
/**
 * Created by bferr on 19.4.2017.
 */
public interface KysymysDAO {

    public abstract void lisaaKysymys(Kysymys kysymys);

    public abstract void poista(int id);

    public abstract List<Kysymys> haeKaikki();
}
