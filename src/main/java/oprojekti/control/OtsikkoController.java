package oprojekti.control;

import oprojekti.bean.Otsikko;
import oprojekti.bean.OtsikkoImpl;
import oprojekti.dao.OtsikkoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

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
    @RequestMapping (value ="id", method = RequestMethod.GET)
    public String create(@ModelAttribute(value = "otsikko") OtsikkoImpl otsikko){
        dao.lisaaOtsikko(otsikko);
        return "redirect:/otsikko/" + otsikko.getId();
    }
    // Näyttö
    @RequestMapping (value = "id", method = RequestMethod.GET)
    public String getView(@PathVariable Integer id, Model model){
        List<Otsikko> otsikko = dao.haeKaikki();
        model.addAttribute("otsikko", otsikko);
        return "secure/view";
    }
}
