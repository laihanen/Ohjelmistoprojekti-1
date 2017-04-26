package oprojekti.bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 19.4.2017.
 */
public class KyselyImpl implements Kysely {

    private int id;

    @Size(min = 1, max = 255)
    private String nimi;

    @Size(min = 1, max = 255)
    private String luojaNimi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }


    public String getLuojaNimi() {
        return luojaNimi;
    }

    public void setLuojaNimi(String luoja) {
        this.luojaNimi = luojaNimi;
    }

    @Override
    public String toString() {
        return "KyselyImpl{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", luoja='" + luojaNimi + '\'' +
                '}';
    }
}
