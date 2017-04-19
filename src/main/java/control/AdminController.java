package control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bferr on 19.4.2017.
 */
@Controller
@RequestMapping(value="/secure/admin")
public class AdminController {

    @RequestMapping(value = "/tools", method = RequestMethod.GET)
    public String paasivu(Model model) {
        return "secure/admin/tools";
    }
}
