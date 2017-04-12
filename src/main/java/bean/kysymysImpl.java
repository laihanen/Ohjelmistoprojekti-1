package bean;


import javax.validation.constraints.Size;

/**
 * Created by bferr on 12.4.2017.
 */
public class kysymysImpl {

    private int id;

    @Size(min = 1, max = 255)
    private String kysymysNimi;
    
    @Size(min = 1, max = 255)
    private String kysymysTeksti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKysymysNimi() {
        return kysymysNimi;
    }

    public void setKysymysNimi(String kysymysNimi) {
        this.kysymysNimi = kysymysNimi;
    }

    public String getKysymysTeksti() {
        return kysymysTeksti;
    }

    public void setKysymysTeksti(String kysymysTeksti) {
        this.kysymysTeksti = kysymysTeksti;
    }

    @Override
    public String toString() {
        return "kysymysImpl{" +
                "id=" + id +
                ", kysymysNimi='" + kysymysNimi + '\'' +
                ", kysymysTeksti='" + kysymysTeksti + '\'' +
                '}';
    }
}
