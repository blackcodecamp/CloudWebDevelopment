package io.mycontact.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String  index() {
        return "views/index";
    }
    @RequestMapping({"home", "/home.tpl"})
    public ModelAndView home(){
        return new ModelAndView("views/home");
    }
}
