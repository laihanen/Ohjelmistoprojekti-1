package dao;

import java.util.List;
import bean.Kysymys;
/**
 * Created by bferr on 19.4.2017.
 */
public interface KysymysDAO {

    public abstract void tallenna(Kysymys kysymys);

    public abstract Kysymys etsi(int id);

    public abstract List<Kysymykset> haeKaikki();
}
