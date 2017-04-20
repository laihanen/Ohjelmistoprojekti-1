package control;

import bean.Otsikko;
import bean.OtsikkoImpl;
import dao.OtsikkoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Created by bferr on 20.4.2017.
 */
@Controller
@RequestMapping
public class OtsikkoController {

    @Inject
    OtsikkoDAO dao;

    public OtsikkoDAO getDao(){return dao;}

    public void setDao(OtsikkoDAO dao){this.dao = dao;}

    @RequestMapping (value ="id", method = RequestMethod.GET)
    public String getCreateForm(Model model){
        Otsikko tyhjaOtsikko = new OtsikkoImpl();
        tyhjaOtsikko.setOtsikko("oletusotsikko");
        model.addAttribute("otsikko", tyhjaOtsikko);
        return "secure/add";
    }

    // Vastaanotto

    // Näyttö

}
