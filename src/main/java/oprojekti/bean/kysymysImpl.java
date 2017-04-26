package oprojekti.bean;


import javax.validation.constraints.Size;

/**
 * Created by bferr on 12.4.2017.
 */
public class KysymysImpl implements Kysymys {

    private int id;

    @Size(min = 1, max = 255)
    private String otsikko;

    @Size(min = 1, max = 255)
    private String kysymysteksti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOtsikko() {
        return otsikko;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    @Override
    public String toString() {
        return "KysymysImpl{" +
                "id=" + id +
                ", otsikko='" + otsikko + '\'' +
                ", kysymysteksti='" + kysymysteksti + '\'' +
                '}';
    }
}
