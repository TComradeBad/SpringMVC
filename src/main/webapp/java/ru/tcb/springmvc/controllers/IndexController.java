package ru.tcb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView actionIndex() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("message","Hello Dude");
        return view;
    }
}
