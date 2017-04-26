package oprojekti.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Iiro on 19.4.2017.
 */

@Controller
@RequestMapping(value = "/secure")
public class SecureController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String paasivu(Model model){
        return "secure/main";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String lisaasivu(Model model){
        return "secure/add";
    }

}
