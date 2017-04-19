package bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 19.4.2017.
 */
public class KyselyImpl {

    private int id;

    @Size(min = 1, max = 255)
    private String nimi;


}
