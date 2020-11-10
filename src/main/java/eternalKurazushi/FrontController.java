package eternalKurazushi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String getResult() {
        return "result";
    }
}
