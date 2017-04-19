package control;

import bean.Kysymys;
import bean.KysymysImpl;
import dao.KysymysDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;


/**
 * Created by bferr on 19.4.2017.
 */

@Controller
@RequestMapping(value="/secure")
public class KysymysController {

    @Inject KysymysDAO dao;

    public KysymysDAO getDao(){
        return dao;
    }

    public void setDao(KysymysDAO dao){
        this.dao = dao;
    }

    // Form luominen

    @RequestMapping (value="id", method= RequestMethod.GET)
    public String getCreateForm(Model model){
        Kysymys tyhjaKysymys = new KysymysImpl();
        tyhjaKysymys.setOtsikko("oletusotsikko");
        model.addAttribute("kysymys", tyhjaKysymys);
        return "secure/add";
    }

    // Form tiedon vastaanotto
    @RequestMapping (value="id", method= RequestMethod.GET)
        public String create(@ModelAttribute(value="kysymys") KysymysImpl kysymys){
        dao.lisaaKysymys(kysymys);
        return "redirect:/kysymys/" + kysymys.getId();
    }

    // Tietojen näyttö
}
