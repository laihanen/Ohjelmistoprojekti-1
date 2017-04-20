package bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 20.4.2017.
 */
public class OtsikkoImpl {

    private int id;

    @Size(min = 1, max = 255)
    private String otsikko;

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

    @Override
    public String toString() {
        return "OtsikkoImpl{" +
                "id=" + id +
                ", otsikko='" + otsikko + '\'' +
                '}';
    }
}
