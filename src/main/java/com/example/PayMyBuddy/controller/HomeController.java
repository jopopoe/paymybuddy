package com.example.PayMyBuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView home(@RequestParam(value = "nom", required = false, defaultValue = "Guest") String nom, ModelAndView mv) {
        mv.setViewName("home");
        mv.addObject("nom", nom);
        return mv;
    }

    @RequestMapping(value = "/inscription")
    public ModelAndView inscription(ModelAndView mv) {
        mv.setViewName("inscription");
        return mv;
    }


}
