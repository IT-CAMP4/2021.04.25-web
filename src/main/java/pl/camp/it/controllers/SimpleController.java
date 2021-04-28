package pl.camp.it.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String metoda1() {
        return "main";
    }

    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public String metoda2() {
        return "contact";
    }
}
