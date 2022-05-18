package com.jaisoft.freemaker;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value="/hello", method= RequestMethod.GET ,produces = "text/html")
    public String hola(Model modelo) {
        modelo.addAttribute("message","Hello from thymeleaf 2");
        return "hello";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public ModelAndView method() {
        return new ModelAndView("redirect:" + "http://localhost:8080/hello");
    }
}
