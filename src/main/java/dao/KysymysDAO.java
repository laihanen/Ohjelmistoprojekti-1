package dao;

import java.util.List;
import bean.Kysymys;
/**
 * Created by bferr on 19.4.2017.
 */
public interface KysymysDAO {

    public abstract void lisaaKysymys(Kysymys kysymys);

    public abstract List<Kysymys> haeKaikki();
}
