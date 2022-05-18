package com.jaisoft.thymleaf;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hola(Model modelo) {
        modelo.addAttribute("message","Hello from thymeleaf");
        return "hello";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public ModelAndView method() {
        return new ModelAndView("redirect:" + "http://localhost:8081/hello");
    }
}
