package com.projeto.portifolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    

    @GetMapping("/")
    public ModelAndView home(){

        ModelAndView mv = new ModelAndView("public/home");

        return mv;
    }

    @GetMapping("sobre")
    public ModelAndView sobre(){

        ModelAndView mv = new ModelAndView("public/sobre");


        return mv;
    }


}
